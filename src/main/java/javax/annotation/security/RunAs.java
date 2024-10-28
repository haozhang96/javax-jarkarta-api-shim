package javax.annotation.security;

import java.lang.annotation.*;

/**
 * @deprecated Use {@link jakarta.annotation.security.RunAs} instead.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Deprecated(since = "jakarta.annotation.security.RunAs")
public @interface RunAs {
    /**
     * @see jakarta.annotation.security.RunAs#value()
     */
    String value();
}
