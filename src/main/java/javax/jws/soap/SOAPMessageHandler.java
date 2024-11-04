package javax.jws.soap;

/**
 * @deprecated Use {@link jakarta.jws.soap.SOAPMessageHandler} instead.
 */
@Deprecated(since = "jakarta.jws.soap.SOAPMessageHandler")
public @interface SOAPMessageHandler {
    /**
     * @see jakarta.jws.soap.SOAPMessageHandler#name()
     */
    String name() default "";

    /**
     * @see jakarta.jws.soap.SOAPMessageHandler#className()
     */
    String className();

    /**
     * @see jakarta.jws.soap.SOAPMessageHandler#initParams()
     */
    InitParam[] initParams() default {};

    /**
     * @see jakarta.jws.soap.SOAPMessageHandler#roles()
     */
    String[] roles() default {};

    /**
     * @see jakarta.jws.soap.SOAPMessageHandler#headers()
     */
    String[] headers() default {};
}
