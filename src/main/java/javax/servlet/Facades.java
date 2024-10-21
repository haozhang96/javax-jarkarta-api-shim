package javax.servlet;

import javax.shim.Shim;
import java.io.IOException;
import java.util.Enumeration;

@SuppressWarnings({"deprecation", "ClassExplicitlyAnnotation"})
interface Facades {
    //==================================================================================================================
    // Annotations
    //==================================================================================================================

    class HandlesTypes extends Shim.Annotation<jakarta.servlet.annotation.HandlesTypes> implements javax.servlet.annotation.HandlesTypes {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        protected HandlesTypes(jakarta.servlet.annotation.HandlesTypes delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // HandlesTypes Implementation Methods
        //==============================================================================================================

        @Override
        public Class<?>[] value() {
            return delegate.value();
        }
    }

    class HttpConstraint extends Shim.Annotation<jakarta.servlet.annotation.HttpConstraint> implements javax.servlet.annotation.HttpConstraint {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        protected HttpConstraint(jakarta.servlet.annotation.HttpConstraint delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // HttpConstraint Implementation Methods
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

    class HttpMethodConstraint extends Shim.Annotation<jakarta.servlet.annotation.HttpMethodConstraint> implements javax.servlet.annotation.HttpMethodConstraint {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        protected HttpMethodConstraint(jakarta.servlet.annotation.HttpMethodConstraint delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // HttpMethodConstraint Implementation Methods
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

    class MultipartConfig extends Shim.Annotation<jakarta.servlet.annotation.MultipartConfig> implements javax.servlet.annotation.MultipartConfig {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        protected MultipartConfig(jakarta.servlet.annotation.MultipartConfig delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // MultipartConfig Implementation Methods
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

    class ServletSecurity extends Shim.Annotation<jakarta.servlet.annotation.ServletSecurity> implements javax.servlet.annotation.ServletSecurity {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        protected ServletSecurity(jakarta.servlet.annotation.ServletSecurity delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // ServletSecurity Implementation Methods
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

    class WebFilter extends Shim.Annotation<jakarta.servlet.annotation.WebFilter> implements javax.servlet.annotation.WebFilter {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        protected WebFilter(jakarta.servlet.annotation.WebFilter delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // WebFilter Implementation Methods
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

    class WebInitParam extends Shim.Annotation<jakarta.servlet.annotation.WebInitParam> implements javax.servlet.annotation.WebInitParam {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        protected WebInitParam(jakarta.servlet.annotation.WebInitParam delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // WebInitParam Implementation Methods
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

    class WebListener extends Shim.Annotation<jakarta.servlet.annotation.WebListener> implements javax.servlet.annotation.WebListener {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        protected WebListener(jakarta.servlet.annotation.WebListener delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // WebListener Implementation Methods
        //==============================================================================================================

        @Override
        public String value() {
            return delegate.value();
        }
    }

    class WebServlet extends Shim.Annotation<jakarta.servlet.annotation.WebServlet> implements javax.servlet.annotation.WebServlet {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        protected WebServlet(jakarta.servlet.annotation.WebServlet delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // WebServlet Implementation Methods
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

    class Servlet extends Shim.Delegate<jakarta.servlet.Servlet> implements javax.servlet.Servlet {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        protected Servlet(jakarta.servlet.Servlet delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Servlet Implementation Methods
        //==============================================================================================================

        @Override
        public void init(javax.servlet.ServletConfig config) throws ServletException {
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

    class ServletConfig extends Shim.Delegate<jakarta.servlet.ServletConfig> implements javax.servlet.ServletConfig {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        protected ServletConfig(jakarta.servlet.ServletConfig delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // ServletConfig Implementation Methods
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

    class ServletContext extends Shim.Delegate<jakarta.servlet.ServletContext> implements javax.servlet.ServletContext {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        protected ServletContext(jakarta.servlet.ServletContext delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // ServletContext Implementation Methods
        //==============================================================================================================


    }
}
