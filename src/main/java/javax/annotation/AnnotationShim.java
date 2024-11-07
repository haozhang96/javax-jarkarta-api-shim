package javax.annotation;

import javax.Shim;
import java.util.stream.Stream;

/**
 * @deprecated Use {@link jakarta.annotation} instead.
 */
@Deprecated(since = "jakarta.annotation")
public interface AnnotationShim extends Shim {
    //==================================================================================================================
    // Factory Methods
    //==================================================================================================================

    static <S> S of(Object object) {
        if (object == null || object instanceof AnnotationShim) {
            return S(object);
        } else if (object instanceof jakarta.annotation.sql.DataSourceDefinition) {
            return S(new Facades.DataSourceDefinition(S(object)));
        } else if (object instanceof jakarta.annotation.sql.DataSourceDefinitions) {
            return S(new Facades.DataSourceDefinitions(S(object)));
        } else if (object instanceof jakarta.annotation.security.DeclareRoles) {
            return S(new Facades.DeclareRoles(S(object)));
        } else if (object instanceof jakarta.annotation.security.DenyAll) {
            return S(new Facades.DenyAll(S(object)));
        } else if (object instanceof jakarta.annotation.ManagedBean) {
            return S(new Facades.ManagedBean(S(object)));
        } else if (object instanceof jakarta.annotation.security.PermitAll) {
            return S(new Facades.PermitAll(S(object)));
        } else if (object instanceof jakarta.annotation.PostConstruct) {
            return S(new Facades.PostConstruct(S(object)));
        } else if (object instanceof jakarta.annotation.PreDestroy) {
            return S(new Facades.PreDestroy(S(object)));
        } else if (object instanceof jakarta.annotation.Priority) {
            return S(new Facades.Priority(S(object)));
        } else if (object instanceof jakarta.annotation.Resource) {
            return S(new Facades.Resource(S(object)));
        } else if (object instanceof jakarta.annotation.Resource.AuthenticationType) {
            return S(Resource.AuthenticationType.valueOf(object.toString()));
        } else if (object instanceof jakarta.annotation.Resources) {
            return S(new Facades.Resources(S(object)));
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

    @SuppressWarnings("unchecked")
    private static <S> S S(Object object) {
        return (S) object;
    }
}
