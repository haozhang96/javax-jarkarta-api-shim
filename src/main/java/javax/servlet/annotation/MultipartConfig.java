package javax.servlet.annotation;

import java.lang.annotation.*;

/**
 * @deprecated Use {@link jakarta.servlet.annotation.MultipartConfig} instead.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Deprecated(since = "jakarta.servlet.annotation.MultipartConfig")
public @interface MultipartConfig {
    /**
     * @see jakarta.servlet.annotation.MultipartConfig#location()
     */
    String location() default "";

    /**
     * @see jakarta.servlet.annotation.MultipartConfig#maxFileSize()
     */
    long maxFileSize() default -1L;

    /**
     * @see jakarta.servlet.annotation.MultipartConfig#maxRequestSize()
     */
    long maxRequestSize() default -1L;

    /**
     * @see jakarta.servlet.annotation.MultipartConfig#fileSizeThreshold()
     */
    int fileSizeThreshold() default 0;
}
