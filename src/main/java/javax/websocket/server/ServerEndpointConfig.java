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
            return WebSocketShim.of(Collectors.toList(), super.getNegotiatedExtensions(installed, requested));
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
            delegate.encoders(WebSocketShim.of(Collectors.toList(), encoders));
            return this;
        }

        /**
         * @see jakarta.websocket.server.ServerEndpointConfig.Builder#decoders(List)
         */
        public Builder decoders(List<Class<? extends Decoder>> decoders) {
            delegate.decoders(WebSocketShim.of(Collectors.toList(), decoders));
            return this;
        }

        /**
         * @see jakarta.websocket.server.ServerEndpointConfig.Builder#subprotocols(List)
         */
        public Builder subprotocols(List<String> subprotocols) {
            delegate.subprotocols(subprotocols);
            return this;
        }

        /**
         * @see jakarta.websocket.server.ServerEndpointConfig.Builder#extensions(List)
         */
        public Builder extensions(List<Extension> extensions) {
            delegate.extensions(WebSocketShim.of(Collectors.toList(), extensions));
            return this;
        }

        /**
         * @see jakarta.websocket.server.ServerEndpointConfig.Builder#configurator(jakarta.websocket.server.ServerEndpointConfig.Configurator)
         */
        public Builder configurator(Configurator serverEndpointConfigurator) {
            delegate.configurator(serverEndpointConfigurator);
            return this;
        }
    }
}
