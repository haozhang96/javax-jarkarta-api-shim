package javax.servlet.annotation;

import java.lang.annotation.*;

/**
 * @deprecated Use {@link jakarta.servlet.annotation.WebInitParam} instead.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Deprecated(since = "jakarta.servlet.annotation.WebInitParam")
public @interface WebInitParam {
    /**
     * @see jakarta.servlet.annotation.WebInitParam#name()
     */
    String name();

    /**
     * @see jakarta.servlet.annotation.WebInitParam#value()
     */
    String value();

    /**
     * @see jakarta.servlet.annotation.WebInitParam#description()
     */
    String description() default "";
}
