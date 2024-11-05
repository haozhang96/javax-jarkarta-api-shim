package javax.servlet.jsp;

import javax.servlet.ServletException;
import javax.servlet.ServletShim;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @deprecated Use {@link jakarta.servlet.jsp.HttpJspPage} instead.
 */
@Deprecated(since = "jakarta.servlet.jsp.HttpJspPage")
public interface HttpJspPage extends jakarta.servlet.jsp.HttpJspPage, JspPage {
    //==================================================================================================================
    // Shim Methods
    //==================================================================================================================

    /**
     * @see #_jspService(jakarta.servlet.http.HttpServletRequest, jakarta.servlet.http.HttpServletResponse)
     */
    void _jspService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;

    //==================================================================================================================
    // HttpJspPage Implementation Methods
    //==================================================================================================================

    @Override
    default void _jspService(
        jakarta.servlet.http.HttpServletRequest request,
        jakarta.servlet.http.HttpServletResponse response
    ) throws ServletException, IOException {
        _jspService(ServletShim.of(request), ServletShim.of(response));
    }
}
