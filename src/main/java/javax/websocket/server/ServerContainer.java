package javax.websocket.server;

import javax.websocket.DeploymentException;
import javax.websocket.WebSocketContainer;
import javax.websocket.WebSocketShim;
import java.io.IOException;
import java.util.Map;

/**
 * @deprecated Use {@link jakarta.websocket.server.ServerContainer} instead.
 */
@Deprecated(since = "jakarta.websocket.server.ServerContainer")
public interface ServerContainer extends jakarta.websocket.server.ServerContainer, WebSocketContainer {
    //==================================================================================================================
    // Shim Methods
    //==================================================================================================================

    /**
     * @see #addEndpoint(jakarta.websocket.server.ServerEndpointConfig)
     */
    void addEndpoint(ServerEndpointConfig endpointConfig) throws DeploymentException;

    /**
     * @see #upgradeHttpToWebSocket(Object, Object, jakarta.websocket.server.ServerEndpointConfig, Map)
     */
    void upgradeHttpToWebSocket(
        Object httpServletRequest,
        Object httpServletResponse,
        ServerEndpointConfig endpointConfig,
        Map<String, String> pathParameters
    ) throws DeploymentException, IOException;

    //==================================================================================================================
    // ServerContainer Implementation Methods
    //==================================================================================================================

    @Override
    void addEndpoint(Class<?> endpointClass) throws DeploymentException;

    @Override
    default void addEndpoint(jakarta.websocket.server.ServerEndpointConfig endpointConfig) throws DeploymentException {
        addEndpoint(WebSocketShim.<ServerEndpointConfig>of(endpointConfig));
    }

    @Override
    default void upgradeHttpToWebSocket(
        Object httpServletRequest,
        Object httpServletResponse,
        jakarta.websocket.server.ServerEndpointConfig endpointConfig,
        Map<String, String> pathParameters
    ) throws DeploymentException, IOException {
        upgradeHttpToWebSocket(
            httpServletRequest,
            httpServletResponse,
            WebSocketShim.of(endpointConfig),
            pathParameters
        );
    }
}
