package javax.servlet;

/**
 * @deprecated Use {@link jakarta.servlet.DispatcherType} instead.
 */
@Deprecated(since = "jakarta.servlet.DispatcherType")
public enum DispatcherType implements ServletShim {
    FORWARD, INCLUDE, REQUEST, ASYNC, ERROR
}
