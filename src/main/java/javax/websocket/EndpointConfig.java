package javax.websocket;

import java.util.List;

/**
 * @deprecated Use {@link jakarta.websocket.EndpointConfig} instead.
 */
@Deprecated(since = "jakarta.websocket.EndpointConfig")
public interface EndpointConfig extends jakarta.websocket.EndpointConfig, WebSocketShim {
    //==================================================================================================================
    // EndpointConfig Implementation Methods
    //==================================================================================================================

    @Override
    @SuppressWarnings({"unchecked", "rawtypes"})
    List getEncoders();

    @Override
    @SuppressWarnings({"unchecked", "rawtypes"})
    List getDecoders();
}
