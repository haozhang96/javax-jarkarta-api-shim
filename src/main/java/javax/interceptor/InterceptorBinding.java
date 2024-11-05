package javax.interceptor;

import java.lang.annotation.*;

/**
 * @deprecated Use {@link jakarta.interceptor.InterceptorBinding} instead.
 */
@Target(ElementType.ANNOTATION_TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Deprecated(since = "jakarta.interceptor.InterceptorBinding")
public @interface InterceptorBinding { }
