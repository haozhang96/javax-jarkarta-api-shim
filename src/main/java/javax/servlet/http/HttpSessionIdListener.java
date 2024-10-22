package javax.servlet.http;

import javax.servlet.ServletShim;

/**
 * @deprecated Use {@link jakarta.servlet.http.HttpSessionIdListener} instead.
 */
@Deprecated(since = "jakarta.servlet.http.HttpSessionIdListener")
public interface HttpSessionIdListener extends jakarta.servlet.http.HttpSessionIdListener, ServletShim {
    //==================================================================================================================
    // Shim Methods
    //==================================================================================================================

    /**
     * @see #sessionIdChanged(jakarta.servlet.http.HttpSessionEvent, String)
     */
    void sessionIdChanged(HttpSessionEvent event, String oldSessionId);

    //==================================================================================================================
    // HttpSessionIdListener Implementation Methods
    //==================================================================================================================

    @Override
    default void sessionIdChanged(jakarta.servlet.http.HttpSessionEvent event, String oldSessionId) {
        sessionIdChanged(ServletShim.of(event), oldSessionId);
    }
}
