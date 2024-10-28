package javax.websocket.server;

import javax.websocket.Decoder;
import javax.websocket.Encoder;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @deprecated Use {@link jakarta.websocket.server.ServerEndpoint} instead.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Deprecated(since = "jakarta.websocket.server.ServerEndpoint")
public @interface ServerEndpoint {
    /**
     * @see jakarta.websocket.server.ServerEndpoint#value()
     */
    String value();

    /**
     * @see jakarta.websocket.server.ServerEndpoint#subprotocols()
     */
    String[] subprotocols() default {};

    /**
     * @see jakarta.websocket.server.ServerEndpoint#decoders()
     */
    Class<? extends Decoder>[] decoders() default {};

    /**
     * @see jakarta.websocket.server.ServerEndpoint#encoders()
     */
    Class<? extends Encoder>[] encoders() default {};

    /**
     * @see jakarta.websocket.server.ServerEndpoint#configurator()
     */
    Class<? extends ServerEndpointConfig.Configurator> configurator() default ServerEndpointConfig.Configurator.class;
}
