package javax.interceptor;

import javax.Shim;
import java.util.stream.Stream;

/**
 * @deprecated Use {@link jakarta.interceptor} instead.
 */
@Deprecated(since = "jakarta.interceptor")
public interface InterceptorShim extends Shim {
    //==================================================================================================================
    // Factory Methods
    //==================================================================================================================

    static <S> S of(Object object) {
        if (object == null || object instanceof InterceptorShim) {
            return S(object);
        } else if (object instanceof jakarta.interceptor.AroundConstruct) {
            return S(new Facades.AroundConstruct(S(object)));
        } else if (object instanceof jakarta.interceptor.AroundInvoke) {
            return S(new Facades.AroundInvoke(S(object)));
        } else if (object instanceof jakarta.interceptor.AroundTimeout) {
            return S(new Facades.AroundTimeout(S(object)));
        } else if (object instanceof jakarta.interceptor.ExcludeClassInterceptors) {
            return S(new Facades.ExcludeClassInterceptors(S(object)));
        } else if (object instanceof jakarta.interceptor.ExcludeDefaultInterceptors) {
            return S(new Facades.ExcludeDefaultInterceptors(S(object)));
        } else if (object instanceof jakarta.interceptor.Interceptor) {
            return S(new Facades.Interceptor(S(object)));
        } else if (object instanceof jakarta.interceptor.Interceptor.Priority) {
            return S(new Facades.Interceptor$Priority(S(object)));
        } else if (object instanceof jakarta.interceptor.InterceptorBinding) {
            return S(new Facades.InterceptorBinding(S(object)));
        } else if (object instanceof jakarta.interceptor.Interceptors) {
            return S(new Facades.Interceptors(S(object)));
        } else if (object instanceof jakarta.interceptor.InvocationContext) {
            return S(new Facades.InvocationContext(S(object)));
        }

        throw new UnsupportedOperationException("Unknown type: " + object.getClass().getName());
    }

    static <S> Class<? extends S> of(Class<S> shimType, Class<?> interfaceType) {
        return Shim.of(shimType, interfaceType);
    }

    static <S> Stream<S> of(Object[] objects) {
        return Shim.of(InterceptorShim::of, objects);
    }

    static <S> Stream<S> of(Iterable<?> objects) {
        return Shim.of(InterceptorShim::of, objects);
    }

    //==================================================================================================================
    // Private Helper Methods
    //==================================================================================================================

    @SuppressWarnings("unchecked")
    private static <S> S S(Object object) {
        return (S) object;
    }
}
