package javax.servlet;

/**
 * @deprecated Use {@link jakarta.servlet.FilterConfig} instead.
 */
@Deprecated(since = "jakarta.servlet.FilterConfig")
public interface FilterConfig extends jakarta.servlet.FilterConfig, ServletShim {
    //==================================================================================================================
    // FilterConfig Implementation Methods
    //==================================================================================================================

    @Override
    ServletContext getServletContext();
}
