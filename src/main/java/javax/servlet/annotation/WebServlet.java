package javax.servlet.annotation;

import java.lang.annotation.*;

/**
 * @deprecated Use {@link jakarta.servlet.annotation.WebServlet} instead.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Deprecated(since = "jakarta.servlet.annotation.WebServlet")
public @interface WebServlet {
    /**
     * @see jakarta.servlet.annotation.WebServlet#name()
     */
    String name() default "";

    /**
     * @see jakarta.servlet.annotation.WebServlet#value()
     */
    String[] value() default {};

    /**
     * @see jakarta.servlet.annotation.WebServlet#urlPatterns()
     */
    String[] urlPatterns() default {};

    /**
     * @see jakarta.servlet.annotation.WebServlet#loadOnStartup()
     */
    int loadOnStartup() default -1;

    /**
     * @see jakarta.servlet.annotation.WebServlet#initParams()
     */
    WebInitParam[] initParams() default {};

    /**
     * @see jakarta.servlet.annotation.WebServlet#asyncSupported()
     */
    boolean asyncSupported() default false;

    /**
     * @see jakarta.servlet.annotation.WebServlet#smallIcon()
     */
    String smallIcon() default "";

    /**
     * @see jakarta.servlet.annotation.WebServlet#largeIcon()
     */
    String largeIcon() default "";

    /**
     * @see jakarta.servlet.annotation.WebServlet#description()
     */
    String description() default "";

    /**
     * @see jakarta.servlet.annotation.WebServlet#displayName()
     */
    String displayName() default "";
}
