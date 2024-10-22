package javax.servlet.http;

import javax.servlet.*;
import java.io.IOException;

/**
 * @deprecated Use {@link jakarta.servlet.http.HttpFilter} instead.
 */
@Deprecated(since = "jakarta.servlet.http.HttpFilter")
public abstract class HttpFilter extends GenericFilter {
    private static final long serialVersionUID = 7478463438252262094L; // Use the ID from jakarta.servlet.

    //==================================================================================================================
    // HttpFilter Implementation Methods
    //==================================================================================================================

    /**
     * @see jakarta.servlet.http.HttpFilter#doFilter(jakarta.servlet.http.HttpServletRequest, jakarta.servlet.http.HttpServletResponse, jakarta.servlet.FilterChain)
     */
    @SuppressWarnings("JavadocReference")
    protected void doFilter(
        HttpServletRequest request,
        HttpServletResponse response,
        FilterChain chain
    ) throws ServletException, IOException {
        chain.doFilter(request, response);
    }

    //==================================================================================================================
    // Filter Implementation Methods
    //==================================================================================================================

    @Override
    public void doFilter(
        ServletRequest request,
        ServletResponse response,
        FilterChain chain
    ) throws ServletException, IOException {
        if (!(request instanceof HttpServletRequest && response instanceof HttpServletResponse)) {
            throw new ServletException("non-HTTP request or response");
        }

        doFilter((HttpServletRequest) request, (HttpServletResponse) response, chain);
    }

    @Override
    public void doFilter(
        jakarta.servlet.ServletRequest request,
        jakarta.servlet.ServletResponse response,
        jakarta.servlet.FilterChain chain
    ) throws jakarta.servlet.ServletException, IOException {
        if (!(request instanceof jakarta.servlet.http.HttpServletRequest && response instanceof jakarta.servlet.http.HttpServletResponse)) {
            throw new ServletException("non-HTTP request or response");
        }

        super.doFilter(request, response, chain);
    }
}
