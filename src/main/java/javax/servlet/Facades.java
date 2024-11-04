package javax.servlet;

import javax.Shim;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.Principal;
import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * This interface contains {@link jakarta.servlet}-to-{@link javax.servlet} facades used for wrapping Jakarta Servlet
 *   objects into their Java Servlet counterparts.
 *
 * @deprecated Use {@link jakarta.servlet} instead.
 */
@Deprecated(since = "jakarta.servlet")
@SuppressWarnings("all")
interface Facades {
    //==================================================================================================================
    // Annotations
    //==================================================================================================================

    final class HandlesTypes extends Shim.Delegate.Annotation<jakarta.servlet.annotation.HandlesTypes> implements javax.servlet.annotation.HandlesTypes, ServletShim {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        HandlesTypes(jakarta.servlet.annotation.HandlesTypes delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public Class<?>[] value() {
            return delegate.value();
        }
    }

    final class HttpConstraint extends Shim.Delegate.Annotation<jakarta.servlet.annotation.HttpConstraint> implements javax.servlet.annotation.HttpConstraint, ServletShim {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        HttpConstraint(jakarta.servlet.annotation.HttpConstraint delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public ServletSecurity.EmptyRoleSemantic value() {
            return ServletShim.of(delegate.value());
        }

        @Override
        public ServletSecurity.TransportGuarantee transportGuarantee() {
            return ServletShim.of(delegate.transportGuarantee());
        }

        @Override
        public String[] rolesAllowed() {
            return delegate.rolesAllowed();
        }
    }

    final class HttpMethodConstraint extends Shim.Delegate.Annotation<jakarta.servlet.annotation.HttpMethodConstraint> implements javax.servlet.annotation.HttpMethodConstraint, ServletShim {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        HttpMethodConstraint(jakarta.servlet.annotation.HttpMethodConstraint delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public String value() {
            return delegate.value();
        }

        @Override
        public ServletSecurity.EmptyRoleSemantic emptyRoleSemantic() {
            return ServletShim.of(delegate.value());
        }

        @Override
        public ServletSecurity.TransportGuarantee transportGuarantee() {
            return ServletShim.of(delegate.transportGuarantee());
        }

        @Override
        public String[] rolesAllowed() {
            return delegate.rolesAllowed();
        }
    }

    final class MultipartConfig extends Shim.Delegate.Annotation<jakarta.servlet.annotation.MultipartConfig> implements javax.servlet.annotation.MultipartConfig, ServletShim {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        MultipartConfig(jakarta.servlet.annotation.MultipartConfig delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public String location() {
            return delegate.location();
        }

        @Override
        public long maxFileSize() {
            return delegate.maxFileSize();
        }

        @Override
        public long maxRequestSize() {
            return delegate.maxRequestSize();
        }

        @Override
        public int fileSizeThreshold() {
            return delegate.fileSizeThreshold();
        }
    }

    final class ServletSecurity extends Shim.Delegate.Annotation<jakarta.servlet.annotation.ServletSecurity> implements javax.servlet.annotation.ServletSecurity, ServletShim {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        ServletSecurity(jakarta.servlet.annotation.ServletSecurity delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public javax.servlet.annotation.HttpConstraint value() {
            return ServletShim.of(delegate.value());
        }

        @Override
        public javax.servlet.annotation.HttpMethodConstraint[] httpMethodConstraints() {
            return Stream
                .of(delegate.httpMethodConstraints())
                .<javax.servlet.annotation.HttpMethodConstraint>map(ServletShim::of)
                .toArray(javax.servlet.annotation.HttpMethodConstraint[]::new);
        }
    }

    final class WebFilter extends Shim.Delegate.Annotation<jakarta.servlet.annotation.WebFilter> implements javax.servlet.annotation.WebFilter, ServletShim {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        WebFilter(jakarta.servlet.annotation.WebFilter delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public String description() {
            return delegate.description();
        }

        @Override
        public String displayName() {
            return delegate.displayName();
        }

        @Override
        public javax.servlet.annotation.WebInitParam[] initParams() {
            return Stream
                .of(delegate.initParams())
                .<javax.servlet.annotation.WebInitParam>map(ServletShim::of)
                .toArray(javax.servlet.annotation.WebInitParam[]::new);
        }

        @Override
        public String filterName() {
            return delegate.filterName();
        }

        @Override
        public String smallIcon() {
            return delegate.smallIcon();
        }

        @Override
        public String largeIcon() {
            return delegate.largeIcon();
        }

        @Override
        public String[] servletNames() {
            return delegate.servletNames();
        }

        @Override
        public String[] value() {
            return delegate.value();
        }

        @Override
        public String[] urlPatterns() {
            return delegate.urlPatterns();
        }

        @Override
        public javax.servlet.DispatcherType[] dispatcherTypes() {
            return ServletShim
                .<javax.servlet.DispatcherType>of(delegate.dispatcherTypes())
                .toArray(javax.servlet.DispatcherType[]::new);
        }

        @Override
        public boolean asyncSupported() {
            return delegate.asyncSupported();
        }
    }

    final class WebInitParam extends Shim.Delegate.Annotation<jakarta.servlet.annotation.WebInitParam> implements javax.servlet.annotation.WebInitParam, ServletShim {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        WebInitParam(jakarta.servlet.annotation.WebInitParam delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public String name() {
            return delegate.name();
        }

        @Override
        public String value() {
            return delegate.value();
        }

        @Override
        public String description() {
            return delegate.description();
        }
    }

    final class WebListener extends Shim.Delegate.Annotation<jakarta.servlet.annotation.WebListener> implements javax.servlet.annotation.WebListener, ServletShim {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        WebListener(jakarta.servlet.annotation.WebListener delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public String value() {
            return delegate.value();
        }
    }

    final class WebServlet extends Shim.Delegate.Annotation<jakarta.servlet.annotation.WebServlet> implements javax.servlet.annotation.WebServlet, ServletShim {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        WebServlet(jakarta.servlet.annotation.WebServlet delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public String name() {
            return delegate.name();
        }

        @Override
        public String[] value() {
            return delegate.value();
        }

        @Override
        public String[] urlPatterns() {
            return delegate.urlPatterns();
        }

        @Override
        public int loadOnStartup() {
            return delegate.loadOnStartup();
        }

        @Override
        public javax.servlet.annotation.WebInitParam[] initParams() {
            return Stream
                .of(delegate.initParams())
                .<javax.servlet.annotation.WebInitParam>map(ServletShim::of)
                .toArray(javax.servlet.annotation.WebInitParam[]::new);
        }

        @Override
        public boolean asyncSupported() {
            return delegate.asyncSupported();
        }

        @Override
        public String smallIcon() {
            return delegate.smallIcon();
        }

        @Override
        public String largeIcon() {
            return delegate.largeIcon();
        }

        @Override
        public String description() {
            return delegate.description();
        }

        @Override
        public String displayName() {
            return delegate.displayName();
        }
    }

    //==================================================================================================================
    // Classes
    //==================================================================================================================

    final class AsyncContext extends Shim.Delegate<jakarta.servlet.AsyncContext> implements javax.servlet.AsyncContext {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        AsyncContext(jakarta.servlet.AsyncContext delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public void dispatch(javax.servlet.ServletContext context, String path) {
            delegate.dispatch(context, path);
        }

        @Override
        public void dispatch(jakarta.servlet.ServletContext context, String path) {
            delegate.dispatch(context, path);
        }

        @Override
        public void addListener(javax.servlet.AsyncListener listener) {
            delegate.addListener(listener);
        }

        @Override
        public void addListener(jakarta.servlet.AsyncListener listener) {
            delegate.addListener(listener);
        }

        @Override
        public void addListener(
            javax.servlet.AsyncListener listener,
            javax.servlet.ServletRequest request,
            javax.servlet.ServletResponse response
        ) {
            delegate.addListener(listener, request, response);
        }

        @Override
        public void addListener(
            jakarta.servlet.AsyncListener listener,
            jakarta.servlet.ServletRequest request,
            jakarta.servlet.ServletResponse response
        ) {
            delegate.addListener(listener, request, response);
        }

        @Override
        public javax.servlet.AsyncListener createListener(Class clazz) throws javax.servlet.ServletException {
            try {
                return ServletShim.of(delegate.createListener(clazz.asSubclass(jakarta.servlet.AsyncListener.class)));
            } catch (jakarta.servlet.ServletException exception) {
                throw ServletShim.of(exception);
            }
        }

        @Override
        public javax.servlet.ServletResponse getResponse() {
            return ServletShim.of(delegate.getResponse());
        }

        @Override
        public javax.servlet.ServletRequest getRequest() {
            return ServletShim.of(delegate.getRequest());
        }

        @Override
        public boolean hasOriginalRequestAndResponse() {
            return delegate.hasOriginalRequestAndResponse();
        }

        @Override
        public void dispatch() {
            delegate.dispatch();
        }

        @Override
        public void dispatch(String path) {
            delegate.dispatch(path);
        }

        @Override
        public void complete() {
            delegate.complete();
        }

        @Override
        public void start(Runnable run) {
            delegate.start(run);
        }

        @Override
        public void setTimeout(long timeout) {
            delegate.setTimeout(timeout);
        }

        @Override
        public long getTimeout() {
            return delegate.getTimeout();
        }
    }

    final class AsyncEvent extends javax.servlet.AsyncEvent {
        private final jakarta.servlet.AsyncEvent delegate;

        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        AsyncEvent(jakarta.servlet.AsyncEvent delegate) {
            super(
                ServletShim.of(delegate.getAsyncContext()),
                ServletShim.of(delegate.getSuppliedRequest()),
                ServletShim.of(delegate.getSuppliedResponse()),
                delegate.getThrowable()
            );
            this.delegate = delegate;
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public javax.servlet.AsyncContext getAsyncContext() {
            return ServletShim.of(delegate.getAsyncContext());
        }

        @Override
        public javax.servlet.ServletRequest getSuppliedRequest() {
            return ServletShim.of(delegate.getSuppliedRequest());
        }

        @Override
        public javax.servlet.ServletResponse getSuppliedResponse() {
            return ServletShim.of(delegate.getSuppliedResponse());
        }

        @Override
        public Throwable getThrowable() {
            return delegate.getThrowable();
        }
    }

    final class AsyncListener extends Shim.Delegate<jakarta.servlet.AsyncListener> implements javax.servlet.AsyncListener {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        AsyncListener(jakarta.servlet.AsyncListener delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public void onComplete(javax.servlet.AsyncEvent event) throws IOException {
            delegate.onComplete(event);
        }

        @Override
        public void onComplete(jakarta.servlet.AsyncEvent event) throws IOException {
            delegate.onComplete(event);
        }

        @Override
        public void onTimeout(javax.servlet.AsyncEvent event) throws IOException {
            delegate.onTimeout(event);
        }

        @Override
        public void onTimeout(jakarta.servlet.AsyncEvent event) throws IOException {
            delegate.onTimeout(event);
        }

        @Override
        public void onError(javax.servlet.AsyncEvent event) throws IOException {
            delegate.onError(event);
        }

        @Override
        public void onError(jakarta.servlet.AsyncEvent event) throws IOException {
            delegate.onError(event);
        }

        @Override
        public void onStartAsync(javax.servlet.AsyncEvent event) throws IOException {
            delegate.onStartAsync(event);
        }

        @Override
        public void onStartAsync(jakarta.servlet.AsyncEvent event) throws IOException {
            delegate.onStartAsync(event);
        }
    }

    @SuppressWarnings("removal")
    final class Cookie extends javax.servlet.http.Cookie {
        private final jakarta.servlet.http.Cookie delegate;

        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        Cookie(jakarta.servlet.http.Cookie delegate) {
            super(delegate.getName(), delegate.getValue());
            this.delegate = delegate;
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public void setComment(String purpose) {
            delegate.setComment(purpose);
        }

        @Override
        public String getComment() {
            return delegate.getComment();
        }

        @Override
        public void setDomain(String domain) {
            delegate.setDomain(domain);
        }

        @Override
        public String getDomain() {
            return delegate.getDomain();
        }

        @Override
        public void setMaxAge(int expiry) {
            delegate.setMaxAge(expiry);
        }

        @Override
        public int getMaxAge() {
            return delegate.getMaxAge();
        }

        @Override
        public void setPath(String uri) {
            delegate.setPath(uri);
        }

        @Override
        public String getPath() {
            return delegate.getPath();
        }

        @Override
        public void setSecure(boolean flag) {
            delegate.setSecure(flag);
        }

        @Override
        public boolean getSecure() {
            return delegate.getSecure();
        }

        @Override
        public String getName() {
            return delegate.getName();
        }

        @Override
        public void setValue(String newValue) {
            delegate.setValue(newValue);
        }

        @Override
        public String getValue() {
            return delegate.getValue();
        }

        @Override
        public int getVersion() {
            return delegate.getVersion();
        }

        @Override
        public void setVersion(int v) {
            delegate.setVersion(v);
        }

        @Override
        public Object clone() {
            return delegate.clone();
        }

        @Override
        public void setHttpOnly(boolean httpOnly) {
            delegate.setHttpOnly(httpOnly);
        }

        @Override
        public boolean isHttpOnly() {
            return delegate.isHttpOnly();
        }

        @Override
        public void setAttribute(String name, String value) {
            delegate.setAttribute(name, value);
        }

        @Override
        public String getAttribute(String name) {
            return delegate.getAttribute(name);
        }

        @Override
        public Map<String, String> getAttributes() {
            return delegate.getAttributes();
        }

        @Override
        public int hashCode() {
            return delegate.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            return delegate.equals(obj);
        }

        @Override
        public String toString() {
            return delegate.toString();
        }
    }

    final class Filter extends Shim.Delegate<jakarta.servlet.Filter> implements javax.servlet.Filter {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        Filter(jakarta.servlet.Filter delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public void init(javax.servlet.FilterConfig config) throws javax.servlet.ServletException {
            try {
                delegate.init(config);
            } catch (jakarta.servlet.ServletException exception) {
                throw ServletShim.of(exception);
            }
        }

        @Override
        public void init(jakarta.servlet.FilterConfig config) throws javax.servlet.ServletException {
            try {
                delegate.init(config);
            } catch (jakarta.servlet.ServletException exception) {
                throw ServletShim.of(exception);
            }
        }

        @Override
        public void doFilter(
            javax.servlet.ServletRequest request,
            javax.servlet.ServletResponse response,
            javax.servlet.FilterChain chain
        ) throws javax.servlet.ServletException, IOException {
            try {
                delegate.doFilter(request, response, chain);
            } catch (jakarta.servlet.ServletException exception) {
                throw ServletShim.of(exception);
            }
        }

        @Override
        public void doFilter(
            jakarta.servlet.ServletRequest request,
            jakarta.servlet.ServletResponse response,
            jakarta.servlet.FilterChain chain
        ) throws javax.servlet.ServletException, IOException {
            try {
                delegate.doFilter(request, response, chain);
            } catch (jakarta.servlet.ServletException exception) {
                throw ServletShim.of(exception);
            }
        }

        @Override
        public void destroy() {
            delegate.destroy();
        }
    }

    final class FilterChain extends Shim.Delegate<jakarta.servlet.FilterChain> implements javax.servlet.FilterChain {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        FilterChain(jakarta.servlet.FilterChain delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public void doFilter(
            javax.servlet.ServletRequest request,
            javax.servlet.ServletResponse response
        ) throws javax.servlet.ServletException, IOException {
            try {
                delegate.doFilter(request, response);
            } catch (jakarta.servlet.ServletException exception) {
                throw ServletShim.of(exception);
            }
        }

        @Override
        public void doFilter(
            jakarta.servlet.ServletRequest request,
            jakarta.servlet.ServletResponse response
        ) throws javax.servlet.ServletException, IOException {
            try {
                delegate.doFilter(request, response);
            } catch (jakarta.servlet.ServletException exception) {
                throw ServletShim.of(exception);
            }
        }
    }

    final class FilterConfig extends Shim.Delegate<jakarta.servlet.FilterConfig> implements javax.servlet.FilterConfig {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        FilterConfig(jakarta.servlet.FilterConfig delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public String getFilterName() {
            return delegate.getFilterName();
        }

        @Override
        public javax.servlet.ServletContext getServletContext() {
            return ServletShim.of(delegate.getServletContext());
        }

        @Override
        public String getInitParameter(String name) {
            return delegate.getInitParameter(name);
        }

        @Override
        public Enumeration<String> getInitParameterNames() {
            return delegate.getInitParameterNames();
        }
    }

    final class FilterRegistration extends Shim.Delegate<jakarta.servlet.FilterRegistration> implements javax.servlet.FilterRegistration {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        FilterRegistration(jakarta.servlet.FilterRegistration delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public void addMappingForServletNames(EnumSet dispatcherTypes, boolean isMatchAfter, String... servletNames) {
            delegate.addMappingForServletNames(dispatcherTypes, isMatchAfter, servletNames);
        }

        @Override
        public void addMappingForUrlPatterns(EnumSet dispatcherTypes, boolean isMatchAfter, String... urlPatterns) {
            delegate.addMappingForUrlPatterns(dispatcherTypes, isMatchAfter, urlPatterns);
        }

        @Override
        public Collection<String> getServletNameMappings() {
            return delegate.getServletNameMappings();
        }

        @Override
        public Collection<String> getUrlPatternMappings() {
            return delegate.getUrlPatternMappings();
        }

        @Override
        public String getName() {
            return delegate.getName();
        }

        @Override
        public String getClassName() {
            return delegate.getClassName();
        }

        @Override
        public boolean setInitParameter(String name, String value) {
            return delegate.setInitParameter(name, value);
        }

        @Override
        public String getInitParameter(String name) {
            return delegate.getInitParameter(name);
        }

        @Override
        public Set<String> setInitParameters(Map<String, String> initParameters) {
            return delegate.setInitParameters(initParameters);
        }

        @Override
        public Map<String, String> getInitParameters() {
            return delegate.getInitParameters();
        }
    }

    final class FilterRegistration$Dynamic extends Shim.Delegate<jakarta.servlet.FilterRegistration.Dynamic> implements javax.servlet.FilterRegistration.Dynamic {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        FilterRegistration$Dynamic(jakarta.servlet.FilterRegistration.Dynamic delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public void addMappingForServletNames(EnumSet dispatcherTypes, boolean isMatchAfter, String... servletNames) {
            delegate.addMappingForServletNames(dispatcherTypes, isMatchAfter, servletNames);
        }

        @Override
        public void addMappingForUrlPatterns(EnumSet dispatcherTypes, boolean isMatchAfter, String... urlPatterns) {
            delegate.addMappingForUrlPatterns(dispatcherTypes, isMatchAfter, urlPatterns);
        }

        @Override
        public Collection<String> getServletNameMappings() {
            return delegate.getServletNameMappings();
        }

        @Override
        public Collection<String> getUrlPatternMappings() {
            return delegate.getUrlPatternMappings();
        }

        @Override
        public String getName() {
            return delegate.getName();
        }

        @Override
        public String getClassName() {
            return delegate.getClassName();
        }

        @Override
        public boolean setInitParameter(String name, String value) {
            return delegate.setInitParameter(name, value);
        }

        @Override
        public String getInitParameter(String name) {
            return delegate.getInitParameter(name);
        }

        @Override
        public Set<String> setInitParameters(Map<String, String> initParameters) {
            return delegate.setInitParameters(initParameters);
        }

        @Override
        public Map<String, String> getInitParameters() {
            return delegate.getInitParameters();
        }

        @Override
        public void setAsyncSupported(boolean isAsyncSupported) {
            delegate.setAsyncSupported(isAsyncSupported);
        }
    }

    final class GenericFilter extends javax.servlet.GenericFilter {
        private static final long serialVersionUID = 4060116231031076581L; // Use the ID from jakarta.servlet.

        private final jakarta.servlet.GenericFilter delegate;

        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        GenericFilter(jakarta.servlet.GenericFilter delegate) {
            this.delegate = delegate;
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public String getInitParameter(String name) {
            return delegate.getInitParameter(name);
        }

        @Override
        public Enumeration<String> getInitParameterNames() {
            return delegate.getInitParameterNames();
        }

        @Override
        public javax.servlet.FilterConfig getFilterConfig() {
            return ServletShim.of(delegate.getFilterConfig());
        }

        @Override
        public javax.servlet.ServletContext getServletContext() {
            return ServletShim.of(delegate.getServletContext());
        }

        @Override
        public void init(jakarta.servlet.FilterConfig config) throws javax.servlet.ServletException {
            try {
                delegate.init(config);
            } catch (jakarta.servlet.ServletException exception) {
                throw ServletShim.of(exception);
            }
        }

        @Override
        public void init() throws javax.servlet.ServletException {
            try {
                delegate.init();
            } catch (jakarta.servlet.ServletException exception) {
                throw ServletShim.of(exception);
            }
        }

        @Override
        public String getFilterName() {
            return delegate.getFilterName();
        }

        @Override
        public void doFilter(
            javax.servlet.ServletRequest request,
            javax.servlet.ServletResponse response,
            javax.servlet.FilterChain chain
        ) throws javax.servlet.ServletException, IOException {
            try {
                delegate.doFilter(request, response, chain);
            } catch (jakarta.servlet.ServletException exception) {
                throw ServletShim.of(exception);
            }
        }

        @Override
        public void doFilter(
            jakarta.servlet.ServletRequest request,
            jakarta.servlet.ServletResponse response,
            jakarta.servlet.FilterChain chain
        ) throws javax.servlet.ServletException, IOException {
            try {
                delegate.doFilter(request, response, chain);
            } catch (jakarta.servlet.ServletException exception) {
                throw ServletShim.of(exception);
            }
        }

        @Override
        public void destroy() {
            delegate.destroy();
        }
    }

    final class GenericServlet extends javax.servlet.GenericServlet {
        private final jakarta.servlet.GenericServlet delegate;

        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        GenericServlet(jakarta.servlet.GenericServlet delegate) {
            this.delegate = delegate;
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public void destroy() {
            delegate.destroy();
        }

        @Override
        public String getInitParameter(String name) {
            return delegate.getInitParameter(name);
        }

        @Override
        public Enumeration<String> getInitParameterNames() {
            return delegate.getInitParameterNames();
        }

        @Override
        public javax.servlet.ServletConfig getServletConfig() {
            return ServletShim.of(delegate.getServletConfig());
        }

        @Override
        public javax.servlet.ServletContext getServletContext() {
            return ServletShim.of(delegate.getServletContext());
        }

        @Override
        public String getServletInfo() {
            return delegate.getServletInfo();
        }

        @Override
        public void init(jakarta.servlet.ServletConfig config) throws javax.servlet.ServletException {
            try {
                delegate.init(config);
            } catch (jakarta.servlet.ServletException exception) {
                throw ServletShim.of(exception);
            }
        }

        @Override
        public void init() throws javax.servlet.ServletException {
            try {
                delegate.init();
            } catch (jakarta.servlet.ServletException exception) {
                throw ServletShim.of(exception);
            }
        }

        @Override
        public void log(String message) {
            delegate.log(message);
        }

        @Override
        public void log(String message, Throwable throwable) {
            delegate.log(message, throwable);
        }

        @Override
        public void service(
            javax.servlet.ServletRequest request,
            javax.servlet.ServletResponse response
        ) throws javax.servlet.ServletException, IOException {
            try {
                delegate.service(request, response);
            } catch (jakarta.servlet.ServletException exception) {
                throw ServletShim.of(exception);
            }
        }

        @Override
        public void service(
            jakarta.servlet.ServletRequest request,
            jakarta.servlet.ServletResponse response
        ) throws javax.servlet.ServletException, IOException {
            try {
                delegate.service(request, response);
            } catch (jakarta.servlet.ServletException exception) {
                throw ServletShim.of(exception);
            }
        }

        @Override
        public String getServletName() {
            return delegate.getServletName();
        }
    }

    final class HttpConstraintElement extends javax.servlet.HttpConstraintElement {
        private final jakarta.servlet.HttpConstraintElement delegate;

        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        HttpConstraintElement(jakarta.servlet.HttpConstraintElement delegate) {
            super(delegate.getEmptyRoleSemantic(), delegate.getTransportGuarantee(), delegate.getRolesAllowed());
            this.delegate = delegate;
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public jakarta.servlet.annotation.ServletSecurity.EmptyRoleSemantic getEmptyRoleSemantic() {
            return delegate.getEmptyRoleSemantic();
        }

        @Override
        public jakarta.servlet.annotation.ServletSecurity.TransportGuarantee getTransportGuarantee() {
            return delegate.getTransportGuarantee();
        }

        @Override
        public String[] getRolesAllowed() {
            return delegate.getRolesAllowed();
        }
    }

    final class HttpFilter extends javax.servlet.http.HttpFilter {
        private static final long serialVersionUID = 7478463438252262094L; // Use the ID from jakarta.servlet.

        private final jakarta.servlet.http.HttpFilter delegate;

        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        HttpFilter(jakarta.servlet.http.HttpFilter delegate) {
            this.delegate = delegate;
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public void doFilter(
            javax.servlet.ServletRequest request,
            javax.servlet.ServletResponse response,
            javax.servlet.FilterChain chain
        ) throws javax.servlet.ServletException, IOException {
            try {
                delegate.doFilter(request, response, chain);
            } catch (jakarta.servlet.ServletException exception) {
                throw ServletShim.of(exception);
            }
        }

        @Override
        public void doFilter(
            jakarta.servlet.ServletRequest request,
            jakarta.servlet.ServletResponse response,
            jakarta.servlet.FilterChain chain
        ) throws javax.servlet.ServletException, IOException {
            try {
                delegate.doFilter(request, response, chain);
            } catch (jakarta.servlet.ServletException exception) {
                throw ServletShim.of(exception);
            }
        }

        @Override
        public String getInitParameter(String name) {
            return delegate.getInitParameter(name);
        }

        @Override
        public Enumeration<String> getInitParameterNames() {
            return delegate.getInitParameterNames();
        }

        @Override
        public javax.servlet.FilterConfig getFilterConfig() {
            return ServletShim.of(delegate.getFilterConfig());
        }

        @Override
        public javax.servlet.ServletContext getServletContext() {
            return ServletShim.of(delegate.getServletContext());
        }

        @Override
        public void init(javax.servlet.FilterConfig config) throws javax.servlet.ServletException {
            try {
                delegate.init(config);
            } catch (jakarta.servlet.ServletException exception) {
                throw ServletShim.of(exception);
            }
        }

        @Override
        public void init(jakarta.servlet.FilterConfig config) throws javax.servlet.ServletException {
            try {
                delegate.init(config);
            } catch (jakarta.servlet.ServletException exception) {
                throw ServletShim.of(exception);
            }
        }

        @Override
        public void init() throws javax.servlet.ServletException {
            try {
                delegate.init();
            } catch (jakarta.servlet.ServletException exception) {
                throw ServletShim.of(exception);
            }
        }

        @Override
        public String getFilterName() {
            return delegate.getFilterName();
        }

        @Override
        public void destroy() {
            delegate.destroy();
        }
    }

    final class HttpMethodConstraintElement extends javax.servlet.HttpMethodConstraintElement {
        private final jakarta.servlet.HttpMethodConstraintElement delegate;

        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        HttpMethodConstraintElement(jakarta.servlet.HttpMethodConstraintElement delegate) {
            super(delegate.getMethodName(), delegate);
            this.delegate = delegate;
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public String getMethodName() {
            return delegate.getMethodName();
        }

        @Override
        public jakarta.servlet.annotation.ServletSecurity.EmptyRoleSemantic getEmptyRoleSemantic() {
            return delegate.getEmptyRoleSemantic();
        }

        @Override
        public jakarta.servlet.annotation.ServletSecurity.TransportGuarantee getTransportGuarantee() {
            return delegate.getTransportGuarantee();
        }

        @Override
        public String[] getRolesAllowed() {
            return delegate.getRolesAllowed();
        }
    }

    final class HttpServlet extends javax.servlet.http.HttpServlet {
        private static final long serialVersionUID = 8466325577512134784L; // Use the ID from jakarta.servlet.

        private final jakarta.servlet.http.HttpServlet delegate;

        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        HttpServlet(jakarta.servlet.http.HttpServlet delegate) {
            this.delegate = delegate;
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public void init(javax.servlet.ServletConfig config) throws javax.servlet.ServletException {
            try {
                delegate.init(config);
            } catch (jakarta.servlet.ServletException exception) {
                throw ServletShim.of(exception);
            }
        }

        @Override
        public void init(jakarta.servlet.ServletConfig config) throws javax.servlet.ServletException {
            try {
                delegate.init(config);
            } catch (jakarta.servlet.ServletException exception) {
                throw ServletShim.of(exception);
            }
        }

        @Override
        public void service(
            javax.servlet.ServletRequest request,
            javax.servlet.ServletResponse response
        ) throws javax.servlet.ServletException, IOException {
            try {
                delegate.service(request, response);
            } catch (jakarta.servlet.ServletException exception) {
                throw ServletShim.of(exception);
            }
        }

        @Override
        public void service(
            jakarta.servlet.ServletRequest request,
            jakarta.servlet.ServletResponse response
        ) throws javax.servlet.ServletException, IOException {
            try {
                delegate.service(request, response);
            } catch (jakarta.servlet.ServletException exception) {
                throw ServletShim.of(exception);
            }
        }

        @Override
        public void destroy() {
            delegate.destroy();
        }

        @Override
        public String getInitParameter(String name) {
            return delegate.getInitParameter(name);
        }

        @Override
        public Enumeration<String> getInitParameterNames() {
            return delegate.getInitParameterNames();
        }

        @Override
        public javax.servlet.ServletConfig getServletConfig() {
            return ServletShim.of(delegate.getServletConfig());
        }

        @Override
        public javax.servlet.ServletContext getServletContext() {
            return ServletShim.of(delegate.getServletContext());
        }

        @Override
        public String getServletInfo() {
            return delegate.getServletInfo();
        }

        @Override
        public void init() throws javax.servlet.ServletException {
            try {
                delegate.init();
            } catch (jakarta.servlet.ServletException exception) {
                throw ServletShim.of(exception);
            }
        }

        @Override
        public void log(String message) {
            delegate.log(message);
        }

        @Override
        public void log(String message, Throwable throwable) {
            delegate.log(message, throwable);
        }

        @Override
        public String getServletName() {
            return delegate.getServletName();
        }
    }

    final class HttpServletMapping extends Shim.Delegate<jakarta.servlet.http.HttpServletMapping> implements javax.servlet.http.HttpServletMapping {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        HttpServletMapping(jakarta.servlet.http.HttpServletMapping delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public String getMatchValue() {
            return delegate.getMatchValue();
        }

        @Override
        public String getPattern() {
            return delegate.getPattern();
        }

        @Override
        public String getServletName() {
            return delegate.getServletName();
        }

        @Override
        public javax.servlet.http.MappingMatch getMappingMatch() {
            return ServletShim.of(delegate.getMappingMatch());
        }
    }

    final class HttpServletRequest extends Shim.Delegate<jakarta.servlet.http.HttpServletRequest> implements javax.servlet.http.HttpServletRequest {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        HttpServletRequest(jakarta.servlet.http.HttpServletRequest delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public String getAuthType() {
            return delegate.getAuthType();
        }

        @Override
        public javax.servlet.http.Cookie[] getCookies() {
            return ServletShim
                .<javax.servlet.http.Cookie>of(delegate.getCookies())
                .toArray(javax.servlet.http.Cookie[]::new);
        }

        @Override
        public long getDateHeader(String name) {
            return delegate.getDateHeader(name);
        }

        @Override
        public String getHeader(String name) {
            return delegate.getHeader(name);
        }

        @Override
        public Enumeration<String> getHeaders(String name) {
            return delegate.getHeaders(name);
        }

        @Override
        public Enumeration<String> getHeaderNames() {
            return delegate.getHeaderNames();
        }

        @Override
        public int getIntHeader(String name) {
            return delegate.getIntHeader(name);
        }

        @Override
        public javax.servlet.http.HttpServletMapping getHttpServletMapping() {
            return ServletShim.of(delegate.getHttpServletMapping());
        }

        @Override
        public String getMethod() {
            return delegate.getMethod();
        }

        @Override
        public String getPathInfo() {
            return delegate.getPathInfo();
        }

        @Override
        public String getPathTranslated() {
            return delegate.getPathTranslated();
        }

        @Override
        public javax.servlet.http.PushBuilder newPushBuilder() {
            return ServletShim.of(delegate.newPushBuilder());
        }

        @Override
        public String getContextPath() {
            return delegate.getContextPath();
        }

        @Override
        public String getQueryString() {
            return delegate.getQueryString();
        }

        @Override
        public String getRemoteUser() {
            return delegate.getRemoteUser();
        }

        @Override
        public boolean isUserInRole(String role) {
            return delegate.isUserInRole(role);
        }

        @Override
        public Principal getUserPrincipal() {
            return delegate.getUserPrincipal();
        }

        @Override
        public String getRequestedSessionId() {
            return delegate.getRequestedSessionId();
        }

        @Override
        public String getRequestURI() {
            return delegate.getRequestURI();
        }

        @Override
        public StringBuffer getRequestURL() {
            return delegate.getRequestURL();
        }

        @Override
        public String getServletPath() {
            return delegate.getServletPath();
        }

        @Override
        public javax.servlet.http.HttpSession getSession(boolean create) {
            return ServletShim.of(delegate.getSession(create));
        }

        @Override
        public javax.servlet.http.HttpSession getSession() {
            return ServletShim.of(delegate.getSession());
        }

        @Override
        public String changeSessionId() {
            return delegate.changeSessionId();
        }

        @Override
        public boolean isRequestedSessionIdValid() {
            return delegate.isRequestedSessionIdValid();
        }

        @Override
        public boolean isRequestedSessionIdFromCookie() {
            return delegate.isRequestedSessionIdFromCookie();
        }

        @Override
        public boolean isRequestedSessionIdFromURL() {
            return delegate.isRequestedSessionIdFromURL();
        }

        @Override
        public boolean authenticate(
            javax.servlet.http.HttpServletResponse response
        ) throws javax.servlet.ServletException, IOException {
            try {
                return delegate.authenticate(response);
            } catch (jakarta.servlet.ServletException exception) {
                throw ServletShim.of(exception);
            }
        }

        @Override
        public boolean authenticate(
            jakarta.servlet.http.HttpServletResponse response
        ) throws javax.servlet.ServletException, IOException {
            try {
                return delegate.authenticate(response);
            } catch (jakarta.servlet.ServletException exception) {
                throw ServletShim.of(exception);
            }
        }

        @Override
        public void login(String username, String password) throws javax.servlet.ServletException {
            try {
                delegate.login(username, password);
            } catch (jakarta.servlet.ServletException exception) {
                throw ServletShim.of(exception);
            }
        }

        @Override
        public void logout() throws javax.servlet.ServletException {
            try {
                delegate.logout();
            } catch (jakarta.servlet.ServletException exception) {
                throw ServletShim.of(exception);
            }
        }

        @Override
        public Collection getParts() throws javax.servlet.ServletException, IOException {
            try {
                return ServletShim
                    .<javax.servlet.http.Part>of(delegate.getParts())
                    .collect(Collectors.toList());
            } catch (jakarta.servlet.ServletException exception) {
                throw ServletShim.of(exception);
            }
        }

        @Override
        public javax.servlet.http.Part getPart(String name) throws javax.servlet.ServletException, IOException {
            try {
                return ServletShim.of(delegate.getPart(name));
            } catch (jakarta.servlet.ServletException exception) {
                throw ServletShim.of(exception);
            }
        }

        @Override
        public javax.servlet.http.HttpUpgradeHandler upgrade(
            Class clazz
        ) throws javax.servlet.ServletException, IOException {
            try {
                return ServletShim.of(delegate.upgrade(clazz.asSubclass(jakarta.servlet.http.HttpUpgradeHandler.class)));
            } catch (jakarta.servlet.ServletException exception) {
                throw ServletShim.of(exception);
            }
        }

        @Override
        public Map<String, String> getTrailerFields() {
            return delegate.getTrailerFields();
        }

        @Override
        public boolean isTrailerFieldsReady() {
            return delegate.isTrailerFieldsReady();
        }

        @Override
        public Object getAttribute(String name) {
            return delegate.getAttribute(name);
        }

        @Override
        public Enumeration<String> getAttributeNames() {
            return delegate.getAttributeNames();
        }

        @Override
        public String getCharacterEncoding() {
            return delegate.getCharacterEncoding();
        }

        @Override
        public void setCharacterEncoding(String encoding) throws UnsupportedEncodingException {
            delegate.setCharacterEncoding(encoding);
        }

        @Override
        public int getContentLength() {
            return delegate.getContentLength();
        }

        @Override
        public long getContentLengthLong() {
            return delegate.getContentLengthLong();
        }

        @Override
        public String getContentType() {
            return delegate.getContentType();
        }

        @Override
        public javax.servlet.ServletInputStream getInputStream() throws IOException {
            return ServletShim.of(delegate.getInputStream());
        }

        @Override
        public String getParameter(String name) {
            return delegate.getParameter(name);
        }

        @Override
        public Enumeration<String> getParameterNames() {
            return delegate.getParameterNames();
        }

        @Override
        public String[] getParameterValues(String name) {
            return delegate.getParameterValues(name);
        }

        @Override
        public Map<String, String[]> getParameterMap() {
            return delegate.getParameterMap();
        }

        @Override
        public String getProtocol() {
            return delegate.getProtocol();
        }

        @Override
        public String getScheme() {
            return delegate.getScheme();
        }

        @Override
        public String getServerName() {
            return delegate.getServerName();
        }

        @Override
        public int getServerPort() {
            return delegate.getServerPort();
        }

        @Override
        public BufferedReader getReader() throws IOException {
            return delegate.getReader();
        }

        @Override
        public String getRemoteAddr() {
            return delegate.getRemoteAddr();
        }

        @Override
        public String getRemoteHost() {
            return delegate.getRemoteHost();
        }

        @Override
        public void setAttribute(String name, Object o) {
            delegate.setAttribute(name, o);
        }

        @Override
        public void removeAttribute(String name) {
            delegate.removeAttribute(name);
        }

        @Override
        public Locale getLocale() {
            return delegate.getLocale();
        }

        @Override
        public Enumeration<Locale> getLocales() {
            return delegate.getLocales();
        }

        @Override
        public boolean isSecure() {
            return delegate.isSecure();
        }

        @Override
        public javax.servlet.RequestDispatcher getRequestDispatcher(String path) {
            return ServletShim.of(delegate.getRequestDispatcher(path));
        }

        @Override
        public int getRemotePort() {
            return delegate.getRemotePort();
        }

        @Override
        public String getLocalName() {
            return delegate.getLocalName();
        }

        @Override
        public String getLocalAddr() {
            return delegate.getLocalAddr();
        }

        @Override
        public int getLocalPort() {
            return delegate.getLocalPort();
        }

        @Override
        public javax.servlet.ServletContext getServletContext() {
            return ServletShim.of(delegate.getServletContext());
        }

        @Override
        public javax.servlet.AsyncContext startAsync() throws IllegalStateException {
            return ServletShim.of(delegate.startAsync());
        }

        @Override
        public javax.servlet.AsyncContext startAsync(
            javax.servlet.ServletRequest request,
            javax.servlet.ServletResponse response
        ) throws IllegalStateException {
            return ServletShim.of(delegate.startAsync(request, response));
        }

        @Override
        public javax.servlet.AsyncContext startAsync(
            jakarta.servlet.ServletRequest request,
            jakarta.servlet.ServletResponse response
        ) throws IllegalStateException {
            return ServletShim.of(delegate.startAsync(request, response));
        }

        @Override
        public boolean isAsyncStarted() {
            return delegate.isAsyncStarted();
        }

        @Override
        public boolean isAsyncSupported() {
            return delegate.isAsyncSupported();
        }

        @Override
        public javax.servlet.AsyncContext getAsyncContext() {
            return ServletShim.of(delegate.getAsyncContext());
        }

        @Override
        public javax.servlet.DispatcherType getDispatcherType() {
            return ServletShim.of(delegate.getDispatcherType());
        }

        @Override
        public String getRequestId() {
            return delegate.getRequestId();
        }

        @Override
        public String getProtocolRequestId() {
            return delegate.getProtocolRequestId();
        }

        @Override
        public javax.servlet.ServletConnection getServletConnection() {
            return ServletShim.of(delegate.getServletConnection());
        }
    }

    final class HttpServletRequestWrapper extends javax.servlet.http.HttpServletRequestWrapper {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        HttpServletRequestWrapper(jakarta.servlet.http.HttpServletRequestWrapper delegate) {
            super(new HttpServletRequest(delegate));
        }
    }

    final class HttpServletResponse extends Shim.Delegate<jakarta.servlet.http.HttpServletResponse> implements javax.servlet.http.HttpServletResponse {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        HttpServletResponse(jakarta.servlet.http.HttpServletResponse delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public void addCookie(javax.servlet.http.Cookie cookie) {
            delegate.addCookie(cookie);
        }

        @Override
        public void addCookie(jakarta.servlet.http.Cookie cookie) {
            delegate.addCookie(cookie);
        }

        @Override
        public boolean containsHeader(String name) {
            return delegate.containsHeader(name);
        }

        @Override
        public String encodeURL(String url) {
            return delegate.encodeURL(url);
        }

        @Override
        public String encodeRedirectURL(String url) {
            return delegate.encodeRedirectURL(url);
        }

        @Override
        public void sendError(int statusCode, String message) throws IOException {
            delegate.sendError(statusCode, message);
        }

        @Override
        public void sendError(int statusCode) throws IOException {
            delegate.sendError(statusCode);
        }

        @Override
        public void sendRedirect(String location) throws IOException {
            delegate.sendRedirect(location);
        }

        @Override
        public void setDateHeader(String name, long date) {
            delegate.setDateHeader(name, date);
        }

        @Override
        public void addDateHeader(String name, long date) {
            delegate.addDateHeader(name, date);
        }

        @Override
        public void setHeader(String name, String value) {
            delegate.setHeader(name, value);
        }

        @Override
        public void addHeader(String name, String value) {
            delegate.addHeader(name, value);
        }

        @Override
        public void setIntHeader(String name, int value) {
            delegate.setIntHeader(name, value);
        }

        @Override
        public void addIntHeader(String name, int value) {
            delegate.addIntHeader(name, value);
        }

        @Override
        public void setStatus(int sc) {
            delegate.setStatus(sc);
        }

        @Override
        public int getStatus() {
            return delegate.getStatus();
        }

        @Override
        public String getHeader(String name) {
            return delegate.getHeader(name);
        }

        @Override
        public Collection<String> getHeaders(String name) {
            return delegate.getHeaders(name);
        }

        @Override
        public Collection<String> getHeaderNames() {
            return delegate.getHeaderNames();
        }

        @Override
        public void setTrailerFields(Supplier<Map<String, String>> supplier) {
            delegate.setTrailerFields(supplier);
        }

        @Override
        public Supplier<Map<String, String>> getTrailerFields() {
            return delegate.getTrailerFields();
        }

        @Override
        public String getCharacterEncoding() {
            return delegate.getCharacterEncoding();
        }

        @Override
        public String getContentType() {
            return delegate.getContentType();
        }

        @Override
        public javax.servlet.ServletOutputStream getOutputStream() throws IOException {
            return ServletShim.of(delegate.getOutputStream());
        }

        @Override
        public PrintWriter getWriter() throws IOException {
            return delegate.getWriter();
        }

        @Override
        public void setCharacterEncoding(String charset) {
            delegate.setCharacterEncoding(charset);
        }

        @Override
        public void setContentLength(int len) {
            delegate.setContentLength(len);
        }

        @Override
        public void setContentLengthLong(long len) {
            delegate.setContentLengthLong(len);
        }

        @Override
        public void setContentType(String type) {
            delegate.setContentType(type);
        }

        @Override
        public void setBufferSize(int size) {
            delegate.setBufferSize(size);
        }

        @Override
        public int getBufferSize() {
            return delegate.getBufferSize();
        }

        @Override
        public void flushBuffer() throws IOException {
            delegate.flushBuffer();
        }

        @Override
        public void resetBuffer() {
            delegate.resetBuffer();
        }

        @Override
        public boolean isCommitted() {
            return delegate.isCommitted();
        }

        @Override
        public void reset() {
            delegate.reset();
        }

        @Override
        public void setLocale(Locale loc) {
            delegate.setLocale(loc);
        }

        @Override
        public Locale getLocale() {
            return delegate.getLocale();
        }
    }

    final class HttpServletResponseWrapper extends javax.servlet.http.HttpServletResponseWrapper {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        HttpServletResponseWrapper(jakarta.servlet.http.HttpServletResponseWrapper delegate) {
            super(new HttpServletResponse(delegate));
        }
    }

    final class HttpSession extends Shim.Delegate<jakarta.servlet.http.HttpSession> implements javax.servlet.http.HttpSession {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        HttpSession(jakarta.servlet.http.HttpSession delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public long getCreationTime() {
            return delegate.getCreationTime();
        }

        @Override
        public String getId() {
            return delegate.getId();
        }

        @Override
        public long getLastAccessedTime() {
            return delegate.getLastAccessedTime();
        }

        @Override
        public javax.servlet.ServletContext getServletContext() {
            return ServletShim.of(delegate.getServletContext());
        }

        @Override
        public void setMaxInactiveInterval(int interval) {
            delegate.setMaxInactiveInterval(interval);
        }

        @Override
        public int getMaxInactiveInterval() {
            return delegate.getMaxInactiveInterval();
        }

        @Override
        public Object getAttribute(String name) {
            return delegate.getAttribute(name);
        }

        @Override
        public Enumeration<String> getAttributeNames() {
            return delegate.getAttributeNames();
        }

        @Override
        public void setAttribute(String name, Object value) {
            delegate.setAttribute(name, value);
        }

        @Override
        public void removeAttribute(String name) {
            delegate.removeAttribute(name);
        }

        @Override
        public void invalidate() {
            delegate.invalidate();
        }

        @Override
        public boolean isNew() {
            return delegate.isNew();
        }
    }

    final class HttpSessionActivationListener extends Shim.Delegate<jakarta.servlet.http.HttpSessionActivationListener> implements javax.servlet.http.HttpSessionActivationListener {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        HttpSessionActivationListener(jakarta.servlet.http.HttpSessionActivationListener delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public void sessionDidActivate(javax.servlet.http.HttpSessionEvent event) {
            delegate.sessionDidActivate(event);
        }

        @Override
        public void sessionDidActivate(jakarta.servlet.http.HttpSessionEvent event) {
            delegate.sessionDidActivate(event);
        }

        @Override
        public void sessionWillPassivate(javax.servlet.http.HttpSessionEvent event) {
            delegate.sessionWillPassivate(event);
        }

        @Override
        public void sessionWillPassivate(jakarta.servlet.http.HttpSessionEvent event) {
            delegate.sessionWillPassivate(event);
        }
    }

    final class HttpSessionAttributeListener extends Shim.Delegate<jakarta.servlet.http.HttpSessionAttributeListener> implements javax.servlet.http.HttpSessionAttributeListener {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        HttpSessionAttributeListener(jakarta.servlet.http.HttpSessionAttributeListener delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public void attributeAdded(javax.servlet.http.HttpSessionBindingEvent event) {
            delegate.attributeAdded(new jakarta.servlet.http.HttpSessionBindingEvent(
                event.getSession(),
                event.getName(),
                event.getValue()
            ));
        }

        @Override
        public void attributeAdded(jakarta.servlet.http.HttpSessionBindingEvent event) {
            delegate.attributeAdded(event);
        }

        @Override
        public void attributeRemoved(javax.servlet.http.HttpSessionBindingEvent event) {
            delegate.attributeRemoved(new jakarta.servlet.http.HttpSessionBindingEvent(
                event.getSession(),
                event.getName(),
                event.getValue()
            ));
        }

        @Override
        public void attributeRemoved(jakarta.servlet.http.HttpSessionBindingEvent event) {
            delegate.attributeRemoved(event);
        }

        @Override
        public void attributeReplaced(javax.servlet.http.HttpSessionBindingEvent event) {
            delegate.attributeReplaced(new jakarta.servlet.http.HttpSessionBindingEvent(
                event.getSession(),
                event.getName(),
                event.getValue()
            ));
        }

        @Override
        public void attributeReplaced(jakarta.servlet.http.HttpSessionBindingEvent event) {
            delegate.attributeReplaced(event);
        }
    }

    final class HttpSessionBindingEvent extends javax.servlet.http.HttpSessionBindingEvent {
        private static final long serialVersionUID = 7308000419984825907L; // Use the ID from jakarta.servlet.

        private final jakarta.servlet.http.HttpSessionBindingEvent delegate;

        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        HttpSessionBindingEvent(jakarta.servlet.http.HttpSessionBindingEvent delegate) {
            super(ServletShim.of(delegate.getSession()), delegate.getName(), delegate.getValue());
            this.delegate = delegate;
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public String getName() {
            return delegate.getName();
        }

        @Override
        public Object getValue() {
            return delegate.getValue();
        }

        @Override
        public javax.servlet.http.HttpSession getSession() {
            return ServletShim.of(delegate.getSession());
        }

        @Override
        public Object getSource() {
            return delegate.getSource();
        }

        @Override
        public String toString() {
            return delegate.toString();
        }
    }

    final class HttpSessionBindingListener extends Shim.Delegate<jakarta.servlet.http.HttpSessionBindingListener> implements javax.servlet.http.HttpSessionBindingListener {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        HttpSessionBindingListener(jakarta.servlet.http.HttpSessionBindingListener delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public void valueBound(javax.servlet.http.HttpSessionBindingEvent event) {
            delegate.valueBound(new jakarta.servlet.http.HttpSessionBindingEvent(
                event.getSession(),
                event.getName(),
                event.getValue()
            ));
        }

        @Override
        public void valueBound(jakarta.servlet.http.HttpSessionBindingEvent event) {
            delegate.valueBound(event);
        }

        @Override
        public void valueUnbound(javax.servlet.http.HttpSessionBindingEvent event) {
            delegate.valueUnbound(new jakarta.servlet.http.HttpSessionBindingEvent(
                event.getSession(),
                event.getName(),
                event.getValue()
            ));
        }

        @Override
        public void valueUnbound(jakarta.servlet.http.HttpSessionBindingEvent event) {
            delegate.valueUnbound(event);
        }
    }

    final class HttpSessionEvent extends javax.servlet.http.HttpSessionEvent {
        private static final long serialVersionUID = -7622791603672342895L; // Use the ID from jakarta.servlet.

        private final jakarta.servlet.http.HttpSessionEvent delegate;

        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        HttpSessionEvent(jakarta.servlet.http.HttpSessionEvent delegate) {
            super(ServletShim.of(delegate.getSession()));
            this.delegate = delegate;
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public javax.servlet.http.HttpSession getSession() {
            return ServletShim.of(delegate.getSession());
        }

        @Override
        public Object getSource() {
            return delegate.getSource();
        }

        @Override
        public String toString() {
            return delegate.toString();
        }
    }

    final class HttpSessionIdListener extends Shim.Delegate<jakarta.servlet.http.HttpSessionIdListener> implements javax.servlet.http.HttpSessionIdListener {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        HttpSessionIdListener(jakarta.servlet.http.HttpSessionIdListener delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public void sessionIdChanged(javax.servlet.http.HttpSessionEvent event, String oldSessionId) {
            delegate.sessionIdChanged(event, oldSessionId);
        }

        @Override
        public void sessionIdChanged(jakarta.servlet.http.HttpSessionEvent event, String oldSessionId) {
            delegate.sessionIdChanged(event, oldSessionId);
        }
    }

    final class HttpSessionListener extends Shim.Delegate<jakarta.servlet.http.HttpSessionListener> implements javax.servlet.http.HttpSessionListener {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        HttpSessionListener(jakarta.servlet.http.HttpSessionListener delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public void sessionCreated(javax.servlet.http.HttpSessionEvent event) {
            delegate.sessionCreated(event);
        }

        @Override
        public void sessionCreated(jakarta.servlet.http.HttpSessionEvent event) {
            delegate.sessionCreated(event);
        }

        @Override
        public void sessionDestroyed(javax.servlet.http.HttpSessionEvent event) {
            delegate.sessionDestroyed(event);
        }

        @Override
        public void sessionDestroyed(jakarta.servlet.http.HttpSessionEvent event) {
            delegate.sessionDestroyed(event);
        }
    }

    final class HttpUpgradeHandler extends Shim.Delegate<jakarta.servlet.http.HttpUpgradeHandler> implements javax.servlet.http.HttpUpgradeHandler {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        HttpUpgradeHandler(jakarta.servlet.http.HttpUpgradeHandler delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public void init(javax.servlet.http.WebConnection connection) {
            delegate.init(connection);
        }

        @Override
        public void init(jakarta.servlet.http.WebConnection connection) {
            delegate.init(connection);
        }

        @Override
        public void destroy() {
            delegate.destroy();
        }
    }

    final class MultipartConfigElement extends javax.servlet.MultipartConfigElement {
        private final jakarta.servlet.MultipartConfigElement delegate;

        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        MultipartConfigElement(jakarta.servlet.MultipartConfigElement delegate) {
            super(
                delegate.getLocation(),
                delegate.getMaxFileSize(),
                delegate.getMaxRequestSize(),
                delegate.getFileSizeThreshold()
            );
            this.delegate = delegate;
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public String getLocation() {
            return delegate.getLocation();
        }

        @Override
        public long getMaxFileSize() {
            return delegate.getMaxFileSize();
        }

        @Override
        public long getMaxRequestSize() {
            return delegate.getMaxRequestSize();
        }

        @Override
        public int getFileSizeThreshold() {
            return delegate.getFileSizeThreshold();
        }
    }

    final class Part extends Shim.Delegate<jakarta.servlet.http.Part> implements javax.servlet.http.Part {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        Part(jakarta.servlet.http.Part delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public InputStream getInputStream() throws IOException {
            return delegate.getInputStream();
        }

        @Override
        public String getContentType() {
            return delegate.getContentType();
        }

        @Override
        public String getName() {
            return delegate.getName();
        }

        @Override
        public String getSubmittedFileName() {
            return delegate.getSubmittedFileName();
        }

        @Override
        public long getSize() {
            return delegate.getSize();
        }

        @Override
        public void write(String fileName) throws IOException {
            delegate.write(fileName);
        }

        @Override
        public void delete() throws IOException {
            delegate.delete();
        }

        @Override
        public String getHeader(String name) {
            return delegate.getHeader(name);
        }

        @Override
        public Collection<String> getHeaders(String name) {
            return delegate.getHeaders(name);
        }

        @Override
        public Collection<String> getHeaderNames() {
            return delegate.getHeaderNames();
        }
    }

    final class PushBuilder extends Shim.Delegate<jakarta.servlet.http.PushBuilder> implements javax.servlet.http.PushBuilder {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        PushBuilder(jakarta.servlet.http.PushBuilder delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public javax.servlet.http.PushBuilder method(String method) {
            return ServletShim.of(delegate.method(method));
        }

        @Override
        public javax.servlet.http.PushBuilder queryString(String queryString) {
            return ServletShim.of(delegate.queryString(queryString));
        }

        @Override
        public javax.servlet.http.PushBuilder sessionId(String sessionId) {
            return ServletShim.of(delegate.sessionId(sessionId));
        }

        @Override
        public javax.servlet.http.PushBuilder setHeader(String name, String value) {
            return ServletShim.of(delegate.setHeader(name, value));
        }

        @Override
        public javax.servlet.http.PushBuilder addHeader(String name, String value) {
            return ServletShim.of(delegate.addHeader(name, value));
        }

        @Override
        public javax.servlet.http.PushBuilder removeHeader(String name) {
            return ServletShim.of(delegate.removeHeader(name));
        }

        @Override
        public javax.servlet.http.PushBuilder path(String path) {
            return ServletShim.of(delegate.path(path));
        }

        @Override
        public void push() {
            delegate.push();
        }

        @Override
        public String getMethod() {
            return delegate.getMethod();
        }

        @Override
        public String getQueryString() {
            return delegate.getQueryString();
        }

        @Override
        public String getSessionId() {
            return delegate.getSessionId();
        }

        @Override
        public Set<String> getHeaderNames() {
            return delegate.getHeaderNames();
        }

        @Override
        public String getHeader(String name) {
            return delegate.getHeader(name);
        }

        @Override
        public String getPath() {
            return delegate.getPath();
        }
    }

    final class ReadListener extends Shim.Delegate<jakarta.servlet.ReadListener> implements javax.servlet.ReadListener {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        ReadListener(jakarta.servlet.ReadListener delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public void onDataAvailable() throws IOException {
            delegate.onDataAvailable();
        }

        @Override
        public void onAllDataRead() throws IOException {
            delegate.onAllDataRead();
        }

        @Override
        public void onError(Throwable throwable) {
            delegate.onError(throwable);
        }
    }

    final class Registration extends Shim.Delegate<jakarta.servlet.Registration> implements javax.servlet.Registration {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        Registration(jakarta.servlet.Registration delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public String getName() {
            return delegate.getName();
        }

        @Override
        public String getClassName() {
            return delegate.getClassName();
        }

        @Override
        public boolean setInitParameter(String name, String value) {
            return delegate.setInitParameter(name, value);
        }

        @Override
        public String getInitParameter(String name) {
            return delegate.getInitParameter(name);
        }

        @Override
        public Set<String> setInitParameters(Map<String, String> initParameters) {
            return delegate.setInitParameters(initParameters);
        }

        @Override
        public Map<String, String> getInitParameters() {
            return delegate.getInitParameters();
        }
    }

    final class Registration$Dynamic extends Shim.Delegate<jakarta.servlet.Registration.Dynamic> implements javax.servlet.Registration.Dynamic {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        Registration$Dynamic(jakarta.servlet.Registration.Dynamic delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public String getName() {
            return delegate.getName();
        }

        @Override
        public String getClassName() {
            return delegate.getClassName();
        }

        @Override
        public boolean setInitParameter(String name, String value) {
            return delegate.setInitParameter(name, value);
        }

        @Override
        public String getInitParameter(String name) {
            return delegate.getInitParameter(name);
        }

        @Override
        public Set<String> setInitParameters(Map<String, String> initParameters) {
            return delegate.setInitParameters(initParameters);
        }

        @Override
        public Map<String, String> getInitParameters() {
            return delegate.getInitParameters();
        }

        @Override
        public void setAsyncSupported(boolean isAsyncSupported) {
            delegate.setAsyncSupported(isAsyncSupported);
        }
    }

    final class RequestDispatcher extends Shim.Delegate<jakarta.servlet.RequestDispatcher> implements javax.servlet.RequestDispatcher {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        RequestDispatcher(jakarta.servlet.RequestDispatcher delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public void forward(
            javax.servlet.ServletRequest request,
            javax.servlet.ServletResponse response
        ) throws javax.servlet.ServletException, IOException {
            try {
                delegate.forward(request, response);
            } catch (jakarta.servlet.ServletException exception) {
                throw ServletShim.of(exception);
            }
        }

        @Override
        public void forward(
            jakarta.servlet.ServletRequest request,
            jakarta.servlet.ServletResponse response
        ) throws javax.servlet.ServletException, IOException {
            try {
                delegate.forward(request, response);
            } catch (jakarta.servlet.ServletException exception) {
                throw ServletShim.of(exception);
            }
        }

        @Override
        public void include(
            javax.servlet.ServletRequest request,
            javax.servlet.ServletResponse response
        ) throws javax.servlet.ServletException, IOException {
            try {
                delegate.include(request, response);
            } catch (jakarta.servlet.ServletException exception) {
                throw ServletShim.of(exception);
            }
        }

        @Override
        public void include(
            jakarta.servlet.ServletRequest request,
            jakarta.servlet.ServletResponse response
        ) throws javax.servlet.ServletException, IOException {
            try {
                delegate.include(request, response);
            } catch (jakarta.servlet.ServletException exception) {
                throw ServletShim.of(exception);
            }
        }
    }

    final class Servlet extends Shim.Delegate<jakarta.servlet.Servlet> implements javax.servlet.Servlet {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        Servlet(jakarta.servlet.Servlet delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public void init(javax.servlet.ServletConfig config) throws javax.servlet.ServletException {
            try {
                delegate.init(config);
            } catch (jakarta.servlet.ServletException exception) {
                throw ServletShim.of(exception);
            }
        }

        @Override
        public void init(jakarta.servlet.ServletConfig config) throws javax.servlet.ServletException {
            try {
                delegate.init(config);
            } catch (jakarta.servlet.ServletException exception) {
                throw ServletShim.of(exception);
            }
        }

        @Override
        public void service(
            javax.servlet.ServletRequest request,
            javax.servlet.ServletResponse response
        ) throws javax.servlet.ServletException, IOException {
            try {
                delegate.service(request, response);
            } catch (jakarta.servlet.ServletException exception) {
                throw ServletShim.of(exception);
            }
        }

        @Override
        public void service(
            jakarta.servlet.ServletRequest request,
            jakarta.servlet.ServletResponse response
        ) throws javax.servlet.ServletException, IOException {
            try {
                delegate.service(request, response);
            } catch (jakarta.servlet.ServletException exception) {
                throw ServletShim.of(exception);
            }
        }

        @Override
        public javax.servlet.ServletConfig getServletConfig() {
            return ServletShim.of(delegate.getServletConfig());
        }

        @Override
        public String getServletInfo() {
            return delegate.getServletInfo();
        }

        @Override
        public void destroy() {
            delegate.destroy();
        }
    }

    final class ServletConfig extends Shim.Delegate<jakarta.servlet.ServletConfig> implements javax.servlet.ServletConfig {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        ServletConfig(jakarta.servlet.ServletConfig delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public javax.servlet.ServletContext getServletContext() {
            return ServletShim.of(delegate.getServletContext());
        }

        @Override
        public String getServletName() {
            return delegate.getServletName();
        }

        @Override
        public String getInitParameter(String name) {
            return delegate.getInitParameter(name);
        }

        @Override
        public Enumeration<String> getInitParameterNames() {
            return delegate.getInitParameterNames();
        }
    }

    final class ServletConnection extends Shim.Delegate<jakarta.servlet.ServletConnection> implements javax.servlet.ServletConnection {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        ServletConnection(jakarta.servlet.ServletConnection delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public String getConnectionId() {
            return delegate.getConnectionId();
        }

        @Override
        public String getProtocol() {
            return delegate.getProtocol();
        }

        @Override
        public String getProtocolConnectionId() {
            return delegate.getProtocolConnectionId();
        }

        @Override
        public boolean isSecure() {
            return delegate.isSecure();
        }
    }

    final class ServletContainerInitializer extends Shim.Delegate<jakarta.servlet.ServletContainerInitializer> implements javax.servlet.ServletContainerInitializer {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        ServletContainerInitializer(jakarta.servlet.ServletContainerInitializer delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public void onStartup(
            Set<Class<?>> classes,
            javax.servlet.ServletContext context
        ) throws javax.servlet.ServletException {
            try {
                delegate.onStartup(classes, context);
            } catch (jakarta.servlet.ServletException exception) {
                throw ServletShim.of(exception);
            }
        }

        @Override
        public void onStartup(
            Set<Class<?>> classes,
            jakarta.servlet.ServletContext context
        ) throws javax.servlet.ServletException {
            try {
                delegate.onStartup(classes, context);
            } catch (jakarta.servlet.ServletException exception) {
                throw ServletShim.of(exception);
            }
        }
    }

    final class ServletContext extends Shim.Delegate<jakarta.servlet.ServletContext> implements javax.servlet.ServletContext {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        ServletContext(jakarta.servlet.ServletContext delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public String getContextPath() {
            return delegate.getContextPath();
        }

        @Override
        public javax.servlet.ServletContext getContext(String uriPath) {
            return ServletShim.of(delegate.getContext(uriPath));
        }

        @Override
        public int getMajorVersion() {
            return delegate.getMajorVersion();
        }

        @Override
        public int getMinorVersion() {
            return delegate.getMinorVersion();
        }

        @Override
        public int getEffectiveMajorVersion() {
            return delegate.getEffectiveMajorVersion();
        }

        @Override
        public int getEffectiveMinorVersion() {
            return delegate.getEffectiveMinorVersion();
        }

        @Override
        public String getMimeType(String file) {
            return delegate.getMimeType(file);
        }

        @Override
        public Set<String> getResourcePaths(String path) {
            return delegate.getResourcePaths(path);
        }

        @Override
        public URL getResource(String path) throws MalformedURLException {
            return delegate.getResource(path);
        }

        @Override
        public InputStream getResourceAsStream(String path) {
            return delegate.getResourceAsStream(path);
        }

        @Override
        public javax.servlet.RequestDispatcher getRequestDispatcher(String path) {
            return ServletShim.of(delegate.getRequestDispatcher(path));
        }

        @Override
        public javax.servlet.RequestDispatcher getNamedDispatcher(String name) {
            return ServletShim.of(delegate.getNamedDispatcher(name));
        }

        @Override
        public void log(String message) {
            delegate.log(message);
        }

        @Override
        public void log(String message, Throwable throwable) {
            delegate.log(message, throwable);
        }

        @Override
        public String getRealPath(String path) {
            return delegate.getRealPath(path);
        }

        @Override
        public String getServerInfo() {
            return delegate.getServerInfo();
        }

        @Override
        public String getInitParameter(String name) {
            return delegate.getInitParameter(name);
        }

        @Override
        public Enumeration<String> getInitParameterNames() {
            return delegate.getInitParameterNames();
        }

        @Override
        public boolean setInitParameter(String name, String value) {
            return delegate.setInitParameter(name, value);
        }

        @Override
        public Object getAttribute(String name) {
            return delegate.getAttribute(name);
        }

        @Override
        public Enumeration<String> getAttributeNames() {
            return delegate.getAttributeNames();
        }

        @Override
        public void setAttribute(String name, Object object) {
            delegate.setAttribute(name, object);
        }

        @Override
        public void removeAttribute(String name) {
            delegate.removeAttribute(name);
        }

        @Override
        public String getServletContextName() {
            return delegate.getServletContextName();
        }

        @Override
        public javax.servlet.ServletRegistration.Dynamic addServlet(String name, String className) {
            return ServletShim.of(delegate.addServlet(name, className));
        }

        @Override
        public javax.servlet.ServletRegistration.Dynamic addServlet(String name, javax.servlet.Servlet servlet) {
            return ServletShim.of(delegate.addServlet(name, servlet));
        }

        @Override
        public javax.servlet.ServletRegistration.Dynamic addServlet(String name, jakarta.servlet.Servlet servlet) {
            return ServletShim.of(delegate.addServlet(name, servlet));
        }

        @Override
        public javax.servlet.ServletRegistration.Dynamic addServlet(String name, Class clazz) {
            return ServletShim.of(delegate.addServlet(name, clazz.asSubclass(jakarta.servlet.Servlet.class)));
        }

        @Override
        public javax.servlet.ServletRegistration.Dynamic addJspFile(String name, String file) {
            return ServletShim.of(delegate.addJspFile(name, file));
        }

        @Override
        public javax.servlet.Servlet createServlet(Class clazz) throws javax.servlet.ServletException {
            try {
                return ServletShim.of(delegate.createServlet(clazz.asSubclass(jakarta.servlet.Servlet.class)));
            } catch (jakarta.servlet.ServletException exception) {
                throw ServletShim.of(exception);
            }
        }

        @Override
        public javax.servlet.ServletRegistration getServletRegistration(String name) {
            return ServletShim.of(delegate.getServletRegistration(name));
        }

        @Override
        public Map getServletRegistrations() {
            return delegate
                .getServletRegistrations()
                .entrySet()
                .stream()
                .collect(Collectors.toMap(
                    Map.Entry::getKey,
                    ((Function<Object, javax.servlet.ServletRegistration>) ServletShim::of).compose(Map.Entry::getValue)
                ));
        }

        @Override
        public javax.servlet.FilterRegistration.Dynamic addFilter(String name, String className) {
            return ServletShim.of(delegate.addFilter(name, className));
        }

        @Override
        public javax.servlet.FilterRegistration.Dynamic addFilter(String name, javax.servlet.Filter filter) {
            return ServletShim.of(delegate.addFilter(name, filter));
        }

        @Override
        public javax.servlet.FilterRegistration.Dynamic addFilter(String name, jakarta.servlet.Filter filter) {
            return ServletShim.of(delegate.addFilter(name, filter));
        }

        @Override
        public javax.servlet.FilterRegistration.Dynamic addFilter(String name, Class clazz) {
            return ServletShim.of(delegate.addFilter(name, clazz.asSubclass(jakarta.servlet.Filter.class)));
        }

        @Override
        public javax.servlet.Filter createFilter(Class clazz) throws javax.servlet.ServletException {
            try {
                return ServletShim.of(delegate.createFilter(clazz.asSubclass(jakarta.servlet.Filter.class)));
            } catch (jakarta.servlet.ServletException exception) {
                throw ServletShim.of(exception);
            }
        }

        @Override
        public javax.servlet.FilterRegistration getFilterRegistration(String name) {
            return ServletShim.of(delegate.getFilterRegistration(name));
        }

        @Override
        public Map getFilterRegistrations() {
            return delegate
                .getFilterRegistrations()
                .entrySet()
                .stream()
                .collect(Collectors.toMap(
                    Map.Entry::getKey,
                    ((Function<Object, javax.servlet.FilterRegistration>) ServletShim::of).compose(Map.Entry::getValue)
                ));
        }

        @Override
        public SessionCookieConfig getSessionCookieConfig() {
            return ServletShim.of(delegate.getSessionCookieConfig());
        }

        @Override
        public void setSessionTrackingModes(Set sessionTrackingModes) {
            delegate.setSessionTrackingModes(
                ServletShim
                    .<javax.servlet.SessionTrackingMode>of(sessionTrackingModes)
                    .collect(Collectors.toCollection(LinkedHashSet::new))
            );
        }

        @Override
        public Set getDefaultSessionTrackingModes() {
            return ServletShim
                .<javax.servlet.SessionTrackingMode>of(delegate.getDefaultSessionTrackingModes())
                .collect(Collectors.toCollection(LinkedHashSet::new));
        }

        @Override
        public Set getEffectiveSessionTrackingModes() {
            return ServletShim
                .<javax.servlet.SessionTrackingMode>of(delegate.getEffectiveSessionTrackingModes())
                .collect(Collectors.toCollection(LinkedHashSet::new));
        }

        @Override
        public void addListener(String className) {
            delegate.addListener(className);
        }

        @Override
        public <T extends EventListener> void addListener(T listener) {
            delegate.addListener(listener);
        }

        @Override
        public void addListener(Class<? extends EventListener> clazz) {
            delegate.addListener(clazz);
        }

        @Override
        public <T extends EventListener> T createListener(Class<T> clazz) throws javax.servlet.ServletException {
            try {
                return delegate.createListener(clazz);
            } catch (jakarta.servlet.ServletException exception) {
                throw ServletShim.of(exception);
            }
        }

        @Override
        public javax.servlet.descriptor.JspConfigDescriptor getJspConfigDescriptor() {
            return ServletShim.of(delegate.getJspConfigDescriptor());
        }

        @Override
        public ClassLoader getClassLoader() {
            return delegate.getClassLoader();
        }

        @Override
        public void declareRoles(String... roleNames) {
            delegate.declareRoles(roleNames);
        }

        @Override
        public String getVirtualServerName() {
            return delegate.getVirtualServerName();
        }

        @Override
        public int getSessionTimeout() {
            return delegate.getSessionTimeout();
        }

        @Override
        public void setSessionTimeout(int sessionTimeout) {
            delegate.setSessionTimeout(sessionTimeout);
        }

        @Override
        public String getRequestCharacterEncoding() {
            return delegate.getRequestCharacterEncoding();
        }

        @Override
        public void setRequestCharacterEncoding(String encoding) {
            delegate.setRequestCharacterEncoding(encoding);
        }

        @Override
        public String getResponseCharacterEncoding() {
            return delegate.getResponseCharacterEncoding();
        }

        @Override
        public void setResponseCharacterEncoding(String encoding) {
            delegate.setResponseCharacterEncoding(encoding);
        }
    }

    final class ServletContextAttributeEvent extends javax.servlet.ServletContextAttributeEvent {
        private static final long serialVersionUID = -5804680734245618303L; // Use the ID from jakarta.servlet.

        private final jakarta.servlet.ServletContextAttributeEvent delegate;

        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        ServletContextAttributeEvent(jakarta.servlet.ServletContextAttributeEvent delegate) {
            super(ServletShim.of(delegate.getServletContext()), delegate.getName(), delegate.getValue());
            this.delegate = delegate;
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public String getName() {
            return delegate.getName();
        }

        @Override
        public Object getValue() {
            return delegate.getValue();
        }

        @Override
        public javax.servlet.ServletContext getServletContext() {
            return ServletShim.of(delegate.getServletContext());
        }

        @Override
        public Object getSource() {
            return delegate.getSource();
        }

        @Override
        public String toString() {
            return delegate.toString();
        }
    }

    final class ServletContextAttributeListener extends Shim.Delegate<jakarta.servlet.ServletContextAttributeListener> implements javax.servlet.ServletContextAttributeListener {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        ServletContextAttributeListener(jakarta.servlet.ServletContextAttributeListener delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public void attributeAdded(javax.servlet.ServletContextAttributeEvent event) {
            delegate.attributeAdded(new jakarta.servlet.ServletContextAttributeEvent(
                event.getServletContext(),
                event.getName(),
                event.getValue()
            ));
        }

        @Override
        public void attributeAdded(jakarta.servlet.ServletContextAttributeEvent event) {
            delegate.attributeAdded(event);
        }

        @Override
        public void attributeRemoved(javax.servlet.ServletContextAttributeEvent event) {
            delegate.attributeRemoved(new jakarta.servlet.ServletContextAttributeEvent(
                event.getServletContext(),
                event.getName(),
                event.getValue()
            ));
        }

        @Override
        public void attributeRemoved(jakarta.servlet.ServletContextAttributeEvent event) {
            delegate.attributeRemoved(event);
        }

        @Override
        public void attributeReplaced(javax.servlet.ServletContextAttributeEvent event) {
            delegate.attributeReplaced(new jakarta.servlet.ServletContextAttributeEvent(
                event.getServletContext(),
                event.getName(),
                event.getValue()
            ));
        }

        @Override
        public void attributeReplaced(jakarta.servlet.ServletContextAttributeEvent event) {
            delegate.attributeReplaced(event);
        }
    }

    final class ServletContextEvent extends javax.servlet.ServletContextEvent {
        private static final long serialVersionUID = -7501701636134222423L; // Use the ID from jakarta.servlet.

        private final jakarta.servlet.ServletContextEvent delegate;

        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        ServletContextEvent(jakarta.servlet.ServletContextEvent delegate) {
            super(ServletShim.of(delegate.getServletContext()));
            this.delegate = delegate;
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public javax.servlet.ServletContext getServletContext() {
            return ServletShim.of(delegate.getServletContext());
        }

        @Override
        public Object getSource() {
            return delegate.getSource();
        }

        @Override
        public String toString() {
            return delegate.toString();
        }
    }

    final class ServletContextListener extends Shim.Delegate<jakarta.servlet.ServletContextListener> implements javax.servlet.ServletContextListener {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        ServletContextListener(jakarta.servlet.ServletContextListener delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public void contextInitialized(javax.servlet.ServletContextEvent event) {
            delegate.contextInitialized(event);
        }

        @Override
        public void contextInitialized(jakarta.servlet.ServletContextEvent event) {
            delegate.contextInitialized(event);
        }

        @Override
        public void contextDestroyed(javax.servlet.ServletContextEvent event) {
            delegate.contextDestroyed(event);
        }

        @Override
        public void contextDestroyed(jakarta.servlet.ServletContextEvent event) {
            delegate.contextDestroyed(event);
        }
    }

    final class ServletRequestAttributeEvent extends javax.servlet.ServletRequestAttributeEvent {
        private static final long serialVersionUID = -1466635426192317793L; // Use the ID from jakarta.servlet.

        private final jakarta.servlet.ServletRequestAttributeEvent delegate;

        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        ServletRequestAttributeEvent(jakarta.servlet.ServletRequestAttributeEvent delegate) {
            super(ServletShim.of(delegate.getServletContext()), delegate.getName(), delegate.getValue());
            this.delegate = delegate;
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public String getName() {
            return delegate.getName();
        }

        @Override
        public Object getValue() {
            return delegate.getValue();
        }

        @Override
        public javax.servlet.ServletContext getServletContext() {
            return ServletShim.of(delegate.getServletContext());
        }

        @Override
        public javax.servlet.ServletRequest getServletRequest() {
            return ServletShim.of(delegate.getServletRequest());
        }

        @Override
        public Object getSource() {
            return delegate.getSource();
        }

        @Override
        public String toString() {
            return delegate.toString();
        }
    }

    final class ServletRequestAttributeListener extends Shim.Delegate<jakarta.servlet.ServletRequestAttributeListener> implements javax.servlet.ServletRequestAttributeListener {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        ServletRequestAttributeListener(jakarta.servlet.ServletRequestAttributeListener delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public void attributeAdded(javax.servlet.ServletRequestAttributeEvent event) {
            delegate.attributeAdded(new jakarta.servlet.ServletRequestAttributeEvent(
                event.getServletContext(),
                event.getServletRequest(),
                event.getName(),
                event.getValue()
            ));
        }

        @Override
        public void attributeAdded(jakarta.servlet.ServletRequestAttributeEvent event) {
            delegate.attributeAdded(event);
        }

        @Override
        public void attributeRemoved(javax.servlet.ServletRequestAttributeEvent event) {
            delegate.attributeRemoved(new jakarta.servlet.ServletRequestAttributeEvent(
                event.getServletContext(),
                event.getServletRequest(),
                event.getName(),
                event.getValue()
            ));
        }

        @Override
        public void attributeRemoved(jakarta.servlet.ServletRequestAttributeEvent event) {
            delegate.attributeRemoved(event);
        }

        @Override
        public void attributeReplaced(javax.servlet.ServletRequestAttributeEvent event) {
            delegate.attributeReplaced(new jakarta.servlet.ServletRequestAttributeEvent(
                event.getServletContext(),
                event.getServletRequest(),
                event.getName(),
                event.getValue()
            ));
        }

        @Override
        public void attributeReplaced(jakarta.servlet.ServletRequestAttributeEvent event) {
            delegate.attributeReplaced(event);
        }
    }

    final class ServletRequestEvent extends javax.servlet.ServletRequestEvent {
        private static final long serialVersionUID = -7467864054698729101L; // Use the ID from jakarta.servlet.

        private final jakarta.servlet.ServletRequestEvent delegate;

        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        ServletRequestEvent(jakarta.servlet.ServletRequestEvent delegate) {
            super(ServletShim.of(delegate.getServletRequest()));
            this.delegate = delegate;
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public javax.servlet.ServletRequest getServletRequest() {
            return ServletShim.of(delegate.getServletRequest());
        }

        @Override
        public javax.servlet.ServletContext getServletContext() {
            return ServletShim.of(delegate.getServletContext());
        }

        @Override
        public Object getSource() {
            return delegate.getSource();
        }

        @Override
        public String toString() {
            return delegate.toString();
        }
    }

    final class ServletRequestListener extends Shim.Delegate<jakarta.servlet.ServletRequestListener> implements javax.servlet.ServletRequestListener {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        ServletRequestListener(jakarta.servlet.ServletRequestListener delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public void requestInitialized(javax.servlet.ServletRequestEvent event) {
            delegate.requestInitialized(event);
        }

        @Override
        public void requestInitialized(jakarta.servlet.ServletRequestEvent event) {
            delegate.requestInitialized(event);
        }

        @Override
        public void requestDestroyed(javax.servlet.ServletRequestEvent event) {
            delegate.requestDestroyed(event);
        }

        @Override
        public void requestDestroyed(jakarta.servlet.ServletRequestEvent event) {
            delegate.requestDestroyed(event);
        }
    }

    final class ServletException extends javax.servlet.ServletException {
        private final jakarta.servlet.ServletException delegate;

        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        ServletException(jakarta.servlet.ServletException delegate) {
            super(delegate.getMessage(), delegate.getRootCause());
            this.delegate = delegate;
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public Throwable getRootCause() {
            return delegate.getRootCause();
        }

        @Override
        public String getMessage() {
            return delegate.getMessage();
        }

        @Override
        public String getLocalizedMessage() {
            return delegate.getLocalizedMessage();
        }

        @Override
        public Throwable getCause() {
            return delegate.getCause();
        }

        @Override
        public Throwable initCause(Throwable cause) {
            return delegate.initCause(cause);
        }

        @Override
        public String toString() {
            return delegate.toString();
        }

        @Override
        public void printStackTrace() {
            delegate.printStackTrace();
        }

        @Override
        public void printStackTrace(PrintStream s) {
            delegate.printStackTrace(s);
        }

        @Override
        public void printStackTrace(PrintWriter s) {
            delegate.printStackTrace(s);
        }

        @Override
        public Throwable fillInStackTrace() {
            return delegate.fillInStackTrace();
        }

        @Override
        public StackTraceElement[] getStackTrace() {
            return delegate.getStackTrace();
        }

        @Override
        public void setStackTrace(StackTraceElement[] stackTrace) {
            delegate.setStackTrace(stackTrace);
        }
    }

    final class ServletInputStream extends javax.servlet.ServletInputStream {
        private final jakarta.servlet.ServletInputStream delegate;

        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        ServletInputStream(jakarta.servlet.ServletInputStream delegate) {
            this.delegate = delegate;
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public int readLine(byte[] b, int off, int len) throws IOException {
            return delegate.readLine(b, off, len);
        }

        @Override
        public boolean isFinished() {
            return delegate.isFinished();
        }

        @Override
        public boolean isReady() {
            return delegate.isReady();
        }

        @Override
        public void setReadListener(javax.servlet.ReadListener readListener) {
            delegate.setReadListener(readListener);
        }

        @Override
        public void setReadListener(jakarta.servlet.ReadListener readListener) {
            delegate.setReadListener(readListener);
        }

        @Override
        public int read() throws IOException {
            return delegate.read();
        }

        @Override
        public int read(byte[] b) throws IOException {
            return delegate.read(b);
        }

        @Override
        public int read(byte[] b, int off, int len) throws IOException {
            return delegate.read(b, off, len);
        }

        @Override
        public byte[] readAllBytes() throws IOException {
            return delegate.readAllBytes();
        }

        @Override
        public byte[] readNBytes(int len) throws IOException {
            return delegate.readNBytes(len);
        }

        @Override
        public int readNBytes(byte[] b, int off, int len) throws IOException {
            return delegate.readNBytes(b, off, len);
        }

        @Override
        public long skip(long n) throws IOException {
            return delegate.skip(n);
        }

        @Override
        public int available() throws IOException {
            return delegate.available();
        }

        @Override
        public void close() throws IOException {
            delegate.close();
        }

        @Override
        public void mark(int limit) {
            delegate.mark(limit);
        }

        @Override
        public void reset() throws IOException {
            delegate.reset();
        }

        @Override
        public boolean markSupported() {
            return delegate.markSupported();
        }

        @Override
        public long transferTo(OutputStream out) throws IOException {
            return delegate.transferTo(out);
        }
    }

    final class ServletOutputStream extends javax.servlet.ServletOutputStream {
        private final jakarta.servlet.ServletOutputStream delegate;

        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        ServletOutputStream(jakarta.servlet.ServletOutputStream delegate) {
            this.delegate = delegate;
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public void print(String s) throws IOException {
            delegate.print(s);
        }

        @Override
        public void print(boolean b) throws IOException {
            delegate.print(b);
        }

        @Override
        public void print(char c) throws IOException {
            delegate.print(c);
        }

        @Override
        public void print(int i) throws IOException {
            delegate.print(i);
        }

        @Override
        public void print(long l) throws IOException {
            delegate.print(l);
        }

        @Override
        public void print(float f) throws IOException {
            delegate.print(f);
        }

        @Override
        public void print(double d) throws IOException {
            delegate.print(d);
        }

        @Override
        public void println() throws IOException {
            delegate.println();
        }

        @Override
        public void println(String s) throws IOException {
            delegate.println(s);
        }

        @Override
        public void println(boolean b) throws IOException {
            delegate.println(b);
        }

        @Override
        public void println(char c) throws IOException {
            delegate.println(c);
        }

        @Override
        public void println(int i) throws IOException {
            delegate.println(i);
        }

        @Override
        public void println(long l) throws IOException {
            delegate.println(l);
        }

        @Override
        public void println(float f) throws IOException {
            delegate.println(f);
        }

        @Override
        public void println(double d) throws IOException {
            delegate.println(d);
        }

        @Override
        public boolean isReady() {
            return delegate.isReady();
        }

        @Override
        public void setWriteListener(javax.servlet.WriteListener writeListener) {
            delegate.setWriteListener(writeListener);
        }

        @Override
        public void setWriteListener(jakarta.servlet.WriteListener writeListener) {
            delegate.setWriteListener(writeListener);
        }

        @Override
        public void write(int b) throws IOException {
            delegate.write(b);
        }

        @Override
        public void write(byte[] b) throws IOException {
            delegate.write(b);
        }

        @Override
        public void write(byte[] b, int off, int len) throws IOException {
            delegate.write(b, off, len);
        }

        @Override
        public void flush() throws IOException {
            delegate.flush();
        }

        @Override
        public void close() throws IOException {
            delegate.close();
        }
    }

    final class ServletRegistration extends Shim.Delegate<jakarta.servlet.ServletRegistration> implements javax.servlet.ServletRegistration {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        ServletRegistration(jakarta.servlet.ServletRegistration delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public Set<String> addMapping(String... urlPatterns) {
            return delegate.addMapping(urlPatterns);
        }

        @Override
        public Collection<String> getMappings() {
            return delegate.getMappings();
        }

        @Override
        public String getRunAsRole() {
            return delegate.getRunAsRole();
        }

        @Override
        public String getName() {
            return delegate.getName();
        }

        @Override
        public String getClassName() {
            return delegate.getClassName();
        }

        @Override
        public boolean setInitParameter(String name, String value) {
            return delegate.setInitParameter(name, value);
        }

        @Override
        public String getInitParameter(String name) {
            return delegate.getInitParameter(name);
        }

        @Override
        public Set<String> setInitParameters(Map<String, String> initParameters) {
            return delegate.setInitParameters(initParameters);
        }

        @Override
        public Map<String, String> getInitParameters() {
            return delegate.getInitParameters();
        }
    }

    final class ServletRegistration$Dynamic extends Shim.Delegate<jakarta.servlet.ServletRegistration.Dynamic> implements javax.servlet.ServletRegistration.Dynamic {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        ServletRegistration$Dynamic(jakarta.servlet.ServletRegistration.Dynamic delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public Set<String> addMapping(String... urlPatterns) {
            return delegate.addMapping(urlPatterns);
        }

        @Override
        public Collection<String> getMappings() {
            return delegate.getMappings();
        }

        @Override
        public String getRunAsRole() {
            return delegate.getRunAsRole();
        }

        @Override
        public void setRunAsRole(String roleName) {
            delegate.setRunAsRole(roleName);
        }

        @Override
        public void setLoadOnStartup(int loadOnStartup) {
            delegate.setLoadOnStartup(loadOnStartup);
        }

        @Override
        public Set<String> setServletSecurity(javax.servlet.ServletSecurityElement constraint) {
            // This is a little more involved since the shim's hierarchy diverged.
            final var methodConstraints =
                constraint
                    .getHttpMethodConstraints()
                    .stream()
                    .map(methodConstraint -> new jakarta.servlet.HttpMethodConstraintElement(
                        methodConstraint.getMethodName(),
                        methodConstraint
                    ))
                    .collect(Collectors.toList());
            return delegate.setServletSecurity(new jakarta.servlet.ServletSecurityElement(constraint, methodConstraints));
        }

        @Override
        public Set<String> setServletSecurity(jakarta.servlet.ServletSecurityElement constraint) {
            return delegate.setServletSecurity(constraint);
        }

        @Override
        public void setMultipartConfig(javax.servlet.MultipartConfigElement multipartConfig) {
            delegate.setMultipartConfig(multipartConfig);
        }

        @Override
        public void setMultipartConfig(jakarta.servlet.MultipartConfigElement multipartConfig) {
            delegate.setMultipartConfig(multipartConfig);
        }

        @Override
        public String getName() {
            return delegate.getName();
        }

        @Override
        public String getClassName() {
            return delegate.getClassName();
        }

        @Override
        public boolean setInitParameter(String name, String value) {
            return delegate.setInitParameter(name, value);
        }

        @Override
        public String getInitParameter(String name) {
            return delegate.getInitParameter(name);
        }

        @Override
        public Set<String> setInitParameters(Map<String, String> initParameters) {
            return delegate.setInitParameters(initParameters);
        }

        @Override
        public Map<String, String> getInitParameters() {
            return delegate.getInitParameters();
        }

        @Override
        public void setAsyncSupported(boolean isAsyncSupported) {
            delegate.setAsyncSupported(isAsyncSupported);
        }
    }

    final class ServletRequest extends Shim.Delegate<jakarta.servlet.ServletRequest> implements javax.servlet.ServletRequest {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        ServletRequest(jakarta.servlet.ServletRequest delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public Object getAttribute(String name) {
            return delegate.getAttribute(name);
        }

        @Override
        public Enumeration<String> getAttributeNames() {
            return delegate.getAttributeNames();
        }

        @Override
        public String getCharacterEncoding() {
            return delegate.getCharacterEncoding();
        }

        @Override
        public void setCharacterEncoding(String encoding) throws UnsupportedEncodingException {
            delegate.setCharacterEncoding(encoding);
        }

        @Override
        public int getContentLength() {
            return delegate.getContentLength();
        }

        @Override
        public long getContentLengthLong() {
            return delegate.getContentLengthLong();
        }

        @Override
        public String getContentType() {
            return delegate.getContentType();
        }

        @Override
        public javax.servlet.ServletInputStream getInputStream() throws IOException {
            return ServletShim.of(delegate.getInputStream());
        }

        @Override
        public String getParameter(String name) {
            return delegate.getParameter(name);
        }

        @Override
        public Enumeration<String> getParameterNames() {
            return delegate.getParameterNames();
        }

        @Override
        public String[] getParameterValues(String name) {
            return delegate.getParameterValues(name);
        }

        @Override
        public Map<String, String[]> getParameterMap() {
            return delegate.getParameterMap();
        }

        @Override
        public String getProtocol() {
            return delegate.getProtocol();
        }

        @Override
        public String getScheme() {
            return delegate.getScheme();
        }

        @Override
        public String getServerName() {
            return delegate.getServerName();
        }

        @Override
        public int getServerPort() {
            return delegate.getServerPort();
        }

        @Override
        public BufferedReader getReader() throws IOException {
            return delegate.getReader();
        }

        @Override
        public String getRemoteAddr() {
            return delegate.getRemoteAddr();
        }

        @Override
        public String getRemoteHost() {
            return delegate.getRemoteHost();
        }

        @Override
        public void setAttribute(String name, Object o) {
            delegate.setAttribute(name, o);
        }

        @Override
        public void removeAttribute(String name) {
            delegate.removeAttribute(name);
        }

        @Override
        public Locale getLocale() {
            return delegate.getLocale();
        }

        @Override
        public Enumeration<Locale> getLocales() {
            return delegate.getLocales();
        }

        @Override
        public boolean isSecure() {
            return delegate.isSecure();
        }

        @Override
        public javax.servlet.RequestDispatcher getRequestDispatcher(String path) {
            return ServletShim.of(delegate.getRequestDispatcher(path));
        }

        @Override
        public int getRemotePort() {
            return delegate.getRemotePort();
        }

        @Override
        public String getLocalName() {
            return delegate.getLocalName();
        }

        @Override
        public String getLocalAddr() {
            return delegate.getLocalAddr();
        }

        @Override
        public int getLocalPort() {
            return delegate.getLocalPort();
        }

        @Override
        public javax.servlet.ServletContext getServletContext() {
            return ServletShim.of(delegate.getServletContext());
        }

        @Override
        public javax.servlet.AsyncContext startAsync() throws IllegalStateException {
            return ServletShim.of(delegate.startAsync());
        }

        @Override
        public javax.servlet.AsyncContext startAsync(
            javax.servlet.ServletRequest request,
            javax.servlet.ServletResponse response
        ) throws IllegalStateException {
            return ServletShim.of(delegate.startAsync(request, response));
        }

        @Override
        public javax.servlet.AsyncContext startAsync(
            jakarta.servlet.ServletRequest request,
            jakarta.servlet.ServletResponse response
        ) throws IllegalStateException {
            return ServletShim.of(delegate.startAsync(request, response));
        }

        @Override
        public boolean isAsyncStarted() {
            return delegate.isAsyncStarted();
        }

        @Override
        public boolean isAsyncSupported() {
            return delegate.isAsyncSupported();
        }

        @Override
        public javax.servlet.AsyncContext getAsyncContext() {
            return ServletShim.of(delegate.getAsyncContext());
        }

        @Override
        public javax.servlet.DispatcherType getDispatcherType() {
            return ServletShim.of(delegate.getDispatcherType());
        }

        @Override
        public String getRequestId() {
            return delegate.getRequestId();
        }

        @Override
        public String getProtocolRequestId() {
            return delegate.getProtocolRequestId();
        }

        @Override
        public javax.servlet.ServletConnection getServletConnection() {
            return ServletShim.of(delegate.getServletConnection());
        }
    }

    final class ServletRequestWrapper extends javax.servlet.ServletRequestWrapper {
        private final jakarta.servlet.ServletRequestWrapper delegate;

        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        ServletRequestWrapper(jakarta.servlet.ServletRequestWrapper delegate) {
            super(new ServletRequest(delegate));
            this.delegate = delegate;
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public javax.servlet.ServletRequest getRequest() {
            return ServletShim.of(delegate.getRequest());
        }

        @Override
        public void setRequest(jakarta.servlet.ServletRequest request) {
            delegate.setRequest(request);
        }

        @Override
        public boolean isWrapperFor(jakarta.servlet.ServletRequest wrapped) {
            return delegate.isWrapperFor(wrapped);
        }

        @Override
        public boolean isWrapperFor(Class<?> wrappedType) {
            return delegate.isWrapperFor(wrappedType);
        }
    }

    final class ServletResponse extends Shim.Delegate<jakarta.servlet.ServletResponse> implements javax.servlet.ServletResponse {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        ServletResponse(jakarta.servlet.ServletResponse delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public String getCharacterEncoding() {
            return delegate.getCharacterEncoding();
        }

        @Override
        public String getContentType() {
            return delegate.getContentType();
        }

        @Override
        public javax.servlet.ServletOutputStream getOutputStream() throws IOException {
            return ServletShim.of(delegate.getOutputStream());
        }

        @Override
        public PrintWriter getWriter() throws IOException {
            return delegate.getWriter();
        }

        @Override
        public void setCharacterEncoding(String charset) {
            delegate.setCharacterEncoding(charset);
        }

        @Override
        public void setContentLength(int len) {
            delegate.setContentLength(len);
        }

        @Override
        public void setContentLengthLong(long len) {
            delegate.setContentLengthLong(len);
        }

        @Override
        public void setContentType(String type) {
            delegate.setContentType(type);
        }

        @Override
        public void setBufferSize(int size) {
            delegate.setBufferSize(size);
        }

        @Override
        public int getBufferSize() {
            return delegate.getBufferSize();
        }

        @Override
        public void flushBuffer() throws IOException {
            delegate.flushBuffer();
        }

        @Override
        public void resetBuffer() {
            delegate.resetBuffer();
        }

        @Override
        public boolean isCommitted() {
            return delegate.isCommitted();
        }

        @Override
        public void reset() {
            delegate.reset();
        }

        @Override
        public void setLocale(Locale loc) {
            delegate.setLocale(loc);
        }

        @Override
        public Locale getLocale() {
            return delegate.getLocale();
        }
    }

    final class ServletResponseWrapper extends javax.servlet.ServletResponseWrapper {
        private final jakarta.servlet.ServletResponseWrapper delegate;

        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        ServletResponseWrapper(jakarta.servlet.ServletResponseWrapper delegate) {
            super(new ServletResponse(delegate));
            this.delegate = delegate;
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public javax.servlet.ServletResponse getResponse() {
            return ServletShim.of(delegate.getResponse());
        }
    }

    final class ServletSecurityElement extends javax.servlet.ServletSecurityElement {
        private final jakarta.servlet.ServletSecurityElement delegate;

        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        ServletSecurityElement(jakarta.servlet.ServletSecurityElement delegate) {
            super(delegate);
            this.delegate = delegate;
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public Collection<javax.servlet.HttpMethodConstraintElement> getHttpMethodConstraints() {
            return ServletShim
                .<javax.servlet.HttpMethodConstraintElement>of(delegate.getHttpMethodConstraints())
                .collect(Collectors.toList());
        }

        @Override
        public Collection<String> getMethodNames() {
            return delegate.getMethodNames();
        }

        @Override
        public jakarta.servlet.annotation.ServletSecurity.EmptyRoleSemantic getEmptyRoleSemantic() {
            return delegate.getEmptyRoleSemantic();
        }

        @Override
        public jakarta.servlet.annotation.ServletSecurity.TransportGuarantee getTransportGuarantee() {
            return delegate.getTransportGuarantee();
        }

        @Override
        public String[] getRolesAllowed() {
            return delegate.getRolesAllowed();
        }
    }

    final class SessionCookieConfig extends Shim.Delegate<jakarta.servlet.SessionCookieConfig> implements javax.servlet.SessionCookieConfig {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        SessionCookieConfig(jakarta.servlet.SessionCookieConfig delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public void setName(String name) {
            delegate.setName(name);
        }

        @Override
        public String getName() {
            return delegate.getName();
        }

        @Override
        public void setDomain(String domain) {
            delegate.setDomain(domain);
        }

        @Override
        public String getDomain() {
            return delegate.getDomain();
        }

        @Override
        public void setPath(String path) {
            delegate.setPath(path);
        }

        @Override
        public String getPath() {
            return delegate.getPath();
        }

        @Override
        @SuppressWarnings("removal")
        public void setComment(String comment) {
            delegate.setComment(comment);
        }

        @Override
        @SuppressWarnings("removal")
        public String getComment() {
            return delegate.getComment();
        }

        @Override
        public void setHttpOnly(boolean httpOnly) {
            delegate.setHttpOnly(httpOnly);
        }

        @Override
        public boolean isHttpOnly() {
            return delegate.isHttpOnly();
        }

        @Override
        public void setSecure(boolean secure) {
            delegate.setSecure(secure);
        }

        @Override
        public boolean isSecure() {
            return delegate.isSecure();
        }

        @Override
        public void setMaxAge(int maxAge) {
            delegate.setMaxAge(maxAge);
        }

        @Override
        public int getMaxAge() {
            return delegate.getMaxAge();
        }

        @Override
        public void setAttribute(String name, String value) {
            delegate.setAttribute(name, value);
        }

        @Override
        public String getAttribute(String name) {
            return delegate.getAttribute(name);
        }

        @Override
        public Map<String, String> getAttributes() {
            return delegate.getAttributes();
        }
    }

    final class UnavailableException extends javax.servlet.UnavailableException {
        private final jakarta.servlet.UnavailableException delegate;

        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        UnavailableException(jakarta.servlet.UnavailableException delegate) {
            super(delegate.getMessage(), delegate.getUnavailableSeconds());
            this.delegate = delegate;
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public boolean isPermanent() {
            return delegate.isPermanent();
        }

        @Override
        public int getUnavailableSeconds() {
            return delegate.getUnavailableSeconds();
        }

        @Override
        public Throwable getRootCause() {
            return delegate.getRootCause();
        }

        @Override
        public String getMessage() {
            return delegate.getMessage();
        }

        @Override
        public String getLocalizedMessage() {
            return delegate.getLocalizedMessage();
        }

        @Override
        public Throwable getCause() {
            return delegate.getCause();
        }

        @Override
        public Throwable initCause(Throwable cause) {
            return delegate.initCause(cause);
        }

        @Override
        public String toString() {
            return delegate.toString();
        }

        @Override
        public void printStackTrace() {
            delegate.printStackTrace();
        }

        @Override
        public void printStackTrace(PrintStream s) {
            delegate.printStackTrace(s);
        }

        @Override
        public void printStackTrace(PrintWriter s) {
            delegate.printStackTrace(s);
        }

        @Override
        public Throwable fillInStackTrace() {
            return delegate.fillInStackTrace();
        }

        @Override
        public StackTraceElement[] getStackTrace() {
            return delegate.getStackTrace();
        }

        @Override
        public void setStackTrace(StackTraceElement[] stackTrace) {
            delegate.setStackTrace(stackTrace);
        }
    }

    final class WebConnection extends Shim.Delegate<jakarta.servlet.http.WebConnection> implements javax.servlet.http.WebConnection {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        WebConnection(jakarta.servlet.http.WebConnection delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public javax.servlet.ServletInputStream getInputStream() throws IOException {
            return ServletShim.of(delegate.getInputStream());
        }

        @Override
        public javax.servlet.ServletOutputStream getOutputStream() throws IOException {
            return ServletShim.of(delegate.getOutputStream());
        }

        @Override
        public void close() throws Exception {
            delegate.close();
        }
    }

    final class WriteListener extends Shim.Delegate<jakarta.servlet.WriteListener> implements javax.servlet.WriteListener {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        WriteListener(jakarta.servlet.WriteListener delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public void onWritePossible() throws IOException {
            delegate.onWritePossible();
        }

        @Override
        public void onError(Throwable throwable) {
            delegate.onError(throwable);
        }
    }
}
