package javax.websocket;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.ByteBuffer;

/**
 * @deprecated Use {@link jakarta.websocket.Decoder} instead.
 */
@Deprecated(since = "jakarta.websocket.Decoder")
public interface Decoder extends jakarta.websocket.Decoder, WebSocketShim {
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
    // Decoder.Binary Implementation
    //==================================================================================================================

    /**
     * @deprecated Use {@link jakarta.websocket.Decoder.Binary} instead.
     */
    @Deprecated(since = "jakarta.websocket.Decoder.Binary")
    interface Binary<T> extends jakarta.websocket.Decoder.Binary<T>, Decoder {
        //==============================================================================================================
        // Decoder.Binary Implementation Methods
        //==============================================================================================================

        @Override
        T decode(ByteBuffer bytes) throws DecodeException;
    }

    //==================================================================================================================
    // Decoder.BinaryStream Implementation
    //==================================================================================================================

    /**
     * @deprecated Use {@link jakarta.websocket.Decoder.BinaryStream} instead.
     */
    @Deprecated(since = "jakarta.websocket.Decoder.BinaryStream")
    interface BinaryStream<T> extends jakarta.websocket.Decoder.BinaryStream<T>, Decoder {
        //==============================================================================================================
        // Decoder.BinaryStream Implementation Methods
        //==============================================================================================================

        @Override
        T decode(InputStream stream) throws DecodeException, IOException;
    }

    //==================================================================================================================
    // Decoder.Text Implementation
    //==================================================================================================================

    /**
     * @deprecated Use {@link jakarta.websocket.Decoder.Text} instead.
     */
    @Deprecated(since = "jakarta.websocket.Decoder.Text")
    interface Text<T> extends jakarta.websocket.Decoder.Text<T>, Decoder {
        //==============================================================================================================
        // Decoder.Text Implementation Methods
        //==============================================================================================================

        @Override
        T decode(String text) throws DecodeException;
    }

    //==================================================================================================================
    // Decoder.TextStream Implementation
    //==================================================================================================================

    /**
     * @deprecated Use {@link jakarta.websocket.Decoder.TextStream} instead.
     */
    @Deprecated(since = "jakarta.websocket.Decoder.TextStream")
    interface TextStream<T> extends jakarta.websocket.Decoder.TextStream<T>, Decoder {
        //==============================================================================================================
        // Decoder.TextStream Implementation Methods
        //==============================================================================================================

        @Override
        T decode(Reader reader) throws DecodeException, IOException;
    }
}
