package javax.servlet;

/**
 * @deprecated Use {@link jakarta.servlet.Registration} instead.
 */
@Deprecated(since = "jakarta.servlet.Registration")
public interface Registration extends jakarta.servlet.Registration, ServletShim {
    //==================================================================================================================
    // Registration.Dynamic Implementation
    //==================================================================================================================

    /**
     * @deprecated Use {@link jakarta.servlet.Registration.Dynamic} instead.
     */
    @Deprecated(since = "jakarta.servlet.Registration.Dynamic")
    interface Dynamic extends jakarta.servlet.Registration.Dynamic, Registration { }
}
