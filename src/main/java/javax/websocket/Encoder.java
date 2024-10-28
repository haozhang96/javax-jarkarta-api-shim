package javax.websocket;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.ByteBuffer;

/**
 * @deprecated Use {@link jakarta.websocket.Encoder} instead.
 */
@Deprecated(since = "jakarta.websocket.Encoder")
public interface Encoder extends jakarta.websocket.Encoder, WebSocketShim {
    //==================================================================================================================
    // Shim Methods
    //==================================================================================================================

    void init(EndpointConfig config);

    //==================================================================================================================
    // WebSocketContainer Implementation Methods
    //==================================================================================================================

    @Override
    default void init(jakarta.websocket.EndpointConfig config) {
        init(WebSocketShim.of(config));
    }

    //==================================================================================================================
    // Encoder.Binary Implementation
    //==================================================================================================================

    /**
     * @deprecated Use {@link jakarta.websocket.Encoder.Binary} instead.
     */
    @Deprecated(since = "jakarta.websocket.Encoder.Binary")
    interface Binary<T> extends jakarta.websocket.Encoder.Binary<T>, Encoder {
        //==============================================================================================================
        // Encoder.Binary Implementation Methods
        //==============================================================================================================

        @Override
        ByteBuffer encode(T object) throws EncodeException;
    }

    //==================================================================================================================
    // Encoder.BinaryStream Implementation
    //==================================================================================================================

    /**
     * @deprecated Use {@link jakarta.websocket.Encoder.BinaryStream} instead.
     */
    @Deprecated(since = "jakarta.websocket.Encoder.BinaryStream")
    interface BinaryStream<T> extends jakarta.websocket.Encoder.BinaryStream<T>, Encoder {
        //==============================================================================================================
        // Encoder.BinaryStream Implementation Methods
        //==============================================================================================================

        @Override
        void encode(T object, OutputStream stream) throws EncodeException, IOException;
    }

    //==================================================================================================================
    // Encoder.Text Implementation
    //==================================================================================================================

    /**
     * @deprecated Use {@link jakarta.websocket.Encoder.Text} instead.
     */
    @Deprecated(since = "jakarta.websocket.Encoder.Text")
    interface Text<T> extends jakarta.websocket.Encoder.Text<T>, Encoder {
        //==============================================================================================================
        // Encoder.Text Implementation Methods
        //==============================================================================================================

        @Override
        String encode(T object) throws EncodeException;
    }

    //==================================================================================================================
    // Encoder.TextStream Implementation
    //==================================================================================================================

    /**
     * @deprecated Use {@link jakarta.websocket.Encoder.TextStream} instead.
     */
    @Deprecated(since = "jakarta.websocket.Encoder.TextStream")
    interface TextStream<T> extends jakarta.websocket.Encoder.TextStream<T>, Encoder {
        //==============================================================================================================
        // Encoder.TextStream Implementation Methods
        //==============================================================================================================

        @Override
        void encode(T object, Writer writer) throws EncodeException, IOException;
    }
}
