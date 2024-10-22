package javax.servlet;

/**
 * @deprecated Use {@link jakarta.servlet.ServletRequestAttributeListener} instead.
 */
@Deprecated(since = "jakarta.servlet.ServletRequestAttributeListener")
public interface ServletRequestAttributeListener extends jakarta.servlet.ServletRequestAttributeListener, ServletShim {
    //==================================================================================================================
    // Shim Methods
    //==================================================================================================================

    /**
     * @see #attributeAdded(jakarta.servlet.ServletRequestAttributeEvent)
     */
    default void attributeAdded(ServletRequestAttributeEvent event) {
        // Do nothing.
    }

    /**
     * @see #attributeRemoved(jakarta.servlet.ServletRequestAttributeEvent)
     */
    default void attributeRemoved(ServletRequestAttributeEvent event) {
        // Do nothing.
    }

    /**
     * @see #attributeReplaced(jakarta.servlet.ServletRequestAttributeEvent)
     */
    default void attributeReplaced(ServletRequestAttributeEvent event) {
        // Do nothing.
    }

    //==================================================================================================================
    // ServletContextAttributeListener Implementation Methods
    //==================================================================================================================

    @Override
    default void attributeAdded(jakarta.servlet.ServletRequestAttributeEvent event) {
        attributeAdded(ServletShim.<jakarta.servlet.ServletRequestAttributeEvent, ServletRequestAttributeEvent>of(event));
    }

    @Override
    default void attributeRemoved(jakarta.servlet.ServletRequestAttributeEvent event) {
        attributeRemoved(ServletShim.<jakarta.servlet.ServletRequestAttributeEvent, ServletRequestAttributeEvent>of(event));
    }

    @Override
    default void attributeReplaced(jakarta.servlet.ServletRequestAttributeEvent event) {
        attributeReplaced(ServletShim.<jakarta.servlet.ServletRequestAttributeEvent, ServletRequestAttributeEvent>of(event));
    }
}
