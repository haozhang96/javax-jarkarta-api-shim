package javax.servlet.annotation;

import java.lang.annotation.*;

/**
 * @deprecated Use {@link jakarta.servlet.annotation.WebListener} instead.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Deprecated(since = "jakarta.servlet.annotation.WebListener")
public @interface WebListener {
    /**
     * @see jakarta.servlet.annotation.WebListener#value()
     */
    String value() default "";
}
