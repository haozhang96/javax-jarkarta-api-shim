package javax.shim;

import java.io.Serializable;
import java.util.Collection;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collector;
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
    // Helper Methods
    //==================================================================================================================

    @SafeVarargs
    static <T, S> S[] of(
        Function<? super T, ? extends S> shimFactory,
        IntFunction<S[]> arrayGenerator,
        T... objects
    ) {
        return Stream
            .of(objects)
            .map(shimFactory)
            .toArray(arrayGenerator);
    }

    static <T, S, C> C of(
        Function<? super T, ? extends S> shimFactory,
        Collector<? super S, ?, ? extends C> collector,
        Iterable<? extends T> objects
    ) {
        final var stream =
            objects instanceof Collection<?>
                ? ((Collection<? extends T>) objects).stream()
                : StreamSupport.stream(objects.spliterator(), false);
        return stream
            .map(shimFactory)
            .collect(collector);
    }

    //==================================================================================================================
    // Delegate
    //==================================================================================================================

    /**
     * @deprecated Use {@link jakarta} instead.
     */
    @Deprecated(since = "jakarta")
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

        /**
         * @deprecated Use {@link jakarta} instead.
         */
        @Deprecated(since = "jakarta")
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
