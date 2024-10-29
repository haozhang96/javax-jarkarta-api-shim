package javax.websocket.server;

import jakarta.websocket.server.HandshakeRequest;

import javax.websocket.*;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @deprecated Use {@link jakarta.websocket.server.ServerEndpointConfig} instead.
 */
@Deprecated(since = "jakarta.websocket.server.ServerEndpointConfig")
@SuppressWarnings("unchecked")
public interface ServerEndpointConfig extends jakarta.websocket.server.ServerEndpointConfig, EndpointConfig {
    //==================================================================================================================
    // ServerEndpointConfig Implementation Methods
    //==================================================================================================================

    @Override
    @SuppressWarnings("rawtypes")
    List getExtensions();

    @Override
    Configurator getConfigurator();

    //==================================================================================================================
    // ServerEndpointConfig.Configurator Implementation
    //==================================================================================================================

    /**
     * @deprecated Use {@link jakarta.websocket.server.ServerEndpointConfig.Configurator} instead.
     */
    @Deprecated(since = "jakarta.websocket.server.ServerEndpointConfig.Configurator")
    class Configurator extends jakarta.websocket.server.ServerEndpointConfig.Configurator implements WebSocketShim {
        //==============================================================================================================
        // Shim Methods
        //==============================================================================================================

        public void modifyHandshake(
            ServerEndpointConfig endpointConfig,
            HandshakeRequest request,
            HandshakeResponse response
        ) {
            super.modifyHandshake(endpointConfig, request, response);
        }

        //==============================================================================================================
        // ServerEndpointConfig.Configurator Implementation Methods
        //==============================================================================================================

        @Override
        public Configurator getContainerDefaultConfigurator() {
            return WebSocketShim.of(super.getContainerDefaultConfigurator());
        }

        @Override
        public List<Extension> getNegotiatedExtensions(List installed, List requested) {
            return WebSocketShim
                .<Extension>of(super.getNegotiatedExtensions(installed, requested))
                .collect(Collectors.toList());
        }

        @Override
        public void modifyHandshake(
            jakarta.websocket.server.ServerEndpointConfig endpointConfig,
            jakarta.websocket.server.HandshakeRequest request,
            jakarta.websocket.HandshakeResponse response
        ) {
            modifyHandshake(WebSocketShim.of(endpointConfig), WebSocketShim.of(request), WebSocketShim.of(response));
        }
    }

    //==================================================================================================================
    // ServerEndpointConfig.Builder Implementation
    //==================================================================================================================

    /**
     * @deprecated Use {@link jakarta.websocket.server.ServerEndpointConfig.Builder} instead.
     */
    @Deprecated(since = "jakarta.websocket.server.ServerEndpointConfig.Builder")
    class Builder extends Delegate<jakarta.websocket.server.ServerEndpointConfig.Builder> {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        Builder(Class<?> endpointClass, String path) {
            super(jakarta.websocket.server.ServerEndpointConfig.Builder.create(endpointClass, path));
        }

        //==============================================================================================================
        // Factory Methods
        //==============================================================================================================

        /**
         * @see jakarta.websocket.server.ServerEndpointConfig.Builder#create(Class, String)
         */
        public static Builder create(Class<?> endpointClass, String path) {
            return new Builder(endpointClass, path);
        }

        //==============================================================================================================
        // ServerEndpointConfig.Builder Implementation Methods
        //==============================================================================================================

        /**
         * @see jakarta.websocket.server.ServerEndpointConfig.Builder#build()
         */
        public ServerEndpointConfig build() {
            return WebSocketShim.of(delegate.build());
        }

        /**
         * @see jakarta.websocket.server.ServerEndpointConfig.Builder#encoders(List)
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
         * @see jakarta.websocket.server.ServerEndpointConfig.Builder#decoders(List)
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
         * @see jakarta.websocket.server.ServerEndpointConfig.Builder#subprotocols(List)
         */
        public Builder subprotocols(List<String> subprotocols) {
            return WebSocketShim.of(delegate.subprotocols(subprotocols));
        }

        /**
         * @see jakarta.websocket.server.ServerEndpointConfig.Builder#extensions(List)
         */
        public Builder extensions(List<Extension> extensions) {
            return WebSocketShim.of(delegate.extensions(
                WebSocketShim
                    .<Extension>of(extensions)
                    .collect(Collectors.toList())
            ));
        }

        /**
         * @see jakarta.websocket.server.ServerEndpointConfig.Builder#configurator(jakarta.websocket.server.ServerEndpointConfig.Configurator)
         */
        public Builder configurator(Configurator serverEndpointConfigurator) {
            return WebSocketShim.of(delegate.configurator(serverEndpointConfigurator));
        }
    }
}
