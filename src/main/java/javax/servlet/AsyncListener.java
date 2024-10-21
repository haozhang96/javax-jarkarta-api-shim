package javax.servlet;

import java.io.IOException;

/**
 * @deprecated Use {@link jakarta.servlet.AsyncListener} instead.
 */
@Deprecated(since = "jakarta.servlet.AsyncListener")
public interface AsyncListener extends jakarta.servlet.AsyncListener, ServletShim {
    //==================================================================================================================
    // Shim Methods
    //==================================================================================================================

    /**
     * @see #onComplete(jakarta.servlet.AsyncEvent)
     */
    void onComplete(AsyncEvent event) throws IOException;

    /**
     * @see #onTimeout(jakarta.servlet.AsyncEvent)
     */
    void onTimeout(AsyncEvent event) throws IOException;

    /**
     * @see #onError(jakarta.servlet.AsyncEvent)
     */
    void onError(AsyncEvent event) throws IOException;

    /**
     * @see #onStartAsync(jakarta.servlet.AsyncEvent)
     */
    void onStartAsync(AsyncEvent event) throws IOException;

    //==================================================================================================================
    // AsyncContext Implementation Methods
    //==================================================================================================================

    @Override
    default void onComplete(jakarta.servlet.AsyncEvent event) throws IOException {
        onComplete(ServletShim.of(event));
    }

    @Override
    default void onTimeout(jakarta.servlet.AsyncEvent event) throws IOException {
        onTimeout(ServletShim.of(event));
    }

    @Override
    default void onError(jakarta.servlet.AsyncEvent event) throws IOException {
        onError(ServletShim.of(event));
    }

    @Override
    default void onStartAsync(jakarta.servlet.AsyncEvent event) throws IOException {
        onStartAsync(ServletShim.of(event));
    }
}
