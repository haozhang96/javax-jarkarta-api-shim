package javax.annotation.security;

import java.lang.annotation.*;

/**
 * @deprecated Use {@link jakarta.annotation.security.RolesAllowed} instead.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Deprecated(since = "jakarta.annotation.security.RolesAllowed")
public @interface RolesAllowed {
    /**
     * @see jakarta.annotation.security.RolesAllowed#value()
     */
    String[] value();
}
