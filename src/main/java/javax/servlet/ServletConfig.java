package javax.servlet;

/**
 * @deprecated Use {@link jakarta.servlet.ServletConfig} instead.
 */
@Deprecated(since = "jakarta.servlet.ServletConfig")
public interface ServletConfig extends jakarta.servlet.ServletConfig, ServletShim {
    //==================================================================================================================
    // ServletConfig Implementation Methods
    //==================================================================================================================

    @Override
    ServletContext getServletContext();
}
