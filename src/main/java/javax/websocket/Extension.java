package javax.websocket;

import java.util.List;

/**
 * @deprecated Use {@link jakarta.websocket.Extension} instead.
 */
@Deprecated(since = "jakarta.websocket.Extension")
public interface Extension extends jakarta.websocket.Extension, WebSocketShim {
    //==================================================================================================================
    // Extension Implementation Methods
    //==================================================================================================================

    @Override
    @SuppressWarnings({"unchecked", "rawtypes"})
    List getParameters();

    //==================================================================================================================
    // Extension.Parameter Implementation
    //==================================================================================================================

    /**
     * @deprecated Use {@link jakarta.websocket.Extension.Parameter} instead.
     */
    @Deprecated(since = "jakarta.websocket.Extension.Parameter")
    interface Parameter extends jakarta.websocket.Extension.Parameter, WebSocketShim { }
}
