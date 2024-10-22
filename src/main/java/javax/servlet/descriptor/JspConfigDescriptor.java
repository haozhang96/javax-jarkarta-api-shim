package javax.servlet.descriptor;

import javax.servlet.ServletShim;
import java.util.Collection;

/**
 * @deprecated Use {@link jakarta.servlet.descriptor.JspConfigDescriptor} instead.
 */
@Deprecated(since = "jakarta.servlet.descriptor.JspConfigDescriptor")
public interface JspConfigDescriptor extends jakarta.servlet.descriptor.JspConfigDescriptor, ServletShim {
    //==================================================================================================================
    // JspConfigDescriptor Implementation Methods
    //==================================================================================================================

    @Override
    @SuppressWarnings({"unchecked", "rawtypes"})
    Collection getTaglibs();

    @Override
    @SuppressWarnings({"unchecked", "rawtypes"})
    Collection getJspPropertyGroups();
}
