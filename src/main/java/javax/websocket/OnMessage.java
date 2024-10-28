package javax.websocket;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @deprecated Use {@link jakarta.websocket.OnMessage} instead.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Deprecated(since = "jakarta.websocket.OnMessage")
public @interface OnMessage {
    /**
     * @see jakarta.websocket.OnMessage#maxMessageSize()
     */
    long maxMessageSize() default -1L;
}
