package javax.servlet;

/**
 * @deprecated Use {@link jakarta.servlet.SessionTrackingMode} instead.
 */
public enum SessionTrackingMode implements ServletShim {
    COOKIE,
    URL,
    SSL
}
