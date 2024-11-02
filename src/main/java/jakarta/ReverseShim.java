package jakarta;

import javax.Shim;
import java.io.Serializable;

/**
 * @deprecated Use {@link jakarta} instead.
 */
@Deprecated(since = "jakarta")
public interface ReverseShim extends Shim {
    //==================================================================================================================
    // Helpers
    //==================================================================================================================

    /**
     * @deprecated Use {@link jakarta} instead.
     */
    @Deprecated(since = "jakarta")
    interface Enum<E extends java.lang.Enum<E>> extends ReverseShim, Serializable {
        /**
         * @see java.lang.Enum#name()
         */
        String name();

        /**
         * @see java.lang.Enum#ordinal()
         */
        int ordinal();

        /**
         * @see java.lang.Enum#getDeclaringClass()
         */
        Class<E> getDeclaringClass();
    }
}
