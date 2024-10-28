package javax.servlet;

import java.io.IOException;

/**
 * @deprecated Use {@link jakarta.servlet.Filter} instead.
 */
@Deprecated(since = "jakarta.servlet.Filter")
public interface Filter extends jakarta.servlet.Filter, ServletShim {
    //==================================================================================================================
    // Shim Methods
    //==================================================================================================================

    /**
     * @see #init(jakarta.servlet.FilterConfig)
     */
    void init(FilterConfig config) throws ServletException;

    /**
     * @see #doFilter(jakarta.servlet.ServletRequest, jakarta.servlet.ServletResponse, jakarta.servlet.FilterChain)
     */
    void doFilter(
        ServletRequest request,
        ServletResponse response,
        FilterChain chain
    ) throws ServletException, IOException;

    //==================================================================================================================
    // Filter Implementation Methods
    //==================================================================================================================

    @Override
    default void init(jakarta.servlet.FilterConfig config) throws ServletException {
        init(ServletShim.of(config));
    }

    @Override
    default void doFilter(
        jakarta.servlet.ServletRequest request,
        jakarta.servlet.ServletResponse response,
        jakarta.servlet.FilterChain chain
    ) throws ServletException, IOException {
        doFilter(ServletShim.of(request), ServletShim.of(response), ServletShim.of(chain));
    }
}
