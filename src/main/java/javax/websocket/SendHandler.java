package javax.websocket;

/**
 * @deprecated Use {@link jakarta.websocket.SendHandler} instead.
 */
@Deprecated(since = "jakarta.websocket.SendHandler")
public interface SendHandler extends jakarta.websocket.SendHandler, WebSocketShim {
    //==================================================================================================================
    // Shim Methods
    //==================================================================================================================

    /**
     * @see #onResult(jakarta.websocket.SendResult)
     */
    void onResult(SendResult result);

    //==================================================================================================================
    // SendHandler Implementation Methods
    //==================================================================================================================

    @Override
    default void onResult(jakarta.websocket.SendResult result) {
        onResult(WebSocketShim.<jakarta.websocket.SendResult, SendResult>of(result));
    }
}
