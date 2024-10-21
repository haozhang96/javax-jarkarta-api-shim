package javax.servlet;

/**
 * @deprecated Use {@link jakarta.servlet.ServletContextListener} instead.
 */
@Deprecated(since = "jakarta.servlet.ServletContextListener")
public interface ServletContextListener extends jakarta.servlet.ServletContextListener, ServletShim {
    //==================================================================================================================
    // Shim Methods
    //==================================================================================================================

    /**
     * @see #contextInitialized(jakarta.servlet.ServletContextEvent)
     */
    default void contextInitialized(ServletContextEvent event) {
        // Do nothing.
    }

    /**
     * @see #contextDestroyed(jakarta.servlet.ServletContextEvent)
     */
    default void contextDestroyed(ServletContextEvent event) {
        // Do nothing.
    }

    //==================================================================================================================
    // ServletContextListener Implementation Methods
    //==================================================================================================================

    @Override
    default void contextInitialized(jakarta.servlet.ServletContextEvent event) {
        contextInitialized(ServletShim.of(event));
    }

    @Override
    default void contextDestroyed(jakarta.servlet.ServletContextEvent event) {
        contextDestroyed(ServletShim.of(event));
    }
}
