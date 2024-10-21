package javax.servlet;

import java.io.IOException;

/**
 * @deprecated Use {@link jakarta.servlet.GenericServlet} instead.
 */
@Deprecated(since = "jakarta.servlet.GenericServlet")
public abstract class GenericServlet extends jakarta.servlet.GenericServlet implements Servlet, ServletConfig {
    //==================================================================================================================
    // GenericServlet Implementation Methods
    //==================================================================================================================

    @Override
    public ServletConfig getServletConfig() {
        return ServletShim.of(super.getServletConfig());
    }

    //==================================================================================================================
    // Servlet Implementation Methods
    //==================================================================================================================

    @Override
    public void init(ServletConfig config) throws ServletException {
        try {
            super.init(config);
        } catch (jakarta.servlet.ServletException exception) {
            throw ServletShim.of(exception);
        }
    }

    @Override
    public void init(jakarta.servlet.ServletConfig config) throws jakarta.servlet.ServletException {
        Servlet.super.init(config);
    }

    @Override
    public void service(
        jakarta.servlet.ServletRequest request,
        jakarta.servlet.ServletResponse response
    ) throws jakarta.servlet.ServletException, IOException {
        Servlet.super.service(request, response);
    }

    //==================================================================================================================
    // ServletConfig Implementation Methods
    //==================================================================================================================

    @Override
    public ServletContext getServletContext() {
        return ServletShim.of(super.getServletContext());
    }
}
