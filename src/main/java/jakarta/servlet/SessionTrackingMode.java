package jakarta.servlet;

/**
 * @deprecated Use {@link jakarta.servlet.SessionTrackingMode} instead.
 */
@Deprecated(since = "jakarta.servlet.SessionTrackingMode")
public interface SessionTrackingMode {
    enum $ implements SessionTrackingMode { COOKIE, URL, SSL }
    $ COOKIE = $.COOKIE;
    $ URL = $.URL;
    $ SSL = $.SSL;

    static $ valueOf(String name) {
        return $.valueOf(name);
    }
}
