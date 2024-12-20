package javax.servlet.http;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletShim;
import java.io.IOException;
import java.util.Collection;

/**
 * @deprecated Use {@link jakarta.servlet.http.HttpServletRequest} instead.
 */
@Deprecated(since = "jakarta.servlet.http.HttpServletRequest")
public interface HttpServletRequest extends jakarta.servlet.http.HttpServletRequest, ServletRequest {
    //==================================================================================================================
    // Shim Methods
    //==================================================================================================================

    /**
     * @see #authenticate(jakarta.servlet.http.HttpServletResponse)
     */
    boolean authenticate(HttpServletResponse response) throws ServletException, IOException;

    /**
     * @deprecated This method has been deprecated and/or removed since Servlet 4.0.
     */
    @Deprecated(since = "Servlet 4.0", forRemoval = true)
    default boolean isRequestedSessionIdFromUrl() {
        return isRequestedSessionIdFromURL();
    }

    //==================================================================================================================
    // HttpServletRequest Implementation Methods
    //==================================================================================================================

    @Override
    Cookie[] getCookies();

    @Override
    default HttpServletMapping getHttpServletMapping() {
        return ServletShim.of(jakarta.servlet.http.HttpServletRequest.super.getHttpServletMapping());
    }

    @Override
    default PushBuilder newPushBuilder() {
        return ServletShim.of(jakarta.servlet.http.HttpServletRequest.super.newPushBuilder());
    }

    @Override
    HttpSession getSession(boolean create);

    @Override
    HttpSession getSession();

    @Override
    default boolean authenticate(
        jakarta.servlet.http.HttpServletResponse response
    ) throws ServletException, IOException {
        return authenticate(ServletShim.of(response));
    }

    @Override
    void login(String username, String password) throws ServletException;

    @Override
    void logout() throws ServletException;

    @Override
    @SuppressWarnings({"unchecked", "rawtypes"})
    Collection getParts() throws ServletException, IOException;

    @Override
    Part getPart(String name) throws ServletException, IOException;

    @Override
    @SuppressWarnings({"unchecked", "rawtypes"})
    HttpUpgradeHandler upgrade(Class clazz) throws ServletException, IOException;
}
