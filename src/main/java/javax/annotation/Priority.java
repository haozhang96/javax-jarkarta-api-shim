package javax.annotation;

import java.lang.annotation.*;

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
