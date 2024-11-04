package javax.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @deprecated Use {@link jakarta.annotation.Nonnull} instead.
 */
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Deprecated(since = "jakarta.annotation.Nonnull")
public @interface Nonnull { }
