package javax.servlet;

import java.io.IOException;

/**
 * @deprecated Use {@link jakarta.servlet.RequestDispatcher} instead.
 */
@Deprecated(since = "jakarta.servlet.RequestDispatcher")
public interface RequestDispatcher extends jakarta.servlet.RequestDispatcher, ServletShim {
    //==================================================================================================================
    // Shim Methods
    //==================================================================================================================

    /**
     * @see #forward(jakarta.servlet.ServletRequest, jakarta.servlet.ServletResponse)
     */
    void forward(ServletRequest request, ServletResponse response) throws ServletException, IOException;

    /**
     * @see #include(jakarta.servlet.ServletRequest, jakarta.servlet.ServletResponse)
     */
    void include(ServletRequest request, ServletResponse response) throws ServletException, IOException;

    //==================================================================================================================
    // RequestDispatcher Implementation Methods
    //==================================================================================================================

    @Override
    default void forward(
        jakarta.servlet.ServletRequest request,
        jakarta.servlet.ServletResponse response
    ) throws ServletException, IOException {
        forward(ServletShim.of(request), ServletShim.of(response));
    }

    @Override
    default void include(
        jakarta.servlet.ServletRequest request,
        jakarta.servlet.ServletResponse response
    ) throws ServletException, IOException {
        include(ServletShim.of(request), ServletShim.of(response));
    }
}
