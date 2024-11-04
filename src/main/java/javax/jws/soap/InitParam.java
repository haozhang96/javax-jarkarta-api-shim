package javax.jws.soap;

/**
 * @deprecated Use {@link jakarta.jws.soap.InitParam} instead.
 */
@Deprecated(since = "jakarta.jws.soap.InitParam")
public @interface InitParam {
    /**
     * @see jakarta.jws.soap.InitParam#name()
     */
    String name();

    /**
     * @see jakarta.jws.soap.InitParam#value()
     */
    String value();
}
