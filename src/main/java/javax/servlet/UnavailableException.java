package javax.servlet;

/**
 * @deprecated Use {@link jakarta.servlet.UnavailableException} instead.
 */
@Deprecated(since = "jakarta.servlet.UnavailableException")
public class UnavailableException extends ServletException {
    private static final long serialVersionUID = 5622686609215003468L; // Use the ID from jakarta.servlet.
    private static final int INDETERMINATE = -1;

    private final int seconds;

    //==================================================================================================================
    // Constructors
    //==================================================================================================================

    /**
     * @see jakarta.servlet.UnavailableException#UnavailableException(String)
     */
    public UnavailableException(String message) {
        this(message, INDETERMINATE);
    }

    /**
     * @see jakarta.servlet.UnavailableException#UnavailableException(String, int)
     */
    public UnavailableException(String message, int seconds) {
        super(message);
        this.seconds = seconds != 0 ? Math.max(seconds, INDETERMINATE) : INDETERMINATE;
    }

    UnavailableException(jakarta.servlet.UnavailableException exception) {
        this(exception.getMessage(), exception.getUnavailableSeconds());
    }

    //==================================================================================================================
    // UnavailableException Implementation Methods
    //==================================================================================================================

    /**
     * @see jakarta.servlet.UnavailableException#isPermanent()
     */
    public boolean isPermanent() {
        return getUnavailableSeconds() == INDETERMINATE;
    }

    /**
     * @see jakarta.servlet.UnavailableException#getUnavailableSeconds()
     */
    public int getUnavailableSeconds() {
        return seconds;
    }
}
