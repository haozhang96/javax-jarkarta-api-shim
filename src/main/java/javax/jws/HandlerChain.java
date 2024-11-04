package javax.jws;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @deprecated Use {@link jakarta.jws.HandlerChain} instead.
 */
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Deprecated(since = "jakarta.jws.HandlerChain")
public @interface HandlerChain {
    /**
     * @see jakarta.jws.HandlerChain#file()
     */
    String file();

    /**
     * @see jakarta.jws.HandlerChain#name()
     */
    String name() default "";
}
