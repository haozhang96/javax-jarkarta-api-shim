package javax.servlet.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @deprecated Use {@link jakarta.servlet.annotation.HttpConstraint} instead.
 */
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Deprecated(since = "jakarta.servlet.annotation.HttpConstraint")
public @interface HttpConstraint {
    /**
     * @see jakarta.servlet.annotation.HttpConstraint#value()
     */
    ServletSecurity.EmptyRoleSemantic value() default ServletSecurity.EmptyRoleSemantic.PERMIT;

    /**
     * @see jakarta.servlet.annotation.HttpConstraint#transportGuarantee()
     */
    ServletSecurity.TransportGuarantee transportGuarantee() default ServletSecurity.TransportGuarantee.NONE;

    /**
     * @see jakarta.servlet.annotation.HttpConstraint#rolesAllowed()
     */
    String[] rolesAllowed() default {};
}
