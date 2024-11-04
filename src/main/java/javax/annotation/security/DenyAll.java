package javax.annotation.security;

import java.lang.annotation.*;

/**
 * @deprecated Use {@link jakarta.annotation.security.DenyAll} instead.
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Deprecated(since = "jakarta.annotation.security.DenyAll")
public @interface DenyAll { }
