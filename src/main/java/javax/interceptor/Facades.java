package javax.interceptor;

import javax.Shim;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;

/**
 * This interface contains {@link jakarta.interceptor}-to-{@link javax.interceptor} facades used for wrapping Jakarta
 *   Interceptors objects into their Java Interceptors counterparts.
 *
 * @deprecated Use {@link jakarta.interceptor} instead.
 */
@Deprecated(since = "jakarta.interceptor")
@SuppressWarnings("all")
interface Facades {
    //==================================================================================================================
    // Annotations
    //==================================================================================================================

    final class AroundConstruct extends Shim.Delegate.Annotation<jakarta.interceptor.AroundConstruct> implements javax.interceptor.AroundConstruct, InterceptorShim {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        AroundConstruct(jakarta.interceptor.AroundConstruct delegate) {
            super(delegate);
        }
    }

    final class AroundInvoke extends Shim.Delegate.Annotation<jakarta.interceptor.AroundInvoke> implements javax.interceptor.AroundInvoke, InterceptorShim {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        AroundInvoke(jakarta.interceptor.AroundInvoke delegate) {
            super(delegate);
        }
    }

    final class AroundTimeout extends Shim.Delegate.Annotation<jakarta.interceptor.AroundTimeout> implements javax.interceptor.AroundTimeout, InterceptorShim {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        AroundTimeout(jakarta.interceptor.AroundTimeout delegate) {
            super(delegate);
        }
    }

    final class ExcludeClassInterceptors extends Shim.Delegate.Annotation<jakarta.interceptor.ExcludeClassInterceptors> implements javax.interceptor.ExcludeClassInterceptors, InterceptorShim {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        ExcludeClassInterceptors(jakarta.interceptor.ExcludeClassInterceptors delegate) {
            super(delegate);
        }
    }

    final class ExcludeDefaultInterceptors extends Shim.Delegate.Annotation<jakarta.interceptor.ExcludeDefaultInterceptors> implements javax.interceptor.ExcludeDefaultInterceptors, InterceptorShim {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        ExcludeDefaultInterceptors(jakarta.interceptor.ExcludeDefaultInterceptors delegate) {
            super(delegate);
        }
    }

    final class Interceptor extends Shim.Delegate.Annotation<jakarta.interceptor.Interceptor> implements javax.interceptor.Interceptor, InterceptorShim {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        Interceptor(jakarta.interceptor.Interceptor delegate) {
            super(delegate);
        }
    }

    final class InterceptorBinding extends Shim.Delegate.Annotation<jakarta.interceptor.InterceptorBinding> implements javax.interceptor.InterceptorBinding, InterceptorShim {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        InterceptorBinding(jakarta.interceptor.InterceptorBinding delegate) {
            super(delegate);
        }
    }

    final class Interceptors extends Shim.Delegate.Annotation<jakarta.interceptor.Interceptors> implements javax.interceptor.Interceptors, InterceptorShim {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        Interceptors(jakarta.interceptor.Interceptors delegate) {
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

    //==================================================================================================================
    // Classes
    //==================================================================================================================

    final class Interceptor$Priority extends javax.interceptor.Interceptor.Priority {
        private final jakarta.interceptor.Interceptor.Priority delegate;

        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        Interceptor$Priority(jakarta.interceptor.Interceptor.Priority delegate) {
            this.delegate = delegate;
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public boolean equals(Object other) {
            return delegate.equals(other);
        }

        @Override
        public int hashCode() {
            return delegate.hashCode();
        }

        @Override
        public String toString() {
            return delegate.toString();
        }
    }

    final class InvocationContext extends Shim.Delegate<jakarta.interceptor.InvocationContext> implements javax.interceptor.InvocationContext {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        InvocationContext(jakarta.interceptor.InvocationContext delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public Object getTarget() {
            return delegate.getTarget();
        }

        @Override
        public Object getTimer() {
            return delegate.getTimer();
        }

        @Override
        public Method getMethod() {
            return delegate.getMethod();
        }

        @Override
        public Constructor<?> getConstructor() {
            return delegate.getConstructor();
        }

        @Override
        public Object[] getParameters() {
            return delegate.getParameters();
        }

        @Override
        public void setParameters(Object[] parameters) {
            delegate.setParameters(parameters);
        }

        @Override
        public Map<String, Object> getContextData() {
            return delegate.getContextData();
        }

        @Override
        public Object proceed() throws Exception {
            return delegate.proceed();
        }
    }
}
