package javax.servlet;

import java.util.EnumSet;

/**
 * @deprecated Use {@link jakarta.servlet.FilterRegistration} instead.
 */
@Deprecated(since = "jakarta.servlet.FilterRegistration")
public interface FilterRegistration extends jakarta.servlet.FilterRegistration, ServletShim {
    //==================================================================================================================
    // FilterRegistration Implementation Methods
    //==================================================================================================================

    @Override
    void addMappingForServletNames(EnumSet dispatcherTypes, boolean isMatchAfter, String... servletNames);

    @Override
    void addMappingForUrlPatterns(EnumSet dispatcherTypes, boolean isMatchAfter, String... urlPatterns);

    //==================================================================================================================
    // FilterRegistration.Dynamic Implementation
    //==================================================================================================================

    /**
     * @deprecated Use {@link jakarta.servlet.FilterRegistration.Dynamic} instead.
     */
    @Deprecated(since = "jakarta.servlet.FilterRegistration.Dynamic")
    interface Dynamic extends jakarta.servlet.FilterRegistration.Dynamic, FilterRegistration { }
}
