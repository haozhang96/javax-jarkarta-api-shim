package javax.shim;

import java.io.Serializable;
import java.util.Objects;

/**
 * @deprecated Use {@link jakarta} instead.
 * @since Jakarta EE Platform 8
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
    // Delegates
    //==================================================================================================================

    /**
     * @deprecated Use {@link jakarta} instead.
     * @since Jakarta EE Platform 8
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
    }

    /**
     * @deprecated Use {@link jakarta} instead.
     * @since Jakarta EE Platform 8
     */
    @Deprecated(since = "jakarta")
    abstract class Annotation<A extends java.lang.annotation.Annotation> extends Delegate<A> implements java.lang.annotation.Annotation {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        protected Annotation(A delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Annotation Implementation Methods
        //==============================================================================================================

        @Override
        public final Class<? extends java.lang.annotation.Annotation> annotationType() {
            return delegate.annotationType();
        }
    }
}
