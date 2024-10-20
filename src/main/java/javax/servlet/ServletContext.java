package javax.servlet;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

/**
 * @deprecated Use {@link jakarta.servlet.ServletContext} instead.
 */
@Deprecated(since = "jakarta.servlet.ServletContext")
public interface ServletContext extends jakarta.servlet.ServletContext, ServletShim {
    //==================================================================================================================
    // ServletContext Implementation Methods
    //==================================================================================================================

    @Nonnull
    @Override
    String getContextPath();

    @Nonnull
    @Override
    ServletContext getContext(@Nonnull String uriPath);

    @Override
    int getMajorVersion();

    @Override
    int getMinorVersion();

    @Override
    int getEffectiveMajorVersion();

    @Override
    int getEffectiveMinorVersion();

    @Nullable
    @Override
    String getMimeType(@Nonnull String file);

    @Nullable
    @Override
    Set<String> getResourcePaths(@Nonnull String path);

    @Nullable
    @Override
    URL getResource(@Nonnull String path) throws MalformedURLException;

    @Nullable
    @Override
    InputStream getResourceAsStream(@Nonnull String path);


}
