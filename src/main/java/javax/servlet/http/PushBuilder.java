package javax.servlet.http;

import javax.servlet.ServletShim;

/**
 * @deprecated Use {@link jakarta.servlet.http.PushBuilder} instead.
 */
@Deprecated(since = "jakarta.servlet.http.PushBuilder")
public interface PushBuilder extends jakarta.servlet.http.PushBuilder, ServletShim {
    //==================================================================================================================
    // PushBuilder Implementation Methods
    //==================================================================================================================

    @Override
    PushBuilder method(String method);

    @Override
    PushBuilder queryString(String queryString);

    @Override
    PushBuilder sessionId(String sessionId);

    @Override
    PushBuilder setHeader(String name, String value);

    @Override
    PushBuilder addHeader(String name, String value);

    @Override
    PushBuilder removeHeader(String name);

    @Override
    PushBuilder path(String path);
}
