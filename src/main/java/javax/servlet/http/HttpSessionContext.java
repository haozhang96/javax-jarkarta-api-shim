package javax.servlet.http;

import javax.servlet.ServletShim;
import java.util.Collections;
import java.util.Enumeration;

/**
 * @deprecated This class is no longer available since Servlet 2.1.
 */
@Deprecated(since = "Servlet 2.1", forRemoval = true)
public interface HttpSessionContext extends ServletShim {
    /**
     * @deprecated This method has been deprecated and/or removed since Servlet 2.1.
     */
    @Deprecated(since = "Servlet 2.1", forRemoval = true)
    default Enumeration<String> getIds() {
        return Collections.emptyEnumeration();
    }

    /**
     * @deprecated This method has been deprecated and/or removed since Servlet 2.1.
     */
    @Deprecated(since = "Servlet 2.1", forRemoval = true)
    default HttpSession getSession(String sessionId) {
        return null;
    }
}
