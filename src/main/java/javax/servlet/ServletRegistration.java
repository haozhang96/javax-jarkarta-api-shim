package javax.servlet;

import java.util.Set;

/**
 * @deprecated Use {@link jakarta.servlet.ServletRegistration} instead.
 */
@Deprecated(since = "jakarta.servlet.ServletRegistration")
public interface ServletRegistration extends jakarta.servlet.ServletRegistration, ServletShim {
    //==================================================================================================================
    // ServletRegistration.Dynamic Implementation
    //==================================================================================================================

    /**
     * @deprecated Use {@link jakarta.servlet.ServletRegistration.Dynamic} instead.
     */
    @Deprecated(since = "jakarta.servlet.ServletRegistration.Dynamic")
    interface Dynamic extends jakarta.servlet.ServletRegistration.Dynamic, ServletRegistration {
        //==============================================================================================================
        // Shim Methods
        //==============================================================================================================

        Set<String> setServletSecurity();

        void setMultipartConfig();

        //==============================================================================================================
        // ServletRegistration.Dynamic Implementation Methods
        //==============================================================================================================

        @Override
        default Set<String> setServletSecurity(jakarta.servlet.ServletSecurityElement constraint) {
            return Set.of();
        }

        @Override
        default void setMultipartConfig(jakarta.servlet.MultipartConfigElement multipartConfig) {

        }
    }
}
