package javax.annotation;

import javax.Shim;
import java.lang.annotation.Annotation;
import java.util.stream.Stream;

/**
 * @deprecated Use {@link jakarta.annotation} instead.
 */
@Deprecated(since = "jakarta.annotation")
public interface AnnotationShim extends Shim {
    //==================================================================================================================
    // Factory Methods
    //==================================================================================================================

    @SuppressWarnings("rawtypes")
    static <S> S of(Object object) {
        //==============================================================================================================
        // Specializations
        //==============================================================================================================

        if (object == null || object instanceof AnnotationShim) {
            return S(object);
        } else if (object instanceof Enum<?>) {
            return S(of((Enum) object));
        } else if (object instanceof Annotation) {
            return S(of((Annotation) object));
        }

        throw new UnsupportedOperationException("Unknown type: " + object.getClass().getName());
    }

    static <S> Class<? extends S> of(Class<S> shimType, Class<?> interfaceType) {
        return Shim.of(shimType, interfaceType);
    }

    static <S> Stream<S> of(Object[] objects) {
        return Shim.of(AnnotationShim::of, objects);
    }

    static <S> Stream<S> of(Iterable<?> objects) {
        return Shim.of(AnnotationShim::of, objects);
    }

    //==================================================================================================================
    // Private Helper Methods
    //==================================================================================================================

    private static <S extends Enum<S>> S of(Enum<?> enumeration) {
        if (enumeration == null || enumeration instanceof AnnotationShim) {
            return S(enumeration);
        } else if (enumeration instanceof jakarta.annotation.Resource.AuthenticationType) {
            return S(Resource.AuthenticationType.valueOf(enumeration.name()));
        }

        throw new UnsupportedOperationException("Unknown enumeration type: " + enumeration.getClass().getName());
    }

    private static <S extends Annotation> S of(Annotation annotation) {
        if (annotation == null || annotation instanceof AnnotationShim) {
            return S(annotation);
        } else if (annotation instanceof jakarta.annotation.sql.DataSourceDefinition) {
            return S(new Facades.DataSourceDefinition(S(annotation)));
        } else if (annotation instanceof jakarta.annotation.sql.DataSourceDefinitions) {
            return S(new Facades.DataSourceDefinitions(S(annotation)));
        } else if (annotation instanceof jakarta.annotation.security.DeclareRoles) {
            return S(new Facades.DeclareRoles(S(annotation)));
        } else if (annotation instanceof jakarta.annotation.security.DenyAll) {
            return S(new Facades.DenyAll(S(annotation)));
        } else if (annotation instanceof jakarta.annotation.ManagedBean) {
            return S(new Facades.ManagedBean(S(annotation)));
        } else if (annotation instanceof jakarta.annotation.security.PermitAll) {
            return S(new Facades.PermitAll(S(annotation)));
        } else if (annotation instanceof jakarta.annotation.PostConstruct) {
            return S(new Facades.PostConstruct(S(annotation)));
        } else if (annotation instanceof jakarta.annotation.PreDestroy) {
            return S(new Facades.PreDestroy(S(annotation)));
        } else if (annotation instanceof jakarta.annotation.Priority) {
            return S(new Facades.Priority(S(annotation)));
        } else if (annotation instanceof jakarta.annotation.Resource) {
            return S(new Facades.Resource(S(annotation)));
        } else if (annotation instanceof jakarta.annotation.Resources) {
            return S(new Facades.Resources(S(annotation)));
        }

        throw new UnsupportedOperationException("Unknown annotation type: " + annotation.annotationType().getName());
    }

    @SuppressWarnings("unchecked")
    private static <S> S S(Object object) {
        return (S) object;
    }
}
