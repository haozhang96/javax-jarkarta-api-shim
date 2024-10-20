package javax.servlet;

import jakarta.annotation.Nonnull;

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
    void init(@Nonnull ServletConfig config) throws ServletException;

    /**
     * @see #service(jakarta.servlet.ServletRequest, jakarta.servlet.ServletResponse)
     */
    void service(
        @Nonnull ServletRequest request,
        @Nonnull ServletResponse response
    ) throws ServletException, IOException;

    //==================================================================================================================
    // Servlet Implementation Methods
    //==================================================================================================================

    @Override
    default void init(@Nonnull jakarta.servlet.ServletConfig config) throws jakarta.servlet.ServletException {
        init(ServletShim.of(config));
    }

    @Override
    ServletConfig getServletConfig();

    @Override
    default void service(
        @Nonnull jakarta.servlet.ServletRequest request,
        @Nonnull jakarta.servlet.ServletResponse response
    ) throws jakarta.servlet.ServletException, IOException {
        service(ServletShim.of(request), ServletShim.of(response));
    }

    @Override
    String getServletInfo();

    @Override
    void destroy();
}
