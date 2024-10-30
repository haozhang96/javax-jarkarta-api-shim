package javax.annotation;

import java.lang.annotation.*;

/**
 * @deprecated Use {@link jakarta.annotation.PostConstruct} instead.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Deprecated(since = "jakarta.annotation.PostConstruct")
public @interface PostConstruct { }
