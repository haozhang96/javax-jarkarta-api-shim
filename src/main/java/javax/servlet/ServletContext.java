package javax.servlet;

import javax.servlet.descriptor.JspConfigDescriptor;
import java.util.*;

/**
 * @deprecated Use {@link jakarta.servlet.ServletContext} instead.
 */
@Deprecated(since = "jakarta.servlet.ServletContext")
@SuppressWarnings({"unchecked", "rawtypes"})
public interface ServletContext extends jakarta.servlet.ServletContext, ServletShim {
    //==================================================================================================================
    // Shim Methods
    //==================================================================================================================

    /**
     * @see #addServlet(String, jakarta.servlet.Servlet)
     */
    ServletRegistration.Dynamic addServlet(String name, Servlet servlet);

    /**
     * @see #addFilter(String, jakarta.servlet.Filter)
     */
    FilterRegistration.Dynamic addFilter(String name, Filter filter);

    /**
     * @deprecated This method has been deprecated and/or removed since Servlet 2.1.
     */
    @Deprecated(since = "Servlet 2.1", forRemoval = true)
    default Servlet getServlet(String name) throws ServletException {
        return null;
    }

    /**
     * @deprecated This method has been deprecated and/or removed since Servlet 2.1.
     */
    @Deprecated(since = "Servlet 2.1", forRemoval = true)
    default Enumeration<String> getServletNames() {
        return Collections.emptyEnumeration();
    }

    /**
     * @deprecated This method has been deprecated and/or removed since Servlet 2.1.
     */
    @Deprecated(since = "Servlet 2.1", forRemoval = true)
    default Enumeration<Servlet> getServlets() {
        return Collections.emptyEnumeration();
    }

    /**
     * @deprecated This method has been deprecated and/or removed since Servlet 2.1.
     */
    @Deprecated(since = "Servlet 2.1", forRemoval = true)
    default void log(Exception exception, String message) {
        log(message, exception);
    }

    //==================================================================================================================
    // ServletContext Implementation Methods
    //==================================================================================================================

    @Override
    ServletContext getContext(String uriPath);

    @Override
    RequestDispatcher getRequestDispatcher(String path);

    @Override
    RequestDispatcher getNamedDispatcher(String name);

    @Override
    ServletRegistration.Dynamic addServlet(String name, String className);

    @Override
    default ServletRegistration.Dynamic addServlet(String name, jakarta.servlet.Servlet servlet) {
        return addServlet(name, ServletShim.<Servlet>of(servlet));
    }

    @Override
    ServletRegistration.Dynamic addServlet(String name, Class clazz);

    @Override
    ServletRegistration.Dynamic addJspFile(String name, String file);

    @Override
    Servlet createServlet(Class clazz) throws ServletException;

    @Override
    ServletRegistration getServletRegistration(String name);

    @Override
    Map<String, ? extends ServletRegistration> getServletRegistrations();

    @Override
    FilterRegistration.Dynamic addFilter(String name, String className);

    @Override
    default FilterRegistration.Dynamic addFilter(String name, jakarta.servlet.Filter filter) {
        return addFilter(name, ServletShim.<Filter>of(filter));
    }

    @Override
    FilterRegistration.Dynamic addFilter(String name, Class clazz);

    @Override
    Filter createFilter(Class clazz) throws ServletException;

    @Override
    FilterRegistration getFilterRegistration(String name);

    @Override
    Map<String, ? extends FilterRegistration> getFilterRegistrations();

    @Override
    SessionCookieConfig getSessionCookieConfig();

    @Override
    void setSessionTrackingModes(Set sessionTrackingModes);

    @Override
    Set getDefaultSessionTrackingModes();

    @Override
    Set getEffectiveSessionTrackingModes();

    @Override
    <T extends EventListener> T createListener(Class<T> clazz) throws ServletException;

    @Override
    JspConfigDescriptor getJspConfigDescriptor();
}
