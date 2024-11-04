package javax.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @deprecated Use {@link jakarta.annotation.ManagedBean} instead.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Deprecated(since = "jakarta.annotation.ManagedBean")
public @interface ManagedBean {
    /**
     * @see jakarta.annotation.ManagedBean#value()
     */
    String value() default "";
}
