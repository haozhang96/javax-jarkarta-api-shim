package javax.shim;

import java.io.Serializable;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Proxy;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * @deprecated Use {@link jakarta} instead.
 */
@Deprecated(since = "jakarta")
public interface Shim {
    //==================================================================================================================
    // Object Implementation Methods
    //==================================================================================================================

    @Override
    boolean equals(Object other);

    @Override
    int hashCode();

    @Override
    String toString();

    //==================================================================================================================
    // Helpers
    //==================================================================================================================

    static <S extends Shim> Class<? extends S> of(Class<S> shimType, Class<?> interfaceType) {
        if (shimType.isAssignableFrom(interfaceType)) {
            return interfaceType.asSubclass(shimType);
        }

        return Proxy
            .getProxyClass(MethodHandles.lookup().lookupClass().getClassLoader(), shimType, interfaceType)
            .asSubclass(shimType);
    }

    static <S extends Shim> Stream<S> of(Function<Object, ? extends S> shimFactory, Object[] objects) {
        return Stream
            .of(objects)
            .map(shimFactory);
    }

    static <S extends Shim> Stream<S> of(Function<Object, ? extends S> shimFactory, Iterable<?> objects) {
        final var stream =
            objects instanceof Collection<?>
                ? ((Collection<?>) objects).stream()
                : StreamSupport.stream(objects.spliterator(), false);
        return stream.map(shimFactory);
    }

    static <K, S extends Shim> Map<K, S> of(Function<Object, ? extends S> shimFactory, Map<? extends K, ?> map) {
        return map
            .entrySet()
            .stream()
            .collect(Collectors.toMap(Map.Entry::getKey, shimFactory.compose(Map.Entry::getValue)));
    }

    abstract class Delegate<T> implements Shim, Serializable {
        protected final T delegate; // Conditionally serializable

        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        protected Delegate(T delegate) {
            this.delegate = Objects.requireNonNull(delegate);
        }

        //==============================================================================================================
        // Object Implementation Methods
        //==============================================================================================================

        @Override
        @SuppressWarnings("EqualsWhichDoesntCheckParameterClass")
        public final boolean equals(Object other) {
            return delegate.equals(other);
        }

        @Override
        public final int hashCode() {
            return delegate.hashCode();
        }

        @Override
        public final String toString() {
            return delegate.toString();
        }

        //==============================================================================================================
        // Annotation-specific Delegate
        //==============================================================================================================

        public abstract static class Annotation<A extends java.lang.annotation.Annotation> extends Delegate<A> implements java.lang.annotation.Annotation {
            //==========================================================================================================
            // Constructors
            //==========================================================================================================

            protected Annotation(A delegate) {
                super(delegate);
            }

            //==========================================================================================================
            // Annotation Implementation Methods
            //==========================================================================================================

            @Override
            public final Class<? extends java.lang.annotation.Annotation> annotationType() {
                return delegate.annotationType();
            }
        }
    }
}
