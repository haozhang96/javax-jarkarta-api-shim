package javax.servlet;

import javax.servlet.annotation.HttpMethodConstraint;

/**
 * @deprecated Use {@link jakarta.servlet.HttpMethodConstraintElement} instead.
 */
@Deprecated(since = "jakarta.servlet.HttpMethodConstraintElement")
public class HttpMethodConstraintElement extends HttpConstraintElement {
    private final String methodName;

    //==================================================================================================================
    // Constructors
    //==================================================================================================================

    /**
     * @see jakarta.servlet.HttpMethodConstraintElement#HttpMethodConstraintElement(String)
     */
    public HttpMethodConstraintElement(String methodName) {
        this(methodName, new HttpConstraintElement());
    }

    /**
     * @see jakarta.servlet.HttpMethodConstraintElement#HttpMethodConstraintElement(String, jakarta.servlet.HttpConstraintElement)
     */
    public HttpMethodConstraintElement(String methodName, HttpConstraintElement constraint) {
        super(constraint.getEmptyRoleSemantic(), constraint.getTransportGuarantee(), constraint.getRolesAllowed());
        this.methodName = validateMethodName(methodName);
    }

    HttpMethodConstraintElement(HttpMethodConstraint annotation) {
        this(
            annotation.value(),
            new HttpConstraintElement(annotation.emptyRoleSemantic(), annotation.transportGuarantee(), annotation.rolesAllowed())
        );
    }

    HttpMethodConstraintElement(jakarta.servlet.annotation.HttpMethodConstraint annotation) {
        this(
            annotation.value(),
            new HttpConstraintElement(annotation.emptyRoleSemantic(), annotation.transportGuarantee(), annotation.rolesAllowed())
        );
    }

    //==================================================================================================================
    // Accessor Methods
    //==================================================================================================================

    /**
     * @see jakarta.servlet.HttpMethodConstraintElement#getMethodName()
     */
    public String getMethodName() {
        return methodName;
    }

    //==================================================================================================================
    // Private Helper Methods
    //==================================================================================================================

    private static String validateMethodName(String methodName) {
        if (methodName == null || methodName.isEmpty()) {
            throw new IllegalArgumentException("invalid HTTP method name");
        }

        return methodName;
    }
}
