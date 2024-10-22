package javax.servlet.http;

import javax.servlet.ServletShim;

/**
 * @deprecated Use {@link jakarta.servlet.http.HttpUpgradeHandler} instead.
 */
@Deprecated(since = "jakarta.servlet.http.HttpUpgradeHandler")
public interface HttpUpgradeHandler extends jakarta.servlet.http.HttpUpgradeHandler, ServletShim {
    //==================================================================================================================
    // Shim Methods
    //==================================================================================================================

    /**
     * @see #init(jakarta.servlet.http.WebConnection)
     */
    void init(WebConnection connection);

    //==================================================================================================================
    // HttpUpgradeHandler Implementation Methods
    //==================================================================================================================

    @Override
    default void init(jakarta.servlet.http.WebConnection connection) {
        init(ServletShim.of(connection));
    }
}
