package javax.servlet;

import jakarta.annotation.Nonnull;

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
    void forward(
        @Nonnull ServletRequest request,
        @Nonnull ServletResponse response
    ) throws ServletException, IOException;

    /**
     * @see #include(jakarta.servlet.ServletRequest, jakarta.servlet.ServletResponse)
     */
    void include(
        @Nonnull ServletRequest request,
        @Nonnull ServletResponse response
    ) throws ServletException, IOException;

    //==================================================================================================================
    // RequestDispatcher Implementation Methods
    //==================================================================================================================

    @Override
    default void forward(
        @Nonnull jakarta.servlet.ServletRequest request,
        @Nonnull jakarta.servlet.ServletResponse response
    ) throws jakarta.servlet.ServletException, IOException {
        forward(ServletShim.of(request), ServletShim.of(response));
    }

    @Override
    default void include(
        @Nonnull jakarta.servlet.ServletRequest request,
        @Nonnull jakarta.servlet.ServletResponse response
    ) throws jakarta.servlet.ServletException, IOException {
        include(ServletShim.of(request), ServletShim.of(response));
    }
}
