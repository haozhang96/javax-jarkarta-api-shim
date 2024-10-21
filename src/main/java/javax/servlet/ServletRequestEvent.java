package javax.servlet;

/**
 * @deprecated Use {@link jakarta.servlet.ServletRequestEvent} instead.
 */
@Deprecated(since = "jakarta.servlet.ServletRequestEvent")
public class ServletRequestEvent extends jakarta.servlet.ServletRequestEvent implements ServletShim {
    private static final long serialVersionUID = -7467864054698729101L; // Use the ID from jakarta.servlet.

    //==================================================================================================================
    // Constructors
    //==================================================================================================================

    /**
     * @see jakarta.servlet.ServletRequestEvent#ServletRequestEvent(jakarta.servlet.ServletContext, jakarta.servlet.ServletRequest)
     */
    public ServletRequestEvent(ServletContext source, ServletRequest request) {
        super(source, request);
    }

    ServletRequestEvent(ServletRequest request) {
        this(request.getServletContext(), request);
    }

    //==================================================================================================================
    // ServletRequestEvent Implementation Methods
    //==================================================================================================================

    @Override
    public ServletContext getServletContext() {
        return ServletShim.of(super.getServletContext());
    }

    @Override
    public ServletRequest getServletRequest() {
        return ServletShim.of(super.getServletRequest());
    }
}
