package javax.servlet.annotation;

import javax.servlet.DispatcherType;
import java.lang.annotation.*;

/**
 * @deprecated Use {@link jakarta.servlet.annotation.WebFilter} instead.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Deprecated(since = "jakarta.servlet.annotation.WebFilter")
public @interface WebFilter {
    /**
     * @see jakarta.servlet.annotation.WebFilter#description()
     */
    String description() default "";

    /**
     * @see jakarta.servlet.annotation.WebFilter#displayName()
     */
    String displayName() default "";

    /**
     * @see jakarta.servlet.annotation.WebFilter#initParams()
     */
    WebInitParam[] initParams() default {};

    /**
     * @see jakarta.servlet.annotation.WebFilter#filterName()
     */
    String filterName() default "";

    /**
     * @see jakarta.servlet.annotation.WebFilter#smallIcon()
     */
    String smallIcon() default "";

    /**
     * @see jakarta.servlet.annotation.WebFilter#largeIcon()
     */
    String largeIcon() default "";

    /**
     * @see jakarta.servlet.annotation.WebFilter#servletNames()
     */
    String[] servletNames() default {};

    /**
     * @see jakarta.servlet.annotation.WebFilter#value()
     */
    String[] value() default {};

    /**
     * @see jakarta.servlet.annotation.WebFilter#urlPatterns()
     */
    String[] urlPatterns() default {};

    /**
     * @see jakarta.servlet.annotation.WebFilter#dispatcherTypes()
     */
    DispatcherType[] dispatcherTypes() default DispatcherType.REQUEST;

    /**
     * @see jakarta.servlet.annotation.WebFilter#asyncSupported()
     */
    boolean asyncSupported() default false;
}
