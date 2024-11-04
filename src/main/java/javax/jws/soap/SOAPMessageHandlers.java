package javax.jws.soap;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @deprecated Use {@link jakarta.jws.soap.SOAPMessageHandlers} instead.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Deprecated(since = "jakarta.jws.soap.SOAPMessageHandlers")
public @interface SOAPMessageHandlers {
    /**
     * @see jakarta.jws.soap.SOAPMessageHandlers#value()
     */
    SOAPMessageHandler[] value();
}
