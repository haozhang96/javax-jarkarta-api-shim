package javax.annotation;

import java.lang.annotation.*;

/**
 * @deprecated Use {@link jakarta.annotation.PreDestroy} instead.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Deprecated(since = "jakarta.annotation.PreDestroy")
public @interface PreDestroy { }
