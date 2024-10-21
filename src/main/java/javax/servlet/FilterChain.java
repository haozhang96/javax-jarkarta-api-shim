package javax.servlet;

import java.io.IOException;

/**
 * @deprecated Use {@link jakarta.servlet.FilterChain} instead.
 */
@Deprecated(since = "jakarta.servlet.FilterChain")
public interface FilterChain extends jakarta.servlet.FilterChain, ServletShim {
    //==================================================================================================================
    // Shim Methods
    //==================================================================================================================

    /**
     * @see #doFilter(jakarta.servlet.ServletRequest, jakarta.servlet.ServletResponse)
     */
    void doFilter(ServletRequest request, ServletResponse response) throws ServletException, IOException;

    //==================================================================================================================
    // FilterChain Implementation Methods
    //==================================================================================================================

    @Override
    default void doFilter(
        jakarta.servlet.ServletRequest request,
        jakarta.servlet.ServletResponse response
    ) throws jakarta.servlet.ServletException, IOException {
        doFilter(ServletShim.of(request), ServletShim.of(response));
    }
}
