package javax.servlet.http;

import javax.servlet.ServletShim;

/**
 * @deprecated Use {@link jakarta.servlet.http.MappingMatch} instead.
 */
@Deprecated(since = "jakarta.servlet.http.MappingMatch")
public enum MappingMatch implements jakarta.servlet.http.MappingMatch, ServletShim {
    CONTEXT_ROOT, DEFAULT, EXACT, EXTENSION, PATH
}
