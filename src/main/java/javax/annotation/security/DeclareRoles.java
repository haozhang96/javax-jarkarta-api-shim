package javax.annotation.security;

import java.lang.annotation.*;

/**
 * @deprecated Use {@link jakarta.annotation.security.DeclareRoles} instead.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Deprecated(since = "jakarta.annotation.security.DeclareRoles")
public @interface DeclareRoles {
    /**
     * @see jakarta.annotation.security.DeclareRoles#value()
     */
    String[] value();
}
