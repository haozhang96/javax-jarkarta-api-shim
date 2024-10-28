package jakarta.servlet.http;

import javax.shim.Shim;

/**
 * @deprecated Use {@link jakarta.servlet.http.MappingMatch} instead.
 */
@Deprecated(since = "jakarta.servlet.http.MappingMatch")
public interface MappingMatch extends Shim {
    enum $ implements MappingMatch { CONTEXT_ROOT, DEFAULT, EXACT, EXTENSION, PATH }
    $ CONTEXT_ROOT = $.CONTEXT_ROOT;
    $ DEFAULT = $.DEFAULT;
    $ EXACT = $.EXACT;
    $ EXTENSION = $.EXTENSION;
    $ PATH = $.PATH;

    static $ valueOf(String name) {
        return $.valueOf(name);
    }
}
