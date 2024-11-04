package javax.annotation;

import javax.Shim;

/**
 * This interface contains {@link jakarta.annotation}-to-{@link javax.annotation} facades used for wrapping Jakarta
 *   Annotations objects into their Java Annotations counterparts.
 *
 * @deprecated Use {@link jakarta.annotation} instead.
 */
@Deprecated(since = "jakarta.annotation")
@SuppressWarnings("all")
interface Facades {
    //==================================================================================================================
    // Annotations
    //==================================================================================================================

    final class DataSourceDefinition extends Shim.Delegate.Annotation<jakarta.annotation.sql.DataSourceDefinition> implements javax.annotation.sql.DataSourceDefinition, AnnotationShim {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        DataSourceDefinition(jakarta.annotation.sql.DataSourceDefinition delegate) {
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
        public String className() {
            return delegate.className();
        }

        @Override
        public String description() {
            return delegate.description();
        }

        @Override
        public String url() {
            return delegate.url();
        }

        @Override
        public String user() {
            return delegate.user();
        }

        @Override
        public String password() {
            return delegate.password();
        }

        @Override
        public String databaseName() {
            return delegate.databaseName();
        }

        @Override
        public int portNumber() {
            return delegate.portNumber();
        }

        @Override
        public String serverName() {
            return delegate.serverName();
        }

        @Override
        public int isolationLevel() {
            return delegate.isolationLevel();
        }

        @Override
        public boolean transactional() {
            return delegate.transactional();
        }

        @Override
        public int initialPoolSize() {
            return delegate.initialPoolSize();
        }

        @Override
        public int maxPoolSize() {
            return delegate.maxPoolSize();
        }

        @Override
        public int minPoolSize() {
            return delegate.minPoolSize();
        }

        @Override
        public int maxIdleTime() {
            return delegate.maxIdleTime();
        }

        @Override
        public int maxStatements() {
            return delegate.maxStatements();
        }

        @Override
        public String[] properties() {
            return delegate.properties();
        }

        @Override
        public int loginTimeout() {
            return delegate.loginTimeout();
        }
    }

    final class DataSourceDefinitions extends Shim.Delegate.Annotation<jakarta.annotation.sql.DataSourceDefinitions> implements javax.annotation.sql.DataSourceDefinitions, AnnotationShim {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        DataSourceDefinitions(jakarta.annotation.sql.DataSourceDefinitions delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public javax.annotation.sql.DataSourceDefinition[] value() {
            return AnnotationShim
                .<javax.annotation.sql.DataSourceDefinition>of(delegate.value())
                .toArray(javax.annotation.sql.DataSourceDefinition[]::new);
        }
    }

    final class DeclareRoles extends Shim.Delegate.Annotation<jakarta.annotation.security.DeclareRoles> implements javax.annotation.security.DeclareRoles, AnnotationShim {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        DeclareRoles(jakarta.annotation.security.DeclareRoles delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public String[] value() {
            return delegate.value();
        }
    }

    final class DenyAll extends Shim.Delegate.Annotation<jakarta.annotation.security.DenyAll> implements javax.annotation.security.DenyAll, AnnotationShim {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        DenyAll(jakarta.annotation.security.DenyAll delegate) {
            super(delegate);
        }
    }

    final class ManagedBean extends Shim.Delegate.Annotation<jakarta.annotation.ManagedBean> implements javax.annotation.ManagedBean, AnnotationShim {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        ManagedBean(jakarta.annotation.ManagedBean delegate) {
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

    final class PermitAll extends Shim.Delegate.Annotation<jakarta.annotation.security.PermitAll> implements javax.annotation.security.PermitAll, AnnotationShim {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        PermitAll(jakarta.annotation.security.PermitAll delegate) {
            super(delegate);
        }
    }

    final class PostConstruct extends Shim.Delegate.Annotation<jakarta.annotation.PostConstruct> implements javax.annotation.PostConstruct, AnnotationShim {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        PostConstruct(jakarta.annotation.PostConstruct delegate) {
            super(delegate);
        }
    }

    final class PreDestroy extends Shim.Delegate.Annotation<jakarta.annotation.PreDestroy> implements javax.annotation.PreDestroy, AnnotationShim {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        PreDestroy(jakarta.annotation.PreDestroy delegate) {
            super(delegate);
        }
    }

    final class Priority extends Shim.Delegate.Annotation<jakarta.annotation.Priority> implements javax.annotation.Priority, AnnotationShim {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        Priority(jakarta.annotation.Priority delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public int value() {
            return delegate.value();
        }
    }

    final class Resource extends Shim.Delegate.Annotation<jakarta.annotation.Resource> implements javax.annotation.Resource, AnnotationShim {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        Resource(jakarta.annotation.Resource delegate) {
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
        public String lookup() {
            return delegate.lookup();
        }

        @Override
        public Class<?> type() {
            return delegate.type();
        }

        @Override
        public AuthenticationType authenticationType() {
            return AnnotationShim.of(delegate.authenticationType());
        }

        @Override
        public boolean shareable() {
            return delegate.shareable();
        }

        @Override
        public String mappedName() {
            return delegate.mappedName();
        }

        @Override
        public String description() {
            return delegate.description();
        }
    }

    final class Resources extends Shim.Delegate.Annotation<jakarta.annotation.Resources> implements javax.annotation.Resources, AnnotationShim {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        Resources(jakarta.annotation.Resources delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public javax.annotation.Resource[] value() {
            return AnnotationShim
                .<javax.annotation.Resource>of(delegate.value())
                .toArray(javax.annotation.Resource[]::new);
        }
    }

    final class RolesAllowed extends Shim.Delegate.Annotation<jakarta.annotation.security.RolesAllowed> implements javax.annotation.security.RolesAllowed, AnnotationShim {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        RolesAllowed(jakarta.annotation.security.RolesAllowed delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public String[] value() {
            return delegate.value();
        }
    }

    final class RunAs extends Shim.Delegate.Annotation<jakarta.annotation.security.RunAs> implements javax.annotation.security.RunAs, AnnotationShim {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        RunAs(jakarta.annotation.security.RunAs delegate) {
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
}
