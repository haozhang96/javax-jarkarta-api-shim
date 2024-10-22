package javax.servlet.http;

import javax.servlet.ServletShim;

/**
 * @deprecated Use {@link jakarta.servlet.http.HttpSessionBindingListener} instead.
 */
@Deprecated(since = "jakarta.servlet.http.HttpSessionBindingListener")
public interface HttpSessionBindingListener extends jakarta.servlet.http.HttpSessionBindingListener, ServletShim {
    //==================================================================================================================
    // Shim Methods
    //==================================================================================================================

    /**
     * @see #valueBound(jakarta.servlet.http.HttpSessionBindingEvent)
     */
    void valueBound(HttpSessionBindingEvent event);

    /**
     * @see #valueUnbound(jakarta.servlet.http.HttpSessionBindingEvent)
     */
    void valueUnbound(HttpSessionBindingEvent event);

    //==================================================================================================================
    // HttpSessionBindingListener Implementation Methods
    //==================================================================================================================

    @Override
    default void valueBound(jakarta.servlet.http.HttpSessionBindingEvent event) {
        valueBound(ServletShim.<jakarta.servlet.http.HttpSessionBindingEvent, HttpSessionBindingEvent>of(event));
    }

    @Override
    default void valueUnbound(jakarta.servlet.http.HttpSessionBindingEvent event) {
        valueUnbound(ServletShim.<jakarta.servlet.http.HttpSessionBindingEvent, HttpSessionBindingEvent>of(event));
    }
}
