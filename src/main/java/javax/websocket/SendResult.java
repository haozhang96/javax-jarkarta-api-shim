package javax.websocket;

import javax.Shim;

/**
 * @deprecated Use {@link jakarta.websocket.SendResult} instead.
 * @apiNote This class cannot extend {@link jakarta.websocket.SendResult} due to it being a final class.
 */
@Deprecated(since = "jakarta.websocket.SendResult")
public class SendResult extends Shim.Delegate<jakarta.websocket.SendResult> implements WebSocketShim {
    //==================================================================================================================
    // Constructors
    //==================================================================================================================

    /**
     * @see jakarta.websocket.SendResult#SendResult()
     */
    public SendResult() {
        this(new jakarta.websocket.SendResult());
    }

    /**
     * @see jakarta.websocket.SendResult#SendResult(Throwable)
     */
    public SendResult(Throwable cause) {
        this(new jakarta.websocket.SendResult(cause));
    }

    protected SendResult(jakarta.websocket.SendResult delegate) {
        super(delegate);
    }

    //==================================================================================================================
    // SendResult Implementation Methods
    //==================================================================================================================

    /**
     * @see jakarta.websocket.SendResult#getException()
     */
    public Throwable getException() {
        return delegate.getException();
    }

    /**
     * @see jakarta.websocket.SendResult#isOK()
     */
    public boolean isOK() {
        return delegate.isOK();
    }

    //==================================================================================================================
    // Accessor Methods
    //==================================================================================================================

    protected jakarta.websocket.SendResult getDelegate() {
        return delegate;
    }
}
