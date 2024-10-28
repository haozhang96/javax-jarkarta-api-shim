package javax.servlet.http;

import javax.servlet.ServletContext;
import javax.servlet.ServletShim;
import java.util.Enumeration;

/**
 * @deprecated Use {@link jakarta.servlet.http.HttpSession} instead.
 */
@Deprecated(since = "jakarta.servlet.http.HttpSession")
public interface HttpSession extends jakarta.servlet.http.HttpSession, ServletShim {
    //==================================================================================================================
    // Shim Methods
    //==================================================================================================================

    /**
     * @deprecated This method has been deprecated and/or removed since Servlet 2.1.
     */
    @Deprecated(since = "Servlet 2.1", forRemoval = true)
    default HttpSessionContext getSessionContext() {
        return null;
    }

    /**
     * @deprecated This method has been deprecated and/or removed since Servlet 2.1.
     */
    @Deprecated(since = "Servlet 2.1", forRemoval = true)
    default Object getValue(String name) {
        return getAttribute(name);
    }

    /**
     * @deprecated This method has been deprecated and/or removed since Servlet 2.1.
     */
    @Deprecated(since = "Servlet 2.1", forRemoval = true)
    default Enumeration<String> getValueNames() {
        return getAttributeNames();
    }

    /**
     * @deprecated This method has been deprecated and/or removed since Servlet 2.1.
     */
    @Deprecated(since = "Servlet 2.1", forRemoval = true)
    default void putValue(String name, Object value) {
        setAttribute(name, value);
    }

    /**
     * @deprecated This method has been deprecated and/or removed since Servlet 2.1.
     */
    @Deprecated(since = "Servlet 2.1", forRemoval = true)
    default void removeValue(String name) {
        removeAttribute(name);
    }

    //==================================================================================================================
    // HttpSession Implementation Methods
    //==================================================================================================================

    @Override
    ServletContext getServletContext();
}
