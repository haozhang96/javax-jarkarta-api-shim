package javax.servlet;

/**
 * @deprecated Use {@link jakarta.servlet.SessionTrackingMode} instead.
 */
@Deprecated(since = "jakarta.servlet.SessionTrackingMode")
public enum SessionTrackingMode implements jakarta.servlet.SessionTrackingMode, ServletShim {
    COOKIE, URL, SSL
}
