package javax.servlet;

import javax.servlet.annotation.ServletSecurity;
import javax.servlet.http.MappingMatch;
import javax.shim.Shim;
import java.util.function.IntFunction;
import java.util.stream.Stream;

/**
 * @deprecated Use {@link jakarta.servlet} instead.
 */
@Deprecated(since = "jakarta.servlet")
@SuppressWarnings("unchecked")
public interface ServletShim extends Shim {
    //==================================================================================================================
    // Factory Methods
    //==================================================================================================================

    @SuppressWarnings("rawtypes")
    static <T, S extends ServletShim> S of(T object) {
        if (object instanceof ServletShim) {
            return (S) object;
        } else if (object instanceof jakarta.servlet.ServletException) {
            return (S) of((jakarta.servlet.ServletException) object);
        } else if (object instanceof java.lang.Enum<?>) {
            return (S) of((java.lang.Enum) object);
        } else if (object instanceof java.lang.annotation.Annotation) {
            return of((java.lang.annotation.Annotation) object);
        } else if (object instanceof jakarta.servlet.ServletConfig) {
            return (S) new Facades.ServletConfig((jakarta.servlet.ServletConfig) object);
        } else if (object instanceof jakarta.servlet.ServletContext) {
            return (S) new Facades.ServletContext((jakarta.servlet.ServletContext) object);
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
            return (S) exception;
        } else if (exception.getClass() == jakarta.servlet.UnavailableException.class) {
            return (S) new UnavailableException((jakarta.servlet.UnavailableException) exception);
        } else if (exception.getClass() == jakarta.servlet.ServletException.class) {
            return (S) new ServletException(exception);
        }

        throw new UnsupportedOperationException("Unknown exception type: " + exception.getClass().getName());
    }

    static <T extends java.lang.Enum<T>, S extends java.lang.Enum<S> & ServletShim> S of(T enumeration) {
        if (enumeration instanceof ServletShim) {
            return (S) enumeration;
        } else if (enumeration instanceof jakarta.servlet.DispatcherType) {
            return (S) DispatcherType.valueOf(enumeration.name());
        } else if (enumeration instanceof jakarta.servlet.SessionTrackingMode) {
            return (S) SessionTrackingMode.valueOf(enumeration.name());
        } else if (enumeration instanceof jakarta.servlet.http.MappingMatch) {
            return (S) MappingMatch.valueOf(enumeration.name());
        } else if (enumeration instanceof jakarta.servlet.annotation.ServletSecurity.EmptyRoleSemantic) {
            return (S) ServletSecurity.EmptyRoleSemantic.valueOf(enumeration.name());
        } else if (enumeration instanceof jakarta.servlet.annotation.ServletSecurity.TransportGuarantee) {
            return (S) ServletSecurity.TransportGuarantee.valueOf(enumeration.name());
        }

        throw new UnsupportedOperationException("Unknown enumeration type: " + enumeration.getClass().getName());
    }

    static <T extends java.lang.annotation.Annotation, S extends java.lang.annotation.Annotation> S of(T annotation) {
        if (annotation instanceof jakarta.servlet.annotation.HandlesTypes) {
            return (S) new Facades.HandlesTypes((jakarta.servlet.annotation.HandlesTypes) annotation);
        } else if (annotation instanceof jakarta.servlet.annotation.HttpConstraint) {
            return (S) new Facades.HttpConstraint((jakarta.servlet.annotation.HttpConstraint) annotation);
        } else if (annotation instanceof jakarta.servlet.annotation.HttpMethodConstraint) {
            return (S) new Facades.HttpMethodConstraint((jakarta.servlet.annotation.HttpMethodConstraint) annotation);
        } else if (annotation instanceof jakarta.servlet.annotation.MultipartConfig) {
            return (S) new Facades.MultipartConfig((jakarta.servlet.annotation.MultipartConfig) annotation);
        } else if (annotation instanceof jakarta.servlet.annotation.ServletSecurity) {
            return (S) new Facades.ServletSecurity((jakarta.servlet.annotation.ServletSecurity) annotation);
        } else if (annotation instanceof jakarta.servlet.annotation.WebFilter) {
            return (S) new Facades.WebFilter((jakarta.servlet.annotation.WebFilter) annotation);
        } else if (annotation instanceof jakarta.servlet.annotation.WebInitParam) {
            return (S) new Facades.WebInitParam((jakarta.servlet.annotation.WebInitParam) annotation);
        } else if (annotation instanceof jakarta.servlet.annotation.WebListener) {
            return (S) new Facades.WebListener((jakarta.servlet.annotation.WebListener) annotation);
        } else if (annotation instanceof jakarta.servlet.annotation.WebServlet) {
            return (S) new Facades.WebServlet((jakarta.servlet.annotation.WebServlet) annotation);
        }

        throw new UnsupportedOperationException("Unknown annotation type: " + annotation.annotationType().getName());
    }
}
