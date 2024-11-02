package jakarta.servlet;

import jakarta.ReverseShim;

/**
 * @deprecated Use {@link jakarta.servlet.SessionTrackingMode} instead.
 */
@Deprecated(since = "jakarta.servlet.SessionTrackingMode")
public interface SessionTrackingMode extends ReverseShim.Enum<javax.servlet.SessionTrackingMode> {
    javax.servlet.SessionTrackingMode COOKIE = javax.servlet.SessionTrackingMode.COOKIE;
    javax.servlet.SessionTrackingMode URL = javax.servlet.SessionTrackingMode.URL;
    javax.servlet.SessionTrackingMode SSL = javax.servlet.SessionTrackingMode.SSL;

    static javax.servlet.SessionTrackingMode valueOf(String name) {
        return javax.servlet.SessionTrackingMode.valueOf(name);
    }
}
