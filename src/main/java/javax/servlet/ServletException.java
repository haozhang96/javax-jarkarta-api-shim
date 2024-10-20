package javax.servlet;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;

/**
 * @deprecated Use {@link jakarta.servlet.ServletException} instead.
 */
@Deprecated(since = "jakarta.servlet.ServletException")
public class ServletException extends jakarta.servlet.ServletException implements ServletShim {
    private static final long serialVersionUID = 4221302886851315160L; // Use the ID from jakarta.servlet.

    //==================================================================================================================
    // Constructors
    //==================================================================================================================

    ServletException(@Nonnull jakarta.servlet.ServletException exception) {
        this(exception.getMessage(), exception.getRootCause());
    }

    /**
     * @see jakarta.servlet.ServletException#ServletException()
     */
    public ServletException() {
        super();
    }

    /**
     * @see jakarta.servlet.ServletException#ServletException(String)
     */
    public ServletException(@Nullable String message) {
        super(message);
    }

    /**
     * @see jakarta.servlet.ServletException#ServletException(String, Throwable)
     */
    public ServletException(@Nullable String message, @Nullable Throwable rootCause) {
        super(message, rootCause);
    }

    /**
     * @see jakarta.servlet.ServletException#ServletException(Throwable)
     */
    public ServletException(@Nullable Throwable rootCause) {
        super(rootCause);
    }

    //==================================================================================================================
    // ServletException Implementation Methods
    //==================================================================================================================

    @Nullable
    @Override
    public Throwable getRootCause() {
        return super.getRootCause();
    }
}
