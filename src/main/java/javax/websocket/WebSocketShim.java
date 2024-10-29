package javax.websocket;

import javax.shim.Shim;
import java.lang.annotation.Annotation;
import java.util.Map;
import java.util.stream.Stream;

/**
 * @deprecated Use {@link jakarta.websocket} instead.
 */
@Deprecated(since = "jakarta.websocket")
public interface WebSocketShim extends Shim {
    //==================================================================================================================
    // Factory Methods
    //==================================================================================================================

    static <S extends WebSocketShim> S of(Object object) {
        //==============================================================================================================
        // Specializations
        //==============================================================================================================

        if (object == null || object instanceof WebSocketShim) {
            return S(object);
        } else if (object instanceof Exception) {
            return S(of((Exception) object));
        } else if (object instanceof Annotation) {
            return S(of((Annotation) object));

        //==============================================================================================================
        // Core
        //==============================================================================================================

        } else if (object instanceof jakarta.websocket.WebSocketContainer) {
            return S(new Facades.WebSocketContainer(S(object)));

        //==============================================================================================================
        // Others
        //==============================================================================================================

        }

        throw new UnsupportedOperationException("Unknown type: " + object.getClass().getName());
    }

    static <S extends WebSocketShim> Class<? extends S> of(Class<S> shimType, Class<?> interfaceType) {
        return Shim.of(shimType, interfaceType);
    }

    static <S extends WebSocketShim> Stream<S> of(Object[] objects) {
        return Shim.of(WebSocketShim::of, objects);
    }

    static <S extends WebSocketShim> Stream<S> of(Iterable<?> objects) {
        return Shim.of(WebSocketShim::of, objects);
    }

    static <K, S extends WebSocketShim> Map<K, S> of(Map<? extends K, ?> map) {
        return Shim.of(WebSocketShim::of, map);
    }

    static <S extends Exception & WebSocketShim> S of(Exception exception) {
        if (exception == null || exception instanceof WebSocketShim) {
            return S(exception);
        } else if (exception instanceof jakarta.websocket.DecodeException) {
            return S(new Facades.DecodeException(S(exception)));
        } else if (exception instanceof jakarta.websocket.DeploymentException) {
            return S(new Facades.DeploymentException(S(exception)));
        } else if (exception instanceof jakarta.websocket.EncodeException) {
            return S(new Facades.EncodeException(S(exception)));
        } else if (exception instanceof jakarta.websocket.SessionException) {
            return S(new Facades.SessionException(S(exception)));
        }

        throw new UnsupportedOperationException("Unknown exception type: " + exception.getClass().getName());
    }

    //==================================================================================================================
    // Private Helper Methods
    //==================================================================================================================

    private static <S extends Annotation> S of(Annotation annotation) {
        if (annotation == null || annotation instanceof WebSocketShim) {
            return S(annotation);
        } else if (annotation instanceof jakarta.websocket.ClientEndpoint) {
            return S(new Facades.ClientEndpoint(S(annotation)));
        } else if (annotation instanceof jakarta.websocket.OnClose) {
            return S(new Facades.OnClose(S(annotation)));
        } else if (annotation instanceof jakarta.websocket.OnError) {
            return S(new Facades.OnError(S(annotation)));
        } else if (annotation instanceof jakarta.websocket.OnMessage) {
            return S(new Facades.OnMessage(S(annotation)));
        } else if (annotation instanceof jakarta.websocket.OnOpen) {
            return S(new Facades.OnOpen(S(annotation)));
        } else if (annotation instanceof jakarta.websocket.server.PathParam) {
            return S(new Facades.PathParam(S(annotation)));
        } else if (annotation instanceof jakarta.websocket.server.ServerEndpoint) {
            return S(new Facades.ServerEndpoint(S(annotation)));
        }

        throw new UnsupportedOperationException("Unknown annotation type: " + annotation.annotationType().getName());
    }

    @SuppressWarnings("unchecked")
    private static <S> S S(Object object) {
        return (S) object;
    }
}
