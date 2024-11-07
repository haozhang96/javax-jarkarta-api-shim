package javax;

import java.io.Serializable;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;
import java.util.Objects;
import java.util.function.Function;
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

    static <S> Class<? extends S> of(Class<S> shimType, Class<?> interfaceType) {
        if (shimType.isAssignableFrom(interfaceType)) {
            return interfaceType.asSubclass(shimType);
        }

        return Proxy
            .getProxyClass(MethodHandles.lookup().lookupClass().getClassLoader(), shimType, interfaceType)
            .asSubclass(shimType);
    }

    static <S> Stream<S> of(Function<Object, ? extends S> shimFactory, Object[] objects) {
        return Stream
            .of(objects)
            .map(shimFactory);
    }

    static <S> Stream<S> of(Function<Object, ? extends S> shimFactory, Iterable<?> objects) {
        final var stream =
            objects instanceof Collection<?>
                ? ((Collection<?>) objects).stream()
                : StreamSupport.stream(objects.spliterator(), false);
        return stream.map(shimFactory);
    }

    //==================================================================================================================
    // Delegates
    //==================================================================================================================

    /**
     * @deprecated Use {@link jakarta} instead.
     */
    @Deprecated(since = "jakarta")
    abstract class Delegate<T> implements Shim, Serializable, Cloneable {
        private static final StackWalker STACK_WALKER = StackWalker.getInstance();
        private static final Method FINALIZER = getFinalizer();

        protected final T delegate; // Conditionally serializable

        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        protected Delegate(T delegate) {
            this.delegate = Objects.requireNonNull(delegate);
            printEntryPoint();
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

        @Override
        @SuppressWarnings("unchecked")
        protected final Delegate<T> clone() {
            try {
                return getClass().cast(super.clone());
            } catch (CloneNotSupportedException exception) {
                // This should never happen.
                throw new InternalError(exception);
            }
        }

        @Override
        @SuppressWarnings("deprecation")
        protected final void finalize() throws Throwable {
            try {
                if (FINALIZER != null) {
                    FINALIZER.invoke(delegate);
                }
            } finally {
                super.finalize();
            }
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

        //==============================================================================================================
        // Private Helper Methods
        //==============================================================================================================

        private void printEntryPoint() {
            STACK_WALKER.walk(stackFrames ->
                stackFrames
                    .dropWhile(stackFrame -> stackFrame.getClassName().startsWith("javax."))
                    .findFirst()
            ).ifPresent(stackFrame ->
                System
                    .getLogger(delegate.getClass().getName())
                    .log(System.Logger.Level.INFO, stackFrame)
            );
        }

        private static Method getFinalizer() {
            try {
                final var finalizer = Object.class.getDeclaredMethod("finalize");
                return finalizer.trySetAccessible() ? finalizer : null;
            } catch (NoSuchMethodException exception) {
                // This should never happen.
                throw new InternalError(exception);
            }
        }
    }
}
