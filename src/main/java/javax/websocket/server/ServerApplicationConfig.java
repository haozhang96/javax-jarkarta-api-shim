package javax.websocket.server;

import javax.websocket.WebSocketShim;
import java.util.Set;

/**
 * @deprecated Use {@link jakarta.websocket.server.ServerApplicationConfig} instead.
 */
@Deprecated(since = "jakarta.websocket.server.ServerApplicationConfig")
public interface ServerApplicationConfig extends jakarta.websocket.server.ServerApplicationConfig, WebSocketShim {
    //==================================================================================================================
    // ServerApplicationConfig Implementation Methods
    //==================================================================================================================

    @Override
    @SuppressWarnings({"unchecked", "rawtypes"})
    Set getEndpointConfigs(Set endpointClasses);
}
