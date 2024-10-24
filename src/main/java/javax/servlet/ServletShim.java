package javax.servlet;

import javax.servlet.annotation.ServletSecurity;
import javax.servlet.http.MappingMatch;
import javax.shim.Shim;
import java.lang.annotation.Annotation;
import java.util.EventListener;
import java.util.EventObject;
import java.util.function.IntFunction;
import java.util.stream.Stream;

/**
 * @deprecated Use {@link jakarta.servlet} instead.
 */
@Deprecated(since = "jakarta.servlet")
public interface ServletShim extends Shim {
    //==================================================================================================================
    // Factory Methods
    //==================================================================================================================

    @SuppressWarnings("rawtypes")
    static <T, S extends ServletShim> S of(T object) {
        //==============================================================================================================
        // Specializations
        //==============================================================================================================

        if (object instanceof ServletShim) {
            return T(object);
        } else if (object instanceof jakarta.servlet.ServletException) {
            return T(of((jakarta.servlet.ServletException) object));
        } else if (object instanceof Enum<?>) {
            return T(of((Enum) object));
        } else if (object instanceof Annotation) {
            return T(of((Annotation) object));
        } else if (object instanceof EventListener) {
            return T(of((EventListener) object));
        } else if (object instanceof EventObject) {
            return T(of((EventObject) object));

        //==============================================================================================================
        // Implementations
        //==============================================================================================================

        } else if (object instanceof jakarta.servlet.http.HttpFilter) {
            return T(new Facades.HttpFilter(T(object)));
        } else if (object instanceof jakarta.servlet.http.HttpServlet) {
            return T(new Facades.HttpServlet(T(object)));
        } else if (object instanceof jakarta.servlet.GenericFilter) {
            return T(new Facades.GenericFilter(T(object)));
        } else if (object instanceof jakarta.servlet.GenericServlet) {
            return T(new Facades.GenericServlet(T(object)));
        } else if (object instanceof jakarta.servlet.ServletInputStream) {
            return T(new Facades.ServletInputStream(T(object)));
        } else if (object instanceof jakarta.servlet.ServletOutputStream) {
            return T(new Facades.ServletOutputStream(T(object)));

        //==============================================================================================================
        // Wrappers
        //==============================================================================================================

        } else if (object instanceof jakarta.servlet.http.HttpServletRequestWrapper) {
            return T(new Facades.HttpServletRequestWrapper(T(object)));
        } else if (object instanceof jakarta.servlet.http.HttpServletResponseWrapper) {
            return T(new Facades.HttpServletResponseWrapper(T(object)));
        } else if (object instanceof jakarta.servlet.ServletRequestWrapper) {
            return T(new Facades.ServletRequestWrapper(T(object)));
        } else if (object instanceof jakarta.servlet.ServletResponseWrapper) {
            return T(new Facades.ServletResponseWrapper(T(object)));

        //==============================================================================================================
        // Core
        //==============================================================================================================

        } else if (object instanceof jakarta.servlet.AsyncContext) {
            return T(new Facades.AsyncContext(T(object)));
        } else if (object instanceof jakarta.servlet.AsyncEvent) {
            return T(new Facades.AsyncEvent(T(object)));
        } else if (object instanceof jakarta.servlet.Filter) {
            return T(new Facades.Filter(T(object)));
        } else if (object instanceof jakarta.servlet.FilterChain) {
            return T(new Facades.FilterChain(T(object)));
        } else if (object instanceof jakarta.servlet.FilterConfig) {
            return T(new Facades.FilterConfig(T(object)));
        } else if (object instanceof jakarta.servlet.FilterRegistration.Dynamic) {
            return T(new Facades.FilterRegistration$Dynamic(T(object)));
        } else if (object instanceof jakarta.servlet.FilterRegistration) {
            return T(new Facades.FilterRegistration(T(object)));
        } else if (object instanceof jakarta.servlet.http.HttpServletMapping) {
            return T(new Facades.HttpServletMapping(T(object)));
        } else if (object instanceof jakarta.servlet.http.HttpServletRequest) {
            return T(new Facades.HttpServletRequest(T(object)));
        } else if (object instanceof jakarta.servlet.http.HttpServletResponse) {
            return T(new Facades.HttpServletResponse(T(object)));
        } else if (object instanceof jakarta.servlet.http.HttpSession) {
            return T(new Facades.HttpSession(T(object)));
        } else if (object instanceof jakarta.servlet.http.HttpUpgradeHandler) {
            return T(new Facades.HttpUpgradeHandler(T(object)));
        } else if (object instanceof jakarta.servlet.http.Part) {
            return T(new Facades.Part(T(object)));
        } else if (object instanceof jakarta.servlet.http.PushBuilder) {
            return T(new Facades.PushBuilder(T(object)));
        } else if (object instanceof jakarta.servlet.RequestDispatcher) {
            return T(new Facades.RequestDispatcher(T(object)));
        } else if (object instanceof jakarta.servlet.Servlet) {
            return T(new Facades.Servlet(T(object)));
        } else if (object instanceof jakarta.servlet.ServletConfig) {
            return T(new Facades.ServletConfig(T(object)));
        } else if (object instanceof jakarta.servlet.ServletConnection) {
            return T(new Facades.ServletConnection(T(object)));
        } else if (object instanceof jakarta.servlet.ServletContainerInitializer) {
            return T(new Facades.ServletContainerInitializer(T(object)));
        } else if (object instanceof jakarta.servlet.ServletContext) {
            return T(new Facades.ServletContext(T(object)));
        } else if (object instanceof jakarta.servlet.ServletRegistration.Dynamic) {
            return T(new Facades.ServletRegistration$Dynamic(T(object)));
        } else if (object instanceof jakarta.servlet.ServletRegistration) {
            return T(new Facades.ServletRegistration(T(object)));
        } else if (object instanceof jakarta.servlet.ServletRequest) {
            return T(new Facades.ServletRequest(T(object)));
        } else if (object instanceof jakarta.servlet.ServletResponse) {
            return T(new Facades.ServletResponse(T(object)));
        } else if (object instanceof jakarta.servlet.SessionCookieConfig) {
            return T(new Facades.SessionCookieConfig(T(object)));
        } else if (object instanceof jakarta.servlet.http.WebConnection) {
            return T(new Facades.WebConnection(T(object)));
        } else if (object instanceof jakarta.servlet.Registration.Dynamic) {
            return T(new Facades.Registration$Dynamic(T(object)));
        } else if (object instanceof jakarta.servlet.Registration) {
            return T(new Facades.Registration(T(object)));

        //==============================================================================================================
        // Others
        //==============================================================================================================

        } else if (object instanceof jakarta.servlet.ServletSecurityElement) {
            return T(new Facades.ServletSecurityElement(T(object)));
        } else if (object instanceof jakarta.servlet.HttpMethodConstraintElement) {
            return T(new Facades.HttpMethodConstraintElement(T(object)));
        } else if (object instanceof jakarta.servlet.HttpConstraintElement) {
            return T(new Facades.HttpConstraintElement(T(object)));
        } else if (object instanceof jakarta.servlet.MultipartConfigElement) {
            return T(new Facades.MultipartConfigElement(T(object)));
        }

        throw new UnsupportedOperationException("Unknown type: " + object.getClass().getName());
    }

    @SafeVarargs
    static <T, S> S[] of(IntFunction<S[]> generator, T... objects) {
        return Stream
            .of(objects)
            .<S>map(ServletShim::of)
            .toArray(generator);
    }

    static <T extends jakarta.servlet.ServletException, S extends ServletException & ServletShim> S of(T exception) {
        if (exception instanceof ServletShim) {
            return T(exception);
        } else if (exception instanceof jakarta.servlet.UnavailableException) {
            return T(new Facades.UnavailableException(T(exception)));
        }

        return T(new Facades.ServletException(exception));
    }

    static <T extends Enum<T>, S extends Enum<S> & ServletShim> S of(T enumeration) {
        if (enumeration instanceof ServletShim) {
            return T(enumeration);
        } else if (enumeration instanceof jakarta.servlet.DispatcherType) {
            return T(DispatcherType.valueOf(enumeration.name()));
        } else if (enumeration instanceof jakarta.servlet.SessionTrackingMode) {
            return T(SessionTrackingMode.valueOf(enumeration.name()));
        } else if (enumeration instanceof jakarta.servlet.http.MappingMatch) {
            return T(MappingMatch.valueOf(enumeration.name()));
        } else if (enumeration instanceof jakarta.servlet.annotation.ServletSecurity.EmptyRoleSemantic) {
            return T(ServletSecurity.EmptyRoleSemantic.valueOf(enumeration.name()));
        } else if (enumeration instanceof jakarta.servlet.annotation.ServletSecurity.TransportGuarantee) {
            return T(ServletSecurity.TransportGuarantee.valueOf(enumeration.name()));
        }

        throw new UnsupportedOperationException("Unknown enumeration type: " + enumeration.getClass().getName());
    }

    static <T extends Annotation, S extends Annotation> S of(T annotation) {
        if (annotation instanceof jakarta.servlet.annotation.HandlesTypes) {
            return T(new Facades.HandlesTypes(T(annotation)));
        } else if (annotation instanceof jakarta.servlet.annotation.HttpConstraint) {
            return T(new Facades.HttpConstraint(T(annotation)));
        } else if (annotation instanceof jakarta.servlet.annotation.HttpMethodConstraint) {
            return T(new Facades.HttpMethodConstraint(T(annotation)));
        } else if (annotation instanceof jakarta.servlet.annotation.MultipartConfig) {
            return T(new Facades.MultipartConfig(T(annotation)));
        } else if (annotation instanceof jakarta.servlet.annotation.ServletSecurity) {
            return T(new Facades.ServletSecurity(T(annotation)));
        } else if (annotation instanceof jakarta.servlet.annotation.WebFilter) {
            return T(new Facades.WebFilter(T(annotation)));
        } else if (annotation instanceof jakarta.servlet.annotation.WebInitParam) {
            return T(new Facades.WebInitParam(T(annotation)));
        } else if (annotation instanceof jakarta.servlet.annotation.WebListener) {
            return T(new Facades.WebListener(T(annotation)));
        } else if (annotation instanceof jakarta.servlet.annotation.WebServlet) {
            return T(new Facades.WebServlet(T(annotation)));
        }

        throw new UnsupportedOperationException("Unknown annotation type: " + annotation.annotationType().getName());
    }

    static <T extends EventListener, S extends EventListener & ServletShim> S of(T listener) {
        if (listener instanceof ServletShim) {
            return T(listener);
        } else if (listener instanceof jakarta.servlet.AsyncListener) {
            return T(new Facades.AsyncListener(T(listener)));
        } else if (listener instanceof jakarta.servlet.http.HttpSessionActivationListener) {
            return T(new Facades.HttpSessionActivationListener(T(listener)));
        } else if (listener instanceof jakarta.servlet.http.HttpSessionAttributeListener) {
            return T(new Facades.HttpSessionAttributeListener(T(listener)));
        } else if (listener instanceof jakarta.servlet.http.HttpSessionBindingListener) {
            return T(new Facades.HttpSessionBindingListener(T(listener)));
        } else if (listener instanceof jakarta.servlet.http.HttpSessionIdListener) {
            return T(new Facades.HttpSessionIdListener(T(listener)));
        } else if (listener instanceof jakarta.servlet.http.HttpSessionListener) {
            return T(new Facades.HttpSessionListener(T(listener)));
        } else if (listener instanceof jakarta.servlet.ReadListener) {
            return T(new Facades.ReadListener(T(listener)));
        } else if (listener instanceof jakarta.servlet.ServletContextAttributeListener) {
            return T(new Facades.ServletContextAttributeListener(T(listener)));
        } else if (listener instanceof jakarta.servlet.ServletContextListener) {
            return T(new Facades.ServletContextListener(T(listener)));
        } else if (listener instanceof jakarta.servlet.ServletRequestAttributeListener) {
            return T(new Facades.ServletRequestAttributeListener(T(listener)));
        } else if (listener instanceof jakarta.servlet.ServletRequestListener) {
            return T(new Facades.ServletRequestListener(T(listener)));
        } else if (listener instanceof jakarta.servlet.WriteListener) {
            return T(new Facades.WriteListener(T(listener)));
        }

        throw new UnsupportedOperationException("Unknown event listener type: " + listener.getClass().getName());
    }

    static <T extends EventObject, S extends EventObject & ServletShim> S of(T event) {
        if (event instanceof ServletShim) {
            return T(event);
        } else if (event instanceof jakarta.servlet.http.HttpSessionBindingEvent) {
            return T(new Facades.HttpSessionBindingEvent(T(event)));
        } else if (event instanceof jakarta.servlet.http.HttpSessionEvent) {
            return T(new Facades.HttpSessionEvent(T(event)));
        } else if (event instanceof jakarta.servlet.ServletContextAttributeEvent) {
            return T(new Facades.ServletContextAttributeEvent(T(event)));
        } else if (event instanceof jakarta.servlet.ServletContextEvent) {
            return T(new Facades.ServletContextEvent(T(event)));
        } else if (event instanceof jakarta.servlet.ServletRequestAttributeEvent) {
            return T(new Facades.ServletRequestAttributeEvent(T(event)));
        } else if (event instanceof jakarta.servlet.ServletRequestEvent) {
            return T(new Facades.ServletRequestEvent(T(event)));
        }

        throw new UnsupportedOperationException("Unknown event type: " + event.getClass().getName());
    }

    //==================================================================================================================
    // Private Helper Methods
    //==================================================================================================================

    @SuppressWarnings("unchecked")
    private static <T> T T(Object object) {
        return (T) object;
    }
}
