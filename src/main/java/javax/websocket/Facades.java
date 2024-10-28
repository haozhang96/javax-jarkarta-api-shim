package javax.websocket;

import javax.shim.Shim;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * This interface contains {@link jakarta.websocket}-to-{@link javax.websocket} facades used for wrapping Jakarta
 *   WebSocket objects into their Java WebSocket counterparts.
 *
 * @deprecated Use {@link jakarta.websocket} instead.
 */
@Deprecated(since = "jakarta.websocket")
@SuppressWarnings("all") // A lot of ugliness is required to bridge the facades between the two APIs.
interface Facades {
    //==================================================================================================================
    // Annotations
    //==================================================================================================================

    final class ClientEndpoint extends Shim.Delegate.Annotation<jakarta.websocket.ClientEndpoint> implements javax.websocket.ClientEndpoint {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        ClientEndpoint(jakarta.websocket.ClientEndpoint delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public String[] subprotocols() {
            return delegate.subprotocols();
        }

        @Override
        public Class<? extends javax.websocket.Decoder>[] decoders() {
            return (Class<? extends javax.websocket.Decoder>[]) delegate.decoders();
        }

        @Override
        public Class<? extends javax.websocket.Encoder>[] encoders() {
            return (Class<? extends javax.websocket.Encoder>[]) delegate.encoders();
        }

        @Override
        public Class<? extends javax.websocket.ClientEndpointConfig.Configurator> configurator() {
            return delegate.configurator().asSubclass(javax.websocket.ClientEndpointConfig.Configurator.class);
        }
    }

    final class OnClose extends Shim.Delegate.Annotation<jakarta.websocket.OnClose> implements javax.websocket.OnClose {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        OnClose(jakarta.websocket.OnClose delegate) {
            super(delegate);
        }
    }

    final class OnError extends Shim.Delegate.Annotation<jakarta.websocket.OnError> implements javax.websocket.OnError {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        OnError(jakarta.websocket.OnError delegate) {
            super(delegate);
        }
    }

    final class OnMessage extends Shim.Delegate.Annotation<jakarta.websocket.OnMessage> implements javax.websocket.OnMessage {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        OnMessage(jakarta.websocket.OnMessage delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public long maxMessageSize() {
            return delegate.maxMessageSize();
        }
    }

    final class OnOpen extends Shim.Delegate.Annotation<jakarta.websocket.OnOpen> implements javax.websocket.OnOpen {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        OnOpen(jakarta.websocket.OnOpen delegate) {
            super(delegate);
        }
    }

    final class PathParam extends Shim.Delegate.Annotation<jakarta.websocket.server.PathParam> implements javax.websocket.server.PathParam {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        PathParam(jakarta.websocket.server.PathParam delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public String value() {
            return delegate.value();
        }
    }

    final class ServerEndpoint extends Shim.Delegate.Annotation<jakarta.websocket.server.ServerEndpoint> implements javax.websocket.server.ServerEndpoint {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        ServerEndpoint(jakarta.websocket.server.ServerEndpoint delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public String value() {
            return delegate.value();
        }

        @Override
        public String[] subprotocols() {
            return delegate.subprotocols();
        }

        @Override
        public Class<? extends javax.websocket.Decoder>[] decoders() {
            return (Class<? extends javax.websocket.Decoder>[]) delegate.decoders();
        }

        @Override
        public Class<? extends javax.websocket.Encoder>[] encoders() {
            return (Class<? extends javax.websocket.Encoder>[]) delegate.encoders();
        }

        @Override
        public Class<? extends javax.websocket.server.ServerEndpointConfig.Configurator> configurator() {
            return delegate.configurator().asSubclass(javax.websocket.server.ServerEndpointConfig.Configurator.class);
        }
    }

    //==================================================================================================================
    // Classes
    //==================================================================================================================

    final class DecodeException extends javax.websocket.DecodeException {
        private final jakarta.websocket.DecodeException delegate;

        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        DecodeException(jakarta.websocket.DecodeException delegate) {
            super(delegate.getBytes(), delegate.getMessage(), delegate.getCause());
            this.delegate = delegate;
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public ByteBuffer getBytes() {
            return delegate.getBytes();
        }

        @Override
        public String getText() {
            return delegate.getText();
        }

        @Override
        public String getMessage() {
            return delegate.getMessage();
        }

        @Override
        public String getLocalizedMessage() {
            return delegate.getLocalizedMessage();
        }

        @Override
        public Throwable getCause() {
            return delegate.getCause();
        }

        @Override
        public Throwable initCause(Throwable cause) {
            return delegate.initCause(cause);
        }

        @Override
        public String toString() {
            return delegate.toString();
        }

        @Override
        public void printStackTrace() {
            delegate.printStackTrace();
        }

        @Override
        public void printStackTrace(PrintStream s) {
            delegate.printStackTrace(s);
        }

        @Override
        public void printStackTrace(PrintWriter s) {
            delegate.printStackTrace(s);
        }

        @Override
        public Throwable fillInStackTrace() {
            return delegate.fillInStackTrace();
        }

        @Override
        public StackTraceElement[] getStackTrace() {
            return delegate.getStackTrace();
        }

        @Override
        public void setStackTrace(StackTraceElement[] stackTrace) {
            delegate.setStackTrace(stackTrace);
        }
    }

    final class DeploymentException extends javax.websocket.DeploymentException {
        private final jakarta.websocket.DeploymentException delegate;

        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        DeploymentException(jakarta.websocket.DeploymentException delegate) {
            super(delegate.getMessage(), delegate.getCause());
            this.delegate = delegate;
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public String getMessage() {
            return delegate.getMessage();
        }

        @Override
        public String getLocalizedMessage() {
            return delegate.getLocalizedMessage();
        }

        @Override
        public Throwable getCause() {
            return delegate.getCause();
        }

        @Override
        public Throwable initCause(Throwable cause) {
            return delegate.initCause(cause);
        }

        @Override
        public String toString() {
            return delegate.toString();
        }

        @Override
        public void printStackTrace() {
            delegate.printStackTrace();
        }

        @Override
        public void printStackTrace(PrintStream s) {
            delegate.printStackTrace(s);
        }

        @Override
        public void printStackTrace(PrintWriter s) {
            delegate.printStackTrace(s);
        }

        @Override
        public Throwable fillInStackTrace() {
            return delegate.fillInStackTrace();
        }

        @Override
        public StackTraceElement[] getStackTrace() {
            return delegate.getStackTrace();
        }

        @Override
        public void setStackTrace(StackTraceElement[] stackTrace) {
            delegate.setStackTrace(stackTrace);
        }
    }

    final class EncodeException extends javax.websocket.EncodeException {
        private final jakarta.websocket.EncodeException delegate;

        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        EncodeException(jakarta.websocket.EncodeException delegate) {
            super(delegate.getObject(), delegate.getMessage(), delegate.getCause());
            this.delegate = delegate;
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public Object getObject() {
            return delegate.getObject();
        }

        @Override
        public String getMessage() {
            return delegate.getMessage();
        }

        @Override
        public String getLocalizedMessage() {
            return delegate.getLocalizedMessage();
        }

        @Override
        public Throwable getCause() {
            return delegate.getCause();
        }

        @Override
        public Throwable initCause(Throwable cause) {
            return delegate.initCause(cause);
        }

        @Override
        public String toString() {
            return delegate.toString();
        }

        @Override
        public void printStackTrace() {
            delegate.printStackTrace();
        }

        @Override
        public void printStackTrace(PrintStream s) {
            delegate.printStackTrace(s);
        }

        @Override
        public void printStackTrace(PrintWriter s) {
            delegate.printStackTrace(s);
        }

        @Override
        public Throwable fillInStackTrace() {
            return delegate.fillInStackTrace();
        }

        @Override
        public StackTraceElement[] getStackTrace() {
            return delegate.getStackTrace();
        }

        @Override
        public void setStackTrace(StackTraceElement[] stackTrace) {
            delegate.setStackTrace(stackTrace);
        }
    }

    final class SessionException extends javax.websocket.SessionException {
        private final jakarta.websocket.SessionException delegate;

        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        SessionException(jakarta.websocket.SessionException delegate) {
            super(delegate.getMessage(), delegate.getCause(), WebSocketShim.of(delegate.getSession()));
            this.delegate = delegate;
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public javax.websocket.Session getSession() {
            return WebSocketShim.of(delegate.getSession());
        }

        @Override
        public String getMessage() {
            return delegate.getMessage();
        }

        @Override
        public String getLocalizedMessage() {
            return delegate.getLocalizedMessage();
        }

        @Override
        public Throwable getCause() {
            return delegate.getCause();
        }

        @Override
        public Throwable initCause(Throwable cause) {
            return delegate.initCause(cause);
        }

        @Override
        public String toString() {
            return delegate.toString();
        }

        @Override
        public void printStackTrace() {
            delegate.printStackTrace();
        }

        @Override
        public void printStackTrace(PrintStream s) {
            delegate.printStackTrace(s);
        }

        @Override
        public void printStackTrace(PrintWriter s) {
            delegate.printStackTrace(s);
        }

        @Override
        public Throwable fillInStackTrace() {
            return delegate.fillInStackTrace();
        }

        @Override
        public StackTraceElement[] getStackTrace() {
            return delegate.getStackTrace();
        }

        @Override
        public void setStackTrace(StackTraceElement[] stackTrace) {
            delegate.setStackTrace(stackTrace);
        }
    }

    final class WebSocketContainer extends Shim.Delegate<jakarta.websocket.WebSocketContainer> implements javax.websocket.WebSocketContainer {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        WebSocketContainer(jakarta.websocket.WebSocketContainer delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public long getDefaultAsyncSendTimeout() {
            return delegate.getDefaultAsyncSendTimeout();
        }

        @Override
        public void setAsyncSendTimeout(long timeoutmillis) {
            delegate.setAsyncSendTimeout(timeoutmillis);
        }

        @Override
        public javax.websocket.Session connectToServer(
            Object annotatedEndpointInstance,
            URI path
        ) throws javax.websocket.DeploymentException, IOException {
            try {
                return WebSocketShim.of(delegate.connectToServer(annotatedEndpointInstance, path));
            } catch (jakarta.websocket.DeploymentException exception) {
                throw WebSocketShim.<jakarta.websocket.DeploymentException, javax.websocket.DeploymentException>of(exception);
            }
        }

        @Override
        public javax.websocket.Session connectToServer(
            Class<?> annotatedEndpointClass,
            URI path
        ) throws javax.websocket.DeploymentException, IOException {
            try {
                return WebSocketShim.of(delegate.connectToServer(annotatedEndpointClass, path));
            } catch (jakarta.websocket.DeploymentException exception) {
                throw WebSocketShim.<jakarta.websocket.DeploymentException, javax.websocket.DeploymentException>of(exception);
            }
        }

        @Override
        public javax.websocket.Session connectToServer(
            javax.websocket.Endpoint endpointInstance,
            javax.websocket.ClientEndpointConfig endpointConfig,
            URI path
        ) throws javax.websocket.DeploymentException, IOException {
            try {
                return WebSocketShim.of(delegate.connectToServer(endpointInstance, endpointConfig, path));
            } catch (jakarta.websocket.DeploymentException exception) {
                throw WebSocketShim.<jakarta.websocket.DeploymentException, javax.websocket.DeploymentException>of(exception);
            }
        }

        @Override
        public javax.websocket.Session connectToServer(
            jakarta.websocket.Endpoint endpointInstance,
            jakarta.websocket.ClientEndpointConfig endpointConfig,
            URI path
        ) throws javax.websocket.DeploymentException, IOException {
            try {
                return WebSocketShim.of(delegate.connectToServer(endpointInstance, endpointConfig, path));
            } catch (jakarta.websocket.DeploymentException exception) {
                throw WebSocketShim.<jakarta.websocket.DeploymentException, javax.websocket.DeploymentException>of(exception);
            }
        }

        @Override
        public javax.websocket.Session connectToServer(
            Class<? extends javax.websocket.Endpoint> endpointClass,
            javax.websocket.ClientEndpointConfig endpointConfig,
            URI path
        ) throws javax.websocket.DeploymentException, IOException {
            try {
                return WebSocketShim.of(delegate.connectToServer(endpointClass, endpointConfig, path));
            } catch (jakarta.websocket.DeploymentException exception) {
                throw WebSocketShim.<jakarta.websocket.DeploymentException, javax.websocket.DeploymentException>of(exception);
            }
        }

        @Override
        public javax.websocket.Session connectToServer(
            Class<? extends jakarta.websocket.Endpoint> endpointClass,
            jakarta.websocket.ClientEndpointConfig endpointConfig,
            URI path
        ) throws javax.websocket.DeploymentException, IOException {
            try {
                return WebSocketShim.of(delegate.connectToServer(endpointClass, endpointConfig, path));
            } catch (jakarta.websocket.DeploymentException exception) {
                throw WebSocketShim.<jakarta.websocket.DeploymentException, javax.websocket.DeploymentException>of(exception);
            }
        }

        @Override
        public long getDefaultMaxSessionIdleTimeout() {
            return delegate.getDefaultMaxSessionIdleTimeout();
        }

        @Override
        public void setDefaultMaxSessionIdleTimeout(long timeout) {
            delegate.setDefaultMaxSessionIdleTimeout(timeout);
        }

        @Override
        public int getDefaultMaxBinaryMessageBufferSize() {
            return delegate.getDefaultMaxBinaryMessageBufferSize();
        }

        @Override
        public void setDefaultMaxBinaryMessageBufferSize(int max) {
            delegate.setDefaultMaxBinaryMessageBufferSize(max);
        }

        @Override
        public int getDefaultMaxTextMessageBufferSize() {
            return delegate.getDefaultMaxTextMessageBufferSize();
        }

        @Override
        public void setDefaultMaxTextMessageBufferSize(int max) {
            delegate.setDefaultMaxTextMessageBufferSize(max);
        }

        @Override
        public Set getInstalledExtensions() {
            return WebSocketShim.of(Collectors.toSet(), delegate.getInstalledExtensions());
        }
    }
}
