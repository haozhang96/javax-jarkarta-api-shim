package javax.annotation;

import java.lang.annotation.*;

/**
 * @deprecated Use {@link jakarta.annotation.Resources} instead.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Deprecated(since = "jakarta.annotation.Resources")
public @interface Resources {
    /**
     * @see jakarta.annotation.Resources#value()
     */
    Resource[] value();
}
