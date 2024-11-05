package javax.interceptor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @deprecated Use {@link jakarta.interceptor.Interceptor} instead.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Deprecated(since = "jakarta.interceptor.Interceptor")
public @interface Interceptor {
    /**
     * @deprecated Use {@link jakarta.interceptor.Interceptor.Priority} instead.
     */
    @Deprecated(since = "jakarta.interceptor.Interceptor.Priority")
    class Priority implements InterceptorShim {
        /**
         * @see jakarta.interceptor.Interceptor.Priority#PLATFORM_BEFORE
         */
        public static final int PLATFORM_BEFORE = jakarta.interceptor.Interceptor.Priority.PLATFORM_BEFORE;

        /**
         * @see jakarta.interceptor.Interceptor.Priority#LIBRARY_BEFORE
         */
        public static final int LIBRARY_BEFORE = jakarta.interceptor.Interceptor.Priority.LIBRARY_BEFORE;

        /**
         * @see jakarta.interceptor.Interceptor.Priority#APPLICATION
         */
        public static final int APPLICATION = jakarta.interceptor.Interceptor.Priority.APPLICATION;

        /**
         * @see jakarta.interceptor.Interceptor.Priority#LIBRARY_AFTER
         */
        public static final int LIBRARY_AFTER = jakarta.interceptor.Interceptor.Priority.LIBRARY_AFTER;

        /**
         * @see jakarta.interceptor.Interceptor.Priority#PLATFORM_AFTER
         */
        public static final int PLATFORM_AFTER = jakarta.interceptor.Interceptor.Priority.PLATFORM_AFTER;

        Priority() { }
    }
}
