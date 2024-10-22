package javax.servlet.http;

import javax.servlet.ServletContext;
import javax.servlet.ServletShim;

/**
 * @deprecated Use {@link jakarta.servlet.http.HttpSession} instead.
 */
@Deprecated(since = "jakarta.servlet.http.HttpSession")
public interface HttpSession extends jakarta.servlet.http.HttpSession, ServletShim {
    //==================================================================================================================
    // HttpSession Implementation Methods
    //==================================================================================================================

    @Override
    ServletContext getServletContext();
}
