package javax.websocket;

import java.io.IOException;
import java.nio.ByteBuffer;

/**
 * @deprecated Use {@link jakarta.websocket.RemoteEndpoint} instead.
 */
@Deprecated(since = "jakarta.websocket.RemoteEndpoint")
public interface RemoteEndpoint extends jakarta.websocket.RemoteEndpoint, WebSocketShim {
    //==================================================================================================================
    // RemoteEndpoint.Async Implementation
    //==================================================================================================================

    /**
     * @deprecated Use {@link jakarta.websocket.RemoteEndpoint.Async} instead.
     */
    @Deprecated(since = "jakarta.websocket.RemoteEndpoint.Async")
    interface Async extends jakarta.websocket.RemoteEndpoint.Async, RemoteEndpoint {
        //==============================================================================================================
        // Shim Methods
        //==============================================================================================================

        /**
         * @see #sendText(String, jakarta.websocket.SendHandler)
         */
        void sendText(String text, SendHandler handler);

        /**
         * @see #sendBinary(ByteBuffer, jakarta.websocket.SendHandler)
         */
        void sendBinary(ByteBuffer data, SendHandler handler);

        /**
         * @see #sendObject(Object, jakarta.websocket.SendHandler)
         */
        void sendObject(Object data, SendHandler handler);

        //==============================================================================================================
        // RemoteEndpoint.Async Implementation Methods
        //==============================================================================================================

        @Override
        default void sendText(String text, jakarta.websocket.SendHandler handler) {
            sendText(text, WebSocketShim.of(handler));
        }

        @Override
        default void sendBinary(ByteBuffer data, jakarta.websocket.SendHandler handler) {
            sendBinary(data, WebSocketShim.of(handler));
        }

        @Override
        default void sendObject(Object data, jakarta.websocket.SendHandler handler) {
            sendObject(data, WebSocketShim.of(handler));
        }
    }

    //==================================================================================================================
    // RemoteEndpoint.Basic Implementation
    //==================================================================================================================

    /**
     * @deprecated Use {@link jakarta.websocket.RemoteEndpoint.Basic} instead.
     */
    @Deprecated(since = "jakarta.websocket.RemoteEndpoint.Basic")
    interface Basic extends jakarta.websocket.RemoteEndpoint.Basic, RemoteEndpoint {
        //==============================================================================================================
        // RemoteEndpoint.Basic Implementation Methods
        //==============================================================================================================

        @Override
        void sendObject(Object data) throws EncodeException, IOException;
    }
}
