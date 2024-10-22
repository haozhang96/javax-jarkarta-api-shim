package javax.servlet;

/**
 * @deprecated Use {@link jakarta.servlet.MultipartConfigElement} instead.
 */
@Deprecated(since = "jakarta.servlet.MultipartConfigElement")
public class MultipartConfigElement extends jakarta.servlet.MultipartConfigElement implements ServletShim {
    //==================================================================================================================
    // Constructors
    //==================================================================================================================

    public MultipartConfigElement(String location) {
        super(location);
    }

    public MultipartConfigElement(String location, long maxFileSize, long maxRequestSize, int fileSizeThreshold) {
        super(location, maxFileSize, maxRequestSize, fileSizeThreshold);
    }
}
