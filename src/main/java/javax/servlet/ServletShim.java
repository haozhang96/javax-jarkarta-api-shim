package javax.servlet;

import jakarta.annotation.Nonnull;

import javax.Shim;

/**
 * @deprecated Use {@link jakarta.servlet} instead.
 */
@Deprecated(since = "jakarta.servlet")
public interface ServletShim extends Shim {
    //==================================================================================================================
    // Factory Methods
    //==================================================================================================================

    @Nonnull
    @SuppressWarnings("unchecked")
    static <T, S extends ServletShim> S of(@Nonnull T object) {
        if (object instanceof ServletShim) {
            return (S) object;
        } else if (object instanceof jakarta.servlet.ServletConfig) {
            return (S) ServletFacades.of();
        }

        return (S) object;
    }
}
