package javax.jws;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @deprecated Use {@link jakarta.jws.WebService} instead.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Deprecated(since = "jakarta.jws.WebService")
public @interface WebService {
    /**
     * @see jakarta.jws.WebService#name()
     */
    String name() default "";

    /**
     * @see jakarta.jws.WebService#targetNamespace()
     */
    String targetNamespace() default "";

    /**
     * @see jakarta.jws.WebService#serviceName()
     */
    String serviceName() default "";

    /**
     * @see jakarta.jws.WebService#portName()
     */
    String portName() default "";

    /**
     * @see jakarta.jws.WebService#wsdlLocation()
     */
    String wsdlLocation() default "";

    /**
     * @see jakarta.jws.WebService#endpointInterface()
     */
    String endpointInterface() default "";
}
