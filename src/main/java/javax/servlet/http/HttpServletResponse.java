package javax.servlet.http;

import javax.servlet.ServletResponse;
import javax.servlet.ServletShim;

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

    //==================================================================================================================
    // HttpServletResponse Implementation Methods
    //==================================================================================================================

    @Override
    default void addCookie(jakarta.servlet.http.Cookie cookie) {
        addCookie(ServletShim.of(cookie));
    }
}
