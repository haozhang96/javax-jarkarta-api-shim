package javax.servlet;

/**
 * @deprecated Use {@link jakarta.servlet.DispatcherType} instead.
 */
@Deprecated(since = "jakarta.servlet.DispatcherType")
public enum DispatcherType implements jakarta.servlet.DispatcherType, ServletShim {
    FORWARD, INCLUDE, REQUEST, ASYNC, ERROR
}
