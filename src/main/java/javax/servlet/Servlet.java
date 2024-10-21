package javax.servlet;

import java.io.IOException;

/**
 * @deprecated Use {@link jakarta.servlet.Servlet} instead.
 */
@Deprecated(since = "jakarta.servlet.Servlet")
public interface Servlet extends jakarta.servlet.Servlet, ServletShim {
    //==================================================================================================================
    // Shim Methods
    //==================================================================================================================

    /**
     * @see #init(jakarta.servlet.ServletConfig)
     */
    void init(ServletConfig config) throws ServletException;

    /**
     * @see #service(jakarta.servlet.ServletRequest, jakarta.servlet.ServletResponse)
     */
    void service(ServletRequest request, ServletResponse response) throws ServletException, IOException;

    //==================================================================================================================
    // Servlet Implementation Methods
    //==================================================================================================================

    @Override
    default void init(jakarta.servlet.ServletConfig config) throws jakarta.servlet.ServletException {
        init(ServletShim.of(config));
    }

    @Override
    default void service(
        jakarta.servlet.ServletRequest request,
        jakarta.servlet.ServletResponse response
    ) throws jakarta.servlet.ServletException, IOException {
        service(ServletShim.of(request), ServletShim.of(response));
    }
}
