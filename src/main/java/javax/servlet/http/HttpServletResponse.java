package javax.servlet.http;

import javax.servlet.ServletResponse;
import javax.servlet.ServletShim;
import java.io.IOException;
import java.io.UncheckedIOException;

/**
 * @deprecated Use {@link jakarta.servlet.http.HttpServletResponse} instead.
 */
@Deprecated(since = "jakarta.servlet.http.HttpServletResponse")
public interface HttpServletResponse extends jakarta.servlet.http.HttpServletResponse, ServletResponse {
    //==================================================================================================================
    // Shim Methods
    //==================================================================================================================

    /**
     * @see #addCookie(jakarta.servlet.http.Cookie)
     */
    void addCookie(Cookie cookie);

    /**
     * @deprecated This method has been deprecated and/or removed since Servlet 2.1.
     */
    @Deprecated(since = "Servlet 2.1", forRemoval = true)
    default String encodeUrl(String url) {
        return encodeURL(url);
    }

    /**
     * @deprecated This method has been deprecated and/or removed since Servlet 2.1.
     */
    @Deprecated(since = "Servlet 2.1", forRemoval = true)
    default String encodeRedirectUrl(String url) {
        return encodeRedirectURL(url);
    }

    /**
     * @deprecated This method has been deprecated and/or removed since Servlet 2.1.
     */
    @Deprecated(since = "Servlet 2.1", forRemoval = true)
    default void setStatus(int statusCode, String statusMessage) {
        try {
            setStatus(statusCode);
            getWriter().println(statusMessage);
        } catch (IOException exception) {
            throw new UncheckedIOException("Failed to write response status message", exception);
        }
    }

    //==================================================================================================================
    // HttpServletResponse Implementation Methods
    //==================================================================================================================

    @Override
    default void addCookie(jakarta.servlet.http.Cookie cookie) {
        addCookie(ServletShim.of(cookie));
    }
}
