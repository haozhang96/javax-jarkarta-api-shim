package javax.servlet.http;

import javax.servlet.ServletShim;

/**
 * @deprecated Use {@link jakarta.servlet.http.HttpSessionListener} instead.
 */
@Deprecated(since = "jakarta.servlet.http.HttpSessionListener")
public interface HttpSessionListener extends jakarta.servlet.http.HttpSessionListener, ServletShim {
    //==================================================================================================================
    // Shim Methods
    //==================================================================================================================

    /**
     * @see #sessionCreated(jakarta.servlet.http.HttpSessionEvent)
     */
    void sessionCreated(HttpSessionEvent event);

    /**
     * @see #sessionDestroyed(jakarta.servlet.http.HttpSessionEvent)
     */
    void sessionDestroyed(HttpSessionEvent event);

    //==================================================================================================================
    // HttpSessionListener Implementation Methods
    //==================================================================================================================

    @Override
    default void sessionCreated(jakarta.servlet.http.HttpSessionEvent event) {
        sessionCreated(ServletShim.of(event));
    }

    @Override
    default void sessionDestroyed(jakarta.servlet.http.HttpSessionEvent event) {
        sessionDestroyed(ServletShim.of(event));
    }
}
