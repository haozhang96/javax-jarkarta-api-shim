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
    interface Dynamic extends jakarta.servlet.ServletRegistration.Dynamic, ServletRegistration, Registration.Dynamic {
        //==============================================================================================================
        // Shim Methods
        //==============================================================================================================

        /**
         * @see #setServletSecurity(jakarta.servlet.ServletSecurityElement)
         */
        Set<String> setServletSecurity(ServletSecurityElement constraint);

        /**
         * @see #setMultipartConfig(jakarta.servlet.MultipartConfigElement)
         */
        void setMultipartConfig(MultipartConfigElement multipartConfig);

        //==============================================================================================================
        // ServletRegistration.Dynamic Implementation Methods
        //==============================================================================================================

        @Override
        default Set<String> setServletSecurity(jakarta.servlet.ServletSecurityElement constraint) {
            return setServletSecurity(ServletShim.<jakarta.servlet.ServletSecurityElement, ServletSecurityElement>of(constraint));
        }

        @Override
        default void setMultipartConfig(jakarta.servlet.MultipartConfigElement multipartConfig) {
            setMultipartConfig(ServletShim.of(multipartConfig));
        }
    }
}
