package javax.servlet;

import java.io.IOException;

/**
 * @deprecated Use {@link jakarta.servlet.ServletResponse} instead.
 */
@Deprecated(since = "jakarta.servlet.ServletResponse")
public interface ServletResponse extends jakarta.servlet.ServletResponse, ServletShim {
    //==================================================================================================================
    // ServletResponse Implementation Methods
    //==================================================================================================================

    @Override
    ServletOutputStream getOutputStream() throws IOException;
}
