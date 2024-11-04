package javax.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @deprecated Use {@link jakarta.annotation.Priority} instead.
 */
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Deprecated(since = "jakarta.annotation.Priority")
public @interface Priority {
    /**
     * @see jakarta.annotation.Priority#value()
     */
    int value();
}
