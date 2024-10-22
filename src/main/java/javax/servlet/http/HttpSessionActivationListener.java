package javax.servlet.http;

import javax.servlet.ServletShim;

/**
 * @deprecated Use {@link jakarta.servlet.http.HttpSessionActivationListener} instead.
 */
@Deprecated(since = "jakarta.servlet.http.HttpSessionActivationListener")
public interface HttpSessionActivationListener extends jakarta.servlet.http.HttpSessionActivationListener, ServletShim {
    //==================================================================================================================
    // Shim Methods
    //==================================================================================================================

    /**
     * @see #sessionWillPassivate(jakarta.servlet.http.HttpSessionEvent)
     */
    void sessionWillPassivate(HttpSessionEvent event);

    /**
     * @see #sessionDidActivate(jakarta.servlet.http.HttpSessionEvent)
     */
    void sessionDidActivate(HttpSessionEvent event);

    //==================================================================================================================
    // HttpSessionActivationListener Implementation Methods
    //==================================================================================================================

    @Override
    default void sessionWillPassivate(jakarta.servlet.http.HttpSessionEvent event) {
        sessionWillPassivate(ServletShim.of(event));
    }

    @Override
    default void sessionDidActivate(jakarta.servlet.http.HttpSessionEvent event) {
        sessionDidActivate(ServletShim.of(event));
    }
}
