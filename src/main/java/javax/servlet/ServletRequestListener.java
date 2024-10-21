package javax.servlet;

/**
 * @deprecated Use {@link jakarta.servlet.ServletRequestListener} instead.
 */
@Deprecated(since = "jakarta.servlet.ServletRequestListener")
public interface ServletRequestListener extends jakarta.servlet.ServletRequestListener, ServletShim {
    //==================================================================================================================
    // Shim Methods
    //==================================================================================================================

    /**
     * @see #requestInitialized(jakarta.servlet.ServletRequestEvent)
     */
    default void requestInitialized(ServletRequestEvent event) {
        // Do nothing.
    }

    /**
     * @see #requestDestroyed(jakarta.servlet.ServletRequestEvent)
     */
    default void requestDestroyed(ServletRequestEvent event) {
        // Do nothing.
    }

    //==================================================================================================================
    // ServletContextListener Implementation Methods
    //==================================================================================================================

    @Override
    default void requestInitialized(jakarta.servlet.ServletRequestEvent event) {
        requestInitialized(ServletShim.of(event));
    }

    @Override
    default void requestDestroyed(jakarta.servlet.ServletRequestEvent event) {
        requestDestroyed(ServletShim.of(event));
    }
}
