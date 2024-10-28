package javax.websocket;

import java.io.IOException;
import java.util.List;
import java.util.Set;

/**
 * @deprecated Use {@link jakarta.websocket.Session} instead.
 */
@Deprecated(since = "jakarta.websocket.Session")
@SuppressWarnings({"unchecked", "rawtypes"})
public interface Session extends jakarta.websocket.Session, WebSocketShim {
    //==================================================================================================================
    // Shim Methods
    //==================================================================================================================

    /**
     * @see #addMessageHandler(jakarta.websocket.MessageHandler)
     */
    void addMessageHandler(MessageHandler handler) throws IllegalStateException;

    /**
     * @see #addMessageHandler(Class, jakarta.websocket.MessageHandler.Whole)
     */
    <T> void addMessageHandler(Class<T> clazz, MessageHandler.Whole<T> handler);

    /**
     * @see #addMessageHandler(Class, jakarta.websocket.MessageHandler.Partial)
     */
    <T> void addMessageHandler(Class<T> clazz, MessageHandler.Partial<T> handler);

    /**
     * @see #removeMessageHandler(jakarta.websocket.MessageHandler)
     */
    void removeMessageHandler(MessageHandler handler);

    /**
     * @see #close(jakarta.websocket.CloseReason)
     */
    void close(CloseReason reason) throws IOException;

    //==================================================================================================================
    // Session Implementation Methods
    //==================================================================================================================

    @Override
    WebSocketContainer getContainer();

    @Override
    default void addMessageHandler(jakarta.websocket.MessageHandler handler) throws IllegalStateException {
        addMessageHandler(WebSocketShim.of(handler));
    }

    @Override
    default <T> void addMessageHandler(Class<T> clazz, jakarta.websocket.MessageHandler.Whole<T> handler) {
        addMessageHandler(
            clazz,
            WebSocketShim.<jakarta.websocket.MessageHandler.Whole<T>, MessageHandler.Whole<T>>of(handler)
        );
    }

    @Override
    default <T> void addMessageHandler(Class<T> clazz, jakarta.websocket.MessageHandler.Partial<T> handler) {
        addMessageHandler(
            clazz,
            WebSocketShim.<jakarta.websocket.MessageHandler.Partial<T>, MessageHandler.Partial<T>>of(handler)
        );
    }

    @Override
    Set getMessageHandlers();

    @Override
    default void removeMessageHandler(jakarta.websocket.MessageHandler handler) {
        removeMessageHandler(WebSocketShim.of(handler));
    }

    @Override
    List getNegotiatedExtensions();

    @Override
    RemoteEndpoint.Async getAsyncRemote();

    @Override
    RemoteEndpoint.Basic getBasicRemote();

    @Override
    default void close(jakarta.websocket.CloseReason closeReason) throws IOException {
        close(WebSocketShim.of(closeReason));
    }

    @Override
    Set getOpenSessions();
}
