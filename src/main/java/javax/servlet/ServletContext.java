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
    ServletRegistration.Dynamic addServlet(String servletName, Servlet servlet);

    /**
     * @see #addFilter(String, jakarta.servlet.Filter)
     */
    FilterRegistration.Dynamic addFilter(String filterName, Filter filter);

    /**
     * @deprecated This method is no longer available since Servlet 2.1.
     */
    @Deprecated(since = "Servlet 2.1", forRemoval = true)
    default Servlet getServlet(String name) throws ServletException {
        return null;
    }

    /**
     * @deprecated This method is no longer available since Servlet 2.1.
     */
    @Deprecated(since = "Servlet 2.1", forRemoval = true)
    default Enumeration<String> getServletNames() {
        return Collections.emptyEnumeration();
    }

    /**
     * @deprecated This method is no longer available since Servlet 2.1.
     */
    @Deprecated(since = "Servlet 2.1", forRemoval = true)
    default Enumeration<Servlet> getServlets() {
        return Collections.emptyEnumeration();
    }

    /**
     * @deprecated This method is no longer available since Servlet 2.1.
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
    ServletRegistration.Dynamic addServlet(String servletName, String className);

    @Override
    default ServletRegistration.Dynamic addServlet(String servletName, jakarta.servlet.Servlet servlet) {
        return addServlet(servletName, ServletShim.<jakarta.servlet.Servlet, Servlet>of(servlet));
    }

    @Override
    ServletRegistration.Dynamic addServlet(String servletName, Class servletClass);

    @Override
    ServletRegistration.Dynamic addJspFile(String servletName, String jspFile);

    @Override
    Servlet createServlet(Class clazz) throws ServletException;

    @Override
    ServletRegistration getServletRegistration(String servletName);

    @Override
    Map<String, ? extends ServletRegistration> getServletRegistrations();

    @Override
    FilterRegistration.Dynamic addFilter(String filterName, String className);

    @Override
    default FilterRegistration.Dynamic addFilter(String filterName, jakarta.servlet.Filter filter) {
        return addFilter(filterName, ServletShim.<jakarta.servlet.Filter, Filter>of(filter));
    }

    @Override
    FilterRegistration.Dynamic addFilter(String filterName, Class filterClass);

    @Override
    Filter createFilter(Class clazz) throws ServletException;

    @Override
    FilterRegistration getFilterRegistration(String filterName);

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
