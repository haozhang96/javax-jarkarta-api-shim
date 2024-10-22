package javax.servlet.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @deprecated Use {@link jakarta.servlet.annotation.HttpMethodConstraint} instead.
 */
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Deprecated(since = "jakarta.servlet.annotation.HttpMethodConstraint")
public @interface HttpMethodConstraint {
    /**
     * @see jakarta.servlet.annotation.HttpMethodConstraint#value()
     */
    String value();

    /**
     * @see jakarta.servlet.annotation.HttpMethodConstraint#value()
     */
    ServletSecurity.EmptyRoleSemantic emptyRoleSemantic() default ServletSecurity.EmptyRoleSemantic.PERMIT;

    /**
     * @see jakarta.servlet.annotation.HttpMethodConstraint#transportGuarantee()
     */
    ServletSecurity.TransportGuarantee transportGuarantee() default ServletSecurity.TransportGuarantee.NONE;

    /**
     * @see jakarta.servlet.annotation.HttpMethodConstraint#rolesAllowed()
     */
    String[] rolesAllowed() default {};
}
