package javax.websocket;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @deprecated Use {@link jakarta.websocket.ClientEndpoint} instead.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Deprecated(since = "jakarta.websocket.ClientEndpoint")
public @interface ClientEndpoint {
    /**
     * @see jakarta.websocket.ClientEndpoint#subprotocols()
     */
    String[] subprotocols() default {};

    /**
     * @see jakarta.websocket.ClientEndpoint#decoders()
     */
    Class<? extends Decoder>[] decoders() default {};

    /**
     * @see jakarta.websocket.ClientEndpoint#encoders()
     */
    Class<? extends Encoder>[] encoders() default {};

    /**
     * @see jakarta.websocket.ClientEndpoint#configurator()
     */
    Class<? extends ClientEndpointConfig.Configurator> configurator() default ClientEndpointConfig.Configurator.class;
}
