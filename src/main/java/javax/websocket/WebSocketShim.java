package javax.websocket;

import javax.servlet.ServletShim;
import javax.shim.Shim;
import java.lang.annotation.Annotation;
import java.util.function.IntFunction;
import java.util.stream.Collector;

/**
 * @deprecated Use {@link jakarta.websocket} instead.
 */
@Deprecated(since = "jakarta.websocket")
public interface WebSocketShim extends Shim {
    //==================================================================================================================
    // Factory Methods
    //==================================================================================================================

    static <T, S> S of(T object) {
        //==============================================================================================================
        // Specializations
        //==============================================================================================================

        if (object instanceof WebSocketShim) {
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

    @SafeVarargs
    static <T, S> S[] of(IntFunction<S[]> arrayGenerator, T... objects) {
        return Shim.of(WebSocketShim::of, arrayGenerator, objects);
    }

    static <T, S, C> C of(Collector<? super S, ?, ? extends C> collector, Iterable<? extends T> objects) {
        return Shim.of(WebSocketShim::of, collector, objects);
    }

    static <T extends Exception, S extends Exception> S of(T exception) {
        if (exception instanceof WebSocketShim) {
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

    static <T extends Annotation, S extends Annotation> S of(T annotation) {
        if (annotation instanceof ServletShim) {
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

    //==================================================================================================================
    // Private Helper Methods
    //==================================================================================================================

    @SuppressWarnings("unchecked")
    private static <T> T S(Object object) {
        return (T) object;
    }
}
