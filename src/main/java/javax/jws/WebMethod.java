package javax.jws;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @deprecated Use {@link jakarta.jws.WebMethod} instead.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Deprecated(since = "jakarta.jws.WebMethod")
public @interface WebMethod {
    /**
     * @see jakarta.jws.WebMethod#operationName()
     */
    String operationName() default "";

    /**
     * @see jakarta.jws.WebMethod#action()
     */
    String action() default "";

    /**
     * @see jakarta.jws.WebMethod#exclude()
     */
    boolean exclude() default false;
}
