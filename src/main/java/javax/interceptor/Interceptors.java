package javax.interceptor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @deprecated Use {@link jakarta.interceptor.Interceptors} instead.
 */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
@Deprecated(since = "jakarta.interceptor.Interceptors")
public @interface Interceptors {
    /**
     * @see jakarta.interceptor.Interceptors#value()
     */
    Class<?>[] value();
}
