package javax.servlet.http;

import javax.servlet.ServletInputStream;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletShim;
import java.io.IOException;

/**
 * @deprecated Use {@link jakarta.servlet.http.WebConnection} instead.
 */
@Deprecated(since = "jakarta.servlet.http.WebConnection")
public interface WebConnection extends jakarta.servlet.http.WebConnection, ServletShim {
    //==================================================================================================================
    // WebConnection Implementation Methods
    //==================================================================================================================

    @Override
    ServletInputStream getInputStream() throws IOException;

    @Override
    ServletOutputStream getOutputStream() throws IOException;
}
