package javax.servlet;

/**
 * @deprecated Use {@link jakarta.servlet.ServletContextAttributeListener} instead.
 */
@Deprecated(since = "jakarta.servlet.ServletContextAttributeListener")
public interface ServletContextAttributeListener extends jakarta.servlet.ServletContextAttributeListener, ServletShim {
    //==================================================================================================================
    // Shim Methods
    //==================================================================================================================

    /**
     * @see #attributeAdded(jakarta.servlet.ServletContextAttributeEvent)
     */
    default void attributeAdded(ServletContextAttributeEvent event) {
        // Do nothing.
    }

    /**
     * @see #attributeRemoved(jakarta.servlet.ServletContextAttributeEvent)
     */
    default void attributeRemoved(ServletContextAttributeEvent event) {
        // Do nothing.
    }

    /**
     * @see #attributeReplaced(jakarta.servlet.ServletContextAttributeEvent)
     */
    default void attributeReplaced(ServletContextAttributeEvent event) {
        // Do nothing.
    }

    //==================================================================================================================
    // ServletContextAttributeListener Implementation Methods
    //==================================================================================================================

    @Override
    default void attributeAdded(jakarta.servlet.ServletContextAttributeEvent event) {
        attributeAdded(ServletShim.<jakarta.servlet.ServletContextAttributeEvent, ServletContextAttributeEvent>of(event));
    }

    @Override
    default void attributeRemoved(jakarta.servlet.ServletContextAttributeEvent event) {
        attributeRemoved(ServletShim.<jakarta.servlet.ServletContextAttributeEvent, ServletContextAttributeEvent>of(event));
    }

    @Override
    default void attributeReplaced(jakarta.servlet.ServletContextAttributeEvent event) {
        attributeReplaced(ServletShim.<jakarta.servlet.ServletContextAttributeEvent, ServletContextAttributeEvent>of(event));
    }
}
