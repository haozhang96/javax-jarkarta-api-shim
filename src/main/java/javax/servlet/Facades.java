package javax.servlet;

import javax.shim.Shim;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @deprecated Use {@link jakarta.servlet} instead.
 */
@Deprecated(since = "jakarta.servlet")
@SuppressWarnings("all") // A lot of ugliness is required to bridge the facades between the two APIs.
interface Facades {
    //==================================================================================================================
    // Annotations
    //==================================================================================================================

    final class HandlesTypes extends Shim.Delegate.Annotation<jakarta.servlet.annotation.HandlesTypes> implements javax.servlet.annotation.HandlesTypes {
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

    final class HttpConstraint extends Shim.Delegate.Annotation<jakarta.servlet.annotation.HttpConstraint> implements javax.servlet.annotation.HttpConstraint {
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

    final class HttpMethodConstraint extends Shim.Delegate.Annotation<jakarta.servlet.annotation.HttpMethodConstraint> implements javax.servlet.annotation.HttpMethodConstraint {
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

    final class MultipartConfig extends Shim.Delegate.Annotation<jakarta.servlet.annotation.MultipartConfig> implements javax.servlet.annotation.MultipartConfig {
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

    final class ServletSecurity extends Shim.Delegate.Annotation<jakarta.servlet.annotation.ServletSecurity> implements javax.servlet.annotation.ServletSecurity {
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
            return ServletShim.of(javax.servlet.annotation.HttpMethodConstraint[]::new, delegate.httpMethodConstraints());
        }
    }

    final class WebFilter extends Shim.Delegate.Annotation<jakarta.servlet.annotation.WebFilter> implements javax.servlet.annotation.WebFilter {
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
            return ServletShim.of(javax.servlet.annotation.WebInitParam[]::new, delegate.initParams());
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
        public DispatcherType[] dispatcherTypes() {
            return ServletShim.of(DispatcherType[]::new, delegate.dispatcherTypes());
        }

        @Override
        public boolean asyncSupported() {
            return delegate.asyncSupported();
        }
    }

    final class WebInitParam extends Shim.Delegate.Annotation<jakarta.servlet.annotation.WebInitParam> implements javax.servlet.annotation.WebInitParam {
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

    final class WebListener extends Shim.Delegate.Annotation<jakarta.servlet.annotation.WebListener> implements javax.servlet.annotation.WebListener {
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

    final class WebServlet extends Shim.Delegate.Annotation<jakarta.servlet.annotation.WebServlet> implements javax.servlet.annotation.WebServlet {
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
            return ServletShim.of(javax.servlet.annotation.WebInitParam[]::new, delegate.initParams());
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
        public <T extends javax.servlet.AsyncListener> T createListener(
            Class<T> clazz,
            Void... ignored
        ) throws javax.servlet.ServletException {
            try {
                return delegate.createListener(clazz);
            } catch (jakarta.servlet.ServletException exception) {
                throw ServletShim.of(exception);
            }
        }

        @Override
        public <T extends jakarta.servlet.AsyncListener> T createListener(
            Class<T> clazz
        ) throws jakarta.servlet.ServletException {
            return delegate.createListener(clazz);
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
        public void init(jakarta.servlet.FilterConfig config) throws jakarta.servlet.ServletException {
            delegate.init(config);
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
        ) throws jakarta.servlet.ServletException, IOException {
            delegate.doFilter(request, response, chain);
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
        ) throws jakarta.servlet.ServletException, IOException {
            delegate.doFilter(request, response);
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
        public void init(jakarta.servlet.FilterConfig config) throws jakarta.servlet.ServletException {
            delegate.init(config);
        }

        @Override
        public void init() throws jakarta.servlet.ServletException {
            delegate.init();
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
        ) throws jakarta.servlet.ServletException, IOException {
            delegate.doFilter(request, response, chain);
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
        public void init(jakarta.servlet.ServletConfig config) throws jakarta.servlet.ServletException {
            delegate.init(config);
        }

        @Override
        public void init() throws jakarta.servlet.ServletException {
            delegate.init();
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
        ) throws jakarta.servlet.ServletException, IOException {
            delegate.service(request, response);
        }

        @Override
        public String getServletName() {
            return delegate.getServletName();
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
        public void init(jakarta.servlet.ServletConfig config) throws jakarta.servlet.ServletException {
            delegate.init(config);
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
        ) throws jakarta.servlet.ServletException, IOException {
            delegate.service(request, response);
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
        public javax.servlet.ServletRegistration.Dynamic addServlet(String servletName, String className) {
            return ServletShim.of(delegate.addServlet(servletName, className));
        }

        @Override
        public javax.servlet.ServletRegistration.Dynamic addServlet(String servletName, javax.servlet.Servlet servlet) {
            return ServletShim.of(delegate.addServlet(servletName, servlet));
        }

        @Override
        public javax.servlet.ServletRegistration.Dynamic addServlet(String servletName, jakarta.servlet.Servlet servlet) {
            return ServletShim.of(delegate.addServlet(servletName, servlet));
        }

        @Override
        public javax.servlet.ServletRegistration.Dynamic addServlet(String servletName, Class servletClass) {
            return ServletShim.of(delegate.addServlet(servletName, servletClass));
        }

        @Override
        public javax.servlet.ServletRegistration.Dynamic addJspFile(String servletName, String jspFile) {
            return ServletShim.of(delegate.addJspFile(servletName, jspFile));
        }

        @Override
        public javax.servlet.Servlet createServlet(Class clazz) throws javax.servlet.ServletException {
            try {
                return ServletShim.of(delegate.createServlet(clazz));
            } catch (jakarta.servlet.ServletException exception) {
                throw ServletShim.of(exception);
            }
        }

        @Override
        public javax.servlet.ServletRegistration getServletRegistration(String servletName) {
            return ServletShim.of(delegate.getServletRegistration(servletName));
        }

        @Override
        public Map getServletRegistrations() {
            return delegate.getServletRegistrations();
        }

        @Override
        public javax.servlet.FilterRegistration.Dynamic addFilter(String filterName, String className) {
            return ServletShim.of(delegate.addFilter(filterName, className));
        }

        @Override
        public javax.servlet.FilterRegistration.Dynamic addFilter(String filterName, javax.servlet.Filter filter) {
            return ServletShim.of(delegate.addFilter(filterName, filter));
        }

        @Override
        public javax.servlet.FilterRegistration.Dynamic addFilter(String filterName, jakarta.servlet.Filter filter) {
            return ServletShim.of(delegate.addFilter(filterName, filter));
        }

        @Override
        public javax.servlet.FilterRegistration.Dynamic addFilter(String filterName, Class filterClass) {
            return ServletShim.of(delegate.addFilter(filterName, filterClass));
        }

        @Override
        public javax.servlet.Filter createFilter(Class clazz) throws javax.servlet.ServletException {
            try {
                return ServletShim.of(delegate.createFilter(clazz));
            } catch (jakarta.servlet.ServletException exception) {
                throw ServletShim.of(exception);
            }
        }

        @Override
        public javax.servlet.FilterRegistration getFilterRegistration(String filterName) {
            return ServletShim.of(delegate.getFilterRegistration(filterName));
        }

        @Override
        public Map getFilterRegistrations() {
            return delegate.getFilterRegistrations();
        }

        @Override
        public SessionCookieConfig getSessionCookieConfig() {
            return ServletShim.of(delegate.getSessionCookieConfig());
        }

        @Override
        public void setSessionTrackingModes(Set sessionTrackingModes) {
            delegate.setSessionTrackingModes(
                ((Set<javax.servlet.SessionTrackingMode>) sessionTrackingModes)
                    .stream()
                    .map(Enum::name)
                    .map(jakarta.servlet.SessionTrackingMode::valueOf)
                    .collect(Collectors.toUnmodifiableSet())
            );
        }

        @Override
        public Set getDefaultSessionTrackingModes() {
            return delegate
                .getDefaultSessionTrackingModes()
                .stream()
                .map(Enum::name)
                .map(javax.servlet.SessionTrackingMode::valueOf)
                .collect(Collectors.toUnmodifiableSet());
        }

        @Override
        public Set getEffectiveSessionTrackingModes() {
            return delegate
                .getEffectiveSessionTrackingModes()
                .stream()
                .map(Enum::name)
                .map(javax.servlet.SessionTrackingMode::valueOf)
                .collect(Collectors.toUnmodifiableSet());
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
        public void addListener(Class<? extends EventListener> listenerClass) {
            delegate.addListener(listenerClass);
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
        public Set<String> setServletSecurity(javax.servlet.ServletSecurityElement root) {
            // This is a little more involved since the shim's hierarchy diverged.
            final var constraint =
                new javax.servlet.HttpConstraintElement(
                    root.getEmptyRoleSemantic(),
                    root.getTransportGuarantee(),
                    root.getRolesAllowed()
                );
            final var servletSecurity =
                new jakarta.servlet.ServletSecurityElement(constraint, (Collection) root.getHttpMethodConstraints());
            return delegate.setServletSecurity(servletSecurity);
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
        public void setCharacterEncoding(String env) throws UnsupportedEncodingException {
            delegate.setCharacterEncoding(env);
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
        public jakarta.servlet.DispatcherType getDispatcherType() {
            return delegate.getDispatcherType();
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
