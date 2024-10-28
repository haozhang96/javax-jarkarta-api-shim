package javax.websocket;

/**
 * @deprecated Use {@link jakarta.websocket.SendResult} instead.
 * @apiNote This class cannot extend {@link jakarta.websocket.SendResult} due to it being a final class.
 */
@Deprecated(since = "jakarta.websocket.SendResult")
public class SendResult implements WebSocketShim {
    private final Throwable exception;

    //==================================================================================================================
    // Constructors
    //==================================================================================================================

    /**
     * @see jakarta.websocket.SendResult#SendResult()
     */
    public SendResult() {
        this(null);
    }

    /**
     * @see jakarta.websocket.SendResult#SendResult(Throwable)
     */
    public SendResult(Throwable exception) {
        this.exception = exception;
    }

    //==================================================================================================================
    // SendResult Implementation Methods
    //==================================================================================================================

    /**
     * @see jakarta.websocket.SendResult#getException()
     */
    public Throwable getException() {
        return exception;
    }

    /**
     * @see jakarta.websocket.SendResult#isOK()
     */
    public boolean isOK() {
        return getException() == null;
    }
}
