package javax.servlet.http;

import javax.servlet.ServletShim;

/**
 * @deprecated Use {@link jakarta.servlet.http.MappingMatch} instead.
 */
@Deprecated(since = "jakarta.servlet.http.MappingMatch")
public enum MappingMatch implements ServletShim {
    CONTEXT_ROOT, DEFAULT, EXACT, EXTENSION, PATH
}
