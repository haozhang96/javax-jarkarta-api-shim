package javax.servlet.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @deprecated Use {@link jakarta.servlet.annotation.HandlesTypes} instead.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Deprecated(since = "jakarta.servlet.annotation.HandlesTypes")
public @interface HandlesTypes {
    /**
     * @see jakarta.servlet.annotation.HandlesTypes#value()
     */
    Class<?>[] value();
}
