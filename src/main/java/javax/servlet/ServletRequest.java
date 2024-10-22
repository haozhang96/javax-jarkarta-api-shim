package javax.servlet;

import java.io.IOException;

/**
 * @deprecated Use {@link jakarta.servlet.ServletRequest} instead.
 */
@Deprecated(since = "jakarta.servlet.ServletRequest")
public interface ServletRequest extends jakarta.servlet.ServletRequest, ServletShim {
    //==================================================================================================================
    // Shim Methods
    //==================================================================================================================

    /**
     * @see #startAsync(jakarta.servlet.ServletRequest, jakarta.servlet.ServletResponse)
     */
    AsyncContext startAsync(ServletRequest request, ServletResponse response) throws IllegalStateException;

    //==================================================================================================================
    // ServletRequest Implementation Methods
    //==================================================================================================================

    @Override
    ServletInputStream getInputStream() throws IOException;

    @Override
    RequestDispatcher getRequestDispatcher(String path);

    @Override
    ServletContext getServletContext();

    @Override
    AsyncContext startAsync() throws IllegalStateException;

    @Override
    default AsyncContext startAsync(
        jakarta.servlet.ServletRequest request,
        jakarta.servlet.ServletResponse response
    ) throws IllegalStateException {
        return startAsync(ServletShim.of(request), ServletShim.of(response));
    }

    @Override
    AsyncContext getAsyncContext();

    @Override
    ServletConnection getServletConnection();
}
