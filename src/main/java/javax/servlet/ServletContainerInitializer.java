package javax.servlet;

import java.util.Set;

/**
 * @deprecated Use {@link jakarta.servlet.ServletContainerInitializer} instead.
 */
@Deprecated(since = "jakarta.servlet.ServletContainerInitializer")
public interface ServletContainerInitializer extends jakarta.servlet.ServletContainerInitializer, ServletShim {
    //==================================================================================================================
    // Shim Methods
    //==================================================================================================================

    /**
     * @see #onStartup(Set, jakarta.servlet.ServletContext)
     */
    void onStartup(Set<Class<?>> classes, ServletContext context) throws ServletException;

    //==================================================================================================================
    // ServletContainerInitializer Implementation Methods
    //==================================================================================================================

    @Override
    default void onStartup(
        Set<Class<?>> classes,
        jakarta.servlet.ServletContext context
    ) throws ServletException {
        onStartup(classes, ServletShim.of(context));
    }
}
