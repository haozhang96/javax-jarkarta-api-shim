package javax.transaction;

import javax.Shim;
import java.lang.annotation.Annotation;
import java.util.stream.Stream;

/**
 * @deprecated Use {@link jakarta.transaction} instead.
 */
@Deprecated(since = "jakarta.transaction")
public interface TransactionShim extends Shim {
    //==================================================================================================================
    // Factory Methods
    //==================================================================================================================

    @SuppressWarnings("rawtypes")
    static <S> S of(Object object) {
        //==============================================================================================================
        // Specializations
        //==============================================================================================================

        if (object == null || object instanceof TransactionShim) {
            return S(object);
        } else if (object instanceof Exception) {
            return S(of((Exception) object));
        } else if (object instanceof Enum<?>) {
            return S(of((Enum) object));
        } else if (object instanceof Annotation) {
            return S(of((Annotation) object));

        //==============================================================================================================
        // Core
        //==============================================================================================================


        //==============================================================================================================
        // Others
        //==============================================================================================================

        }

        throw new UnsupportedOperationException("Unknown type: " + object.getClass().getName());
    }

    static <S extends Exception> S of(Exception exception) {
        if (exception == null || exception instanceof TransactionShim) {
            return S(exception);
        }

        throw new UnsupportedOperationException("Unknown exception type: " + exception.getClass().getName());
    }

    static <S> Class<? extends S> of(Class<S> shimType, Class<?> interfaceType) {
        return Shim.of(shimType, interfaceType);
    }

    static <S> Stream<S> of(Object[] objects) {
        return Shim.of(TransactionShim::of, objects);
    }

    static <S> Stream<S> of(Iterable<?> objects) {
        return Shim.of(TransactionShim::of, objects);
    }

    //==================================================================================================================
    // Private Helper Methods
    //==================================================================================================================

    private static <S extends Enum<S>> S of(Enum<?> enumeration) {
        if (enumeration == null || enumeration instanceof TransactionShim) {
            return S(enumeration);
        }

        throw new UnsupportedOperationException("Unknown enumeration type: " + enumeration.getClass().getName());
    }

    private static <S extends Annotation> S of(Annotation annotation) {
        if (annotation == null || annotation instanceof TransactionShim) {
            return S(annotation);
        }

        throw new UnsupportedOperationException("Unknown annotation type: " + annotation.annotationType().getName());
    }

    @SuppressWarnings("unchecked")
    private static <S> S S(Object object) {
        return (S) object;
    }
}
