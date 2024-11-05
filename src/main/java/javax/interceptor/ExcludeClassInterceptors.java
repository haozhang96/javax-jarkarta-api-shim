package javax.interceptor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @deprecated Use {@link jakarta.interceptor.ExcludeClassInterceptors} instead.
 */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
@Deprecated(since = "jakarta.interceptor.ExcludeClassInterceptors")
public @interface ExcludeClassInterceptors { }
