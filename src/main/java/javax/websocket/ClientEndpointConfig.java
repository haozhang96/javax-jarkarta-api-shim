package javax.websocket;

import javax.net.ssl.SSLContext;
import javax.shim.Shim;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @deprecated Use {@link jakarta.websocket.ClientEndpointConfig} instead.
 */
@Deprecated(since = "jakarta.websocket.ClientEndpointConfig")
@SuppressWarnings("unchecked")
public interface ClientEndpointConfig extends jakarta.websocket.ClientEndpointConfig, EndpointConfig {
    //==================================================================================================================
    // ClientEndpointConfig Implementation Methods
    //==================================================================================================================

    @Override
    @SuppressWarnings("rawtypes")
    List getExtensions();

    @Override
    Configurator getConfigurator();

    //==================================================================================================================
    // ClientEndpointConfig.Configurator Implementation
    //==================================================================================================================

    /**
     * @deprecated Use {@link jakarta.websocket.ClientEndpointConfig.Configurator} instead.
     */
    @Deprecated(since = "jakarta.websocket.ClientEndpointConfig.Configurator")
    class Configurator extends jakarta.websocket.ClientEndpointConfig.Configurator implements WebSocketShim {
        //==============================================================================================================
        // Shim Methods
        //==============================================================================================================

        public void afterResponse(HandshakeResponse handshakeResponse) {
            super.afterResponse(handshakeResponse);
        }

        //==============================================================================================================
        // ClientEndpointConfig.Configurator Implementation Methods
        //==============================================================================================================

        @Override
        public void afterResponse(jakarta.websocket.HandshakeResponse handshakeResponse) {
            afterResponse(WebSocketShim.of(handshakeResponse));
        }
    }

    //==================================================================================================================
    // ClientEndpointConfig.Builder Implementation
    //==================================================================================================================

    /**
     * @deprecated Use {@link jakarta.websocket.ClientEndpointConfig.Builder} instead.
     */
    @Deprecated(since = "jakarta.websocket.ClientEndpointConfig.Builder")
    class Builder extends Shim.Delegate<jakarta.websocket.ClientEndpointConfig.Builder> {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        Builder() {
            super(jakarta.websocket.ClientEndpointConfig.Builder.create());
        }

        //==============================================================================================================
        // Factory Methods
        //==============================================================================================================

        /**
         * @see jakarta.websocket.ClientEndpointConfig.Builder#create()
         */
        public static Builder create() {
            return new Builder();
        }

        //==============================================================================================================
        // ClientEndpointConfig.Builder Implementation Methods
        //==============================================================================================================

        /**
         * @see jakarta.websocket.ClientEndpointConfig.Builder#build()
         */
        public ClientEndpointConfig build() {
            return WebSocketShim.of(delegate.build());
        }

        /**
         * @see jakarta.websocket.ClientEndpointConfig.Builder#configurator(jakarta.websocket.ClientEndpointConfig.Configurator)
         */
        public Builder configurator(Configurator clientEndpointConfigurator) {
            return WebSocketShim.of(delegate.configurator(clientEndpointConfigurator));
        }

        /**
         * @see jakarta.websocket.ClientEndpointConfig.Builder#preferredSubprotocols(List)
         */
        public Builder preferredSubprotocols(List<String> preferredSubprotocols) {
            return WebSocketShim.of(delegate.preferredSubprotocols(preferredSubprotocols));
        }

        /**
         * @see jakarta.websocket.ClientEndpointConfig.Builder#extensions(List)
         */
        public Builder extensions(List<Extension> extensions) {
            return WebSocketShim.of(delegate.extensions(
                WebSocketShim
                    .<Extension>of(extensions)
                    .collect(Collectors.toList())
            ));
        }

        /**
         * @see jakarta.websocket.ClientEndpointConfig.Builder#encoders(List)
         */
        public Builder encoders(List<Class<? extends Encoder>> encoders) {
            return WebSocketShim.of(delegate.encoders(
                encoders
                    .stream()
                    .map(encoder -> encoder.<jakarta.websocket.Encoder>asSubclass(jakarta.websocket.Encoder.class))
                    .collect(Collectors.toList())
            ));
        }

        /**
         * @see jakarta.websocket.ClientEndpointConfig.Builder#decoders(List)
         */
        public Builder decoders(List<Class<? extends Decoder>> decoders) {
            return WebSocketShim.of(delegate.decoders(
                decoders
                    .stream()
                    .map(decoder -> decoder.<jakarta.websocket.Decoder>asSubclass(jakarta.websocket.Decoder.class))
                    .collect(Collectors.toList())
            ));
        }

        /**
         * @see jakarta.websocket.ClientEndpointConfig.Builder#sslContext(SSLContext)
         */
        public Builder sslContext(SSLContext sslContext) {
            return WebSocketShim.of(delegate.sslContext(sslContext));
        }
    }
}
