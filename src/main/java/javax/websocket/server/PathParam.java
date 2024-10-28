package javax.websocket.server;

import java.lang.annotation.*;

/**
 * @deprecated Use {@link jakarta.websocket.server.PathParam} instead.
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Deprecated(since = "jakarta.websocket.server.PathParam")
public @interface PathParam {
    /**
     * @see jakarta.websocket.server.PathParam#value()
     */
    String value();
}
