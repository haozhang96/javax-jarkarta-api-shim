package javax.servlet;

/**
 * @deprecated Use {@link jakarta.servlet.GenericFilter} instead.
 */
@Deprecated(since = "jakarta.servlet.GenericFilter")
public abstract class GenericFilter extends jakarta.servlet.GenericFilter implements Filter, FilterConfig {
    //==================================================================================================================
    // GenericFilter Implementation Methods
    //==================================================================================================================

    @Override
    public FilterConfig getFilterConfig() {
        return ServletShim.of(super.getFilterConfig());
    }

    //==================================================================================================================
    // Filter Implementation Methods
    //==================================================================================================================

    @Override
    public void init(FilterConfig config) throws ServletException {
        try {
            super.init(config);
        } catch (jakarta.servlet.ServletException exception) {
            throw ServletShim.of(exception);
        }
    }

    @Override
    public void init(jakarta.servlet.FilterConfig config) throws jakarta.servlet.ServletException {
        Filter.super.init(config);
    }

    //==================================================================================================================
    // FilterConfig Implementation Methods
    //==================================================================================================================

    @Override
    public ServletContext getServletContext() {
        return ServletShim.of(super.getServletContext());
    }
}
