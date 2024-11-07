package jakarta.servlet;

/**
 * @deprecated Use {@link jakarta.servlet.DispatcherType} instead.
 */
@Deprecated(since = "jakarta.servlet.DispatcherType")
public interface DispatcherType extends jakarta.ReverseShim.Enum<javax.servlet.DispatcherType> {
    javax.servlet.DispatcherType FORWARD = javax.servlet.DispatcherType.FORWARD;
    javax.servlet.DispatcherType INCLUDE = javax.servlet.DispatcherType.INCLUDE;
    javax.servlet.DispatcherType REQUEST = javax.servlet.DispatcherType.REQUEST;
    javax.servlet.DispatcherType ASYNC = javax.servlet.DispatcherType.ASYNC;
    javax.servlet.DispatcherType ERROR = javax.servlet.DispatcherType.ERROR;

    static javax.servlet.DispatcherType valueOf(String name) {
        return javax.servlet.DispatcherType.valueOf(name);
    }
}
