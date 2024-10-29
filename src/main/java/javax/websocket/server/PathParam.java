package javax.websocket.server;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

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
