package javax.servlet;

/**
 * @deprecated Use {@link jakarta.servlet.ServletContext} instead.
 */
@Deprecated(since = "jakarta.servlet.ServletContext")
public interface ServletContext extends jakarta.servlet.ServletContext, ServletShim {
    //==================================================================================================================
    // ServletContext Implementation Methods
    //==================================================================================================================

    @Override
    ServletContext getContext(String uriPath);

    @Override
    RequestDispatcher getRequestDispatcher(String path);

    @Override
    RequestDispatcher getNamedDispatcher(String name);

    // TODO: Rest of the methods
}
