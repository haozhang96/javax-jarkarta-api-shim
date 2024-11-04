package javax.jws;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @deprecated Use {@link jakarta.jws.WebResult} instead.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Deprecated(since = "jakarta.jws.WebResult")
public @interface WebResult {
    /**
     * @see jakarta.jws.WebResult#name()
     */
    String name() default "";

    /**
     * @see jakarta.jws.WebResult#partName()
     */
    String partName() default "";

    /**
     * @see jakarta.jws.WebResult#targetNamespace()
     */
    String targetNamespace() default "";

    /**
     * @see jakarta.jws.WebResult#header()
     */
    boolean header() default false;
}
