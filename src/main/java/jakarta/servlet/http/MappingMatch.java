package jakarta.servlet.http;

import jakarta.ReverseShim;

/**
 * @deprecated Use {@link jakarta.servlet.http.MappingMatch} instead.
 */
@Deprecated(since = "jakarta.servlet.http.MappingMatch")
public interface MappingMatch extends ReverseShim.Enum<javax.servlet.http.MappingMatch> {
    javax.servlet.http.MappingMatch CONTEXT_ROOT = javax.servlet.http.MappingMatch.CONTEXT_ROOT;
    javax.servlet.http.MappingMatch DEFAULT = javax.servlet.http.MappingMatch.DEFAULT;
    javax.servlet.http.MappingMatch EXACT = javax.servlet.http.MappingMatch.EXACT;
    javax.servlet.http.MappingMatch EXTENSION = javax.servlet.http.MappingMatch.EXTENSION;
    javax.servlet.http.MappingMatch PATH = javax.servlet.http.MappingMatch.PATH;

    static javax.servlet.http.MappingMatch valueOf(String name) {
        return javax.servlet.http.MappingMatch.valueOf(name);
    }
}
