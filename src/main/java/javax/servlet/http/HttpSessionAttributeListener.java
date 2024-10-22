package javax.servlet.http;

import javax.servlet.ServletShim;

/**
 * @deprecated Use {@link jakarta.servlet.http.HttpSessionAttributeListener} instead.
 */
@Deprecated(since = "jakarta.servlet.http.HttpSessionAttributeListener")
public interface HttpSessionAttributeListener extends jakarta.servlet.http.HttpSessionAttributeListener, ServletShim {
    //==================================================================================================================
    // Shim Methods
    //==================================================================================================================

    /**
     * @see #attributeAdded(jakarta.servlet.http.HttpSessionBindingEvent)
     */
    default void attributeAdded(HttpSessionBindingEvent event) {
        // Do nothing.
    }

    /**
     * @see #attributeRemoved(jakarta.servlet.http.HttpSessionBindingEvent)
     */
    default void attributeRemoved(HttpSessionBindingEvent event) {
        // Do nothing.
    }

    /**
     * @see #attributeReplaced(jakarta.servlet.http.HttpSessionBindingEvent)
     */
    default void attributeReplaced(HttpSessionBindingEvent event) {
        // Do nothing.
    }

    //==================================================================================================================
    // HttpSessionAttributeListener Implementation Methods
    //==================================================================================================================

    @Override
    default void attributeAdded(jakarta.servlet.http.HttpSessionBindingEvent event) {
        attributeAdded(ServletShim.<jakarta.servlet.http.HttpSessionBindingEvent, HttpSessionBindingEvent>of(event));
    }

    @Override
    default void attributeRemoved(jakarta.servlet.http.HttpSessionBindingEvent event) {
        attributeRemoved(ServletShim.<jakarta.servlet.http.HttpSessionBindingEvent, HttpSessionBindingEvent>of(event));
    }

    @Override
    default void attributeReplaced(jakarta.servlet.http.HttpSessionBindingEvent event) {
        attributeReplaced(ServletShim.<jakarta.servlet.http.HttpSessionBindingEvent, HttpSessionBindingEvent>of(event));
    }
}
