package javax.servlet;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;

import java.util.Enumeration;

/**
 * @deprecated Use {@link jakarta.servlet.ServletConfig} instead.
 */
@Deprecated(since = "jakarta.servlet.ServletConfig")
public interface ServletConfig extends jakarta.servlet.ServletConfig, ServletShim {
    //==================================================================================================================
    // ServletConfig Implementation Methods
    //==================================================================================================================

    @Nonnull
    @Override
    String getServletName();

    @Nonnull
    @Override
    ServletContext getServletContext();

    @Nullable
    String getInitParameter(@Nonnull String name);

    @Nonnull
    @Override
    Enumeration<String> getInitParameterNames();
}
