package javax.interceptor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @deprecated Use {@link jakarta.interceptor.AroundConstruct} instead.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Deprecated(since = "jakarta.interceptor.AroundConstruct")
public @interface AroundConstruct { }
