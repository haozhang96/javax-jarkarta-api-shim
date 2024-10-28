package javax.websocket;

/**
 * @deprecated Use {@link jakarta.websocket.MessageHandler} instead.
 */
@Deprecated(since = "jakarta.websocket.MessageHandler")
public interface MessageHandler extends jakarta.websocket.MessageHandler, WebSocketShim {
    //==================================================================================================================
    // MessageHandler.Whole Implementation
    //==================================================================================================================

    /**
     * @deprecated Use {@link jakarta.websocket.MessageHandler.Whole} instead.
     */
    @Deprecated(since = "jakarta.websocket.MessageHandler.Whole")
    interface Whole<T> extends jakarta.websocket.MessageHandler.Whole<T>, MessageHandler { }

    //==================================================================================================================
    // MessageHandler.Partial Implementation
    //==================================================================================================================

    /**
     * @deprecated Use {@link jakarta.websocket.MessageHandler.Partial} instead.
     */
    @Deprecated(since = "jakarta.websocket.MessageHandler.Partial")
    interface Partial<T> extends jakarta.websocket.MessageHandler.Partial<T>, MessageHandler { }
}
