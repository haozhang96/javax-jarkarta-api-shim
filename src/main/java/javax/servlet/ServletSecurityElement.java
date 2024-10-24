package javax.servlet;

import javax.servlet.annotation.ServletSecurity;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @deprecated Use {@link jakarta.servlet.ServletSecurityElement} instead.
 */
@Deprecated(since = "jakarta.servlet.ServletSecurityElement")
public class ServletSecurityElement extends HttpConstraintElement {
    private final Collection<String> methodNames;
    private final Collection<HttpMethodConstraintElement> methodConstraints;

    //==================================================================================================================
    // Constructors
    //==================================================================================================================

    /**
     * @see jakarta.servlet.ServletSecurityElement#ServletSecurityElement()
     */
    public ServletSecurityElement() {
        this(Collections.emptySet());
    }

    /**
     * @see jakarta.servlet.ServletSecurityElement#ServletSecurityElement(jakarta.servlet.HttpConstraintElement)
     */
    public ServletSecurityElement(HttpConstraintElement constraint) {
        this(constraint, Collections.emptySet());
    }

    ServletSecurityElement(jakarta.servlet.HttpConstraintElement constraint) {
        super(constraint.getEmptyRoleSemantic(), constraint.getTransportGuarantee(), constraint.getRolesAllowed());
        methodConstraints = Set.of();
        methodNames = Set.of();
    }

    /**
     * @see jakarta.servlet.ServletSecurityElement#ServletSecurityElement(Collection)
     */
    public ServletSecurityElement(Collection<HttpMethodConstraintElement> methodConstraints) {
        this(new HttpConstraintElement(), methodConstraints);
    }

    /**
     * @see jakarta.servlet.ServletSecurityElement#ServletSecurityElement(jakarta.servlet.HttpConstraintElement, Collection)
     */
    public ServletSecurityElement(
        HttpConstraintElement constraint,
        Collection<HttpMethodConstraintElement> methodConstraints
    ) {
        super(constraint.getEmptyRoleSemantic(), constraint.getTransportGuarantee(), constraint.getRolesAllowed());

        this.methodConstraints = Collections.unmodifiableCollection(methodConstraints);
        methodNames =
            Objects
                .<Collection<HttpMethodConstraintElement>>requireNonNullElseGet(methodConstraints, Set::of)
                .stream()
                .map(HttpMethodConstraintElement::getMethodName)
                .map(ServletSecurityElement::validateMethodName)
                .collect(Collectors.toUnmodifiableSet());
    }

    /**
     * @see jakarta.servlet.ServletSecurityElement#ServletSecurityElement(jakarta.servlet.annotation.ServletSecurity)
     */
    public ServletSecurityElement(ServletSecurity annotation) {
        this(
            new HttpConstraintElement(annotation.value()),
            Stream
                .of(annotation.httpMethodConstraints())
                .map(HttpMethodConstraintElement::new)
                .collect(Collectors.toSet())
        );
    }

    ServletSecurityElement(jakarta.servlet.annotation.ServletSecurity annotation) {
        this(
            new HttpConstraintElement(annotation.value()),
            Stream
                .of(annotation.httpMethodConstraints())
                .map(HttpMethodConstraintElement::new)
                .collect(Collectors.toSet())
        );
    }

    //==================================================================================================================
    // Accessor Methods
    //==================================================================================================================

    /**
     * @see jakarta.servlet.ServletSecurityElement#getMethodNames()
     */
    public Collection<String> getMethodNames() {
        return methodNames;
    }

    /**
     * @see jakarta.servlet.ServletSecurityElement#getHttpMethodConstraints()
     */
    public Collection<HttpMethodConstraintElement> getHttpMethodConstraints() {
        return methodConstraints;
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
