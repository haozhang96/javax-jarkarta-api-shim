package javax.servlet;

/**
 * @deprecated Use {@link jakarta.servlet.DispatcherType} instead.
 */
public enum DispatcherType implements ServletShim {
    FORWARD, INCLUDE, REQUEST, ASYNC, ERROR
}
