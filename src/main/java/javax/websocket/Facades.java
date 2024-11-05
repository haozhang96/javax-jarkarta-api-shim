package javax.websocket;

import javax.Shim;
import javax.net.ssl.SSLContext;
import java.io.*;
import java.lang.invoke.MethodHandles;
import java.net.URI;
import java.nio.ByteBuffer;
import java.security.Principal;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * This interface contains {@link jakarta.websocket}-to-{@link javax.websocket} facades used for wrapping Jakarta
 *   WebSocket objects into their Java WebSocket counterparts.
 *
 * @deprecated Use {@link jakarta.websocket} instead.
 */
@Deprecated(since = "jakarta.websocket")
@SuppressWarnings("all")
interface Facades {
    //==================================================================================================================
    // Annotations
    //==================================================================================================================

    final class ClientEndpoint extends Shim.Delegate.Annotation<jakarta.websocket.ClientEndpoint> implements javax.websocket.ClientEndpoint, WebSocketShim {
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
            return Stream
                .of(delegate.decoders())
                .map(clazz -> WebSocketShim.<javax.websocket.Decoder>of(javax.websocket.Decoder.class, clazz))
                .toArray(Class[]::new);
        }

        @Override
        public Class<? extends javax.websocket.Encoder>[] encoders() {
            return Stream
                .of(delegate.encoders())
                .map(clazz -> WebSocketShim.<javax.websocket.Encoder>of(javax.websocket.Encoder.class, clazz))
                .toArray(Class[]::new);
        }

        @Override
        public Class<? extends javax.websocket.ClientEndpointConfig.Configurator> configurator() {
            return WebSocketShim.of(javax.websocket.ClientEndpointConfig.Configurator.class, delegate.configurator());
        }
    }

    final class OnClose extends Shim.Delegate.Annotation<jakarta.websocket.OnClose> implements javax.websocket.OnClose, WebSocketShim {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        OnClose(jakarta.websocket.OnClose delegate) {
            super(delegate);
        }
    }

    final class OnError extends Shim.Delegate.Annotation<jakarta.websocket.OnError> implements javax.websocket.OnError, WebSocketShim {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        OnError(jakarta.websocket.OnError delegate) {
            super(delegate);
        }
    }

    final class OnMessage extends Shim.Delegate.Annotation<jakarta.websocket.OnMessage> implements javax.websocket.OnMessage, WebSocketShim {
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

    final class OnOpen extends Shim.Delegate.Annotation<jakarta.websocket.OnOpen> implements javax.websocket.OnOpen, WebSocketShim {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        OnOpen(jakarta.websocket.OnOpen delegate) {
            super(delegate);
        }
    }

    final class PathParam extends Shim.Delegate.Annotation<jakarta.websocket.server.PathParam> implements javax.websocket.server.PathParam, WebSocketShim {
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

    final class ServerEndpoint extends Shim.Delegate.Annotation<jakarta.websocket.server.ServerEndpoint> implements javax.websocket.server.ServerEndpoint, WebSocketShim {
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
            return Stream
                .of(delegate.decoders())
                .map(clazz -> WebSocketShim.<javax.websocket.Decoder>of(javax.websocket.Decoder.class, clazz))
                .toArray(Class[]::new);
        }

        @Override
        public Class<? extends javax.websocket.Encoder>[] encoders() {
            return Stream
                .of(delegate.encoders())
                .map(clazz -> WebSocketShim.<javax.websocket.Encoder>of(javax.websocket.Encoder.class, clazz))
                .toArray(Class[]::new);
        }

        @Override
        public Class<? extends javax.websocket.server.ServerEndpointConfig.Configurator> configurator() {
            return WebSocketShim
                .of(javax.websocket.server.ServerEndpointConfig.Configurator.class, delegate.configurator());
        }
    }

    //==================================================================================================================
    // Classes
    //==================================================================================================================

    final class ClientEndpointConfig extends Shim.Delegate<jakarta.websocket.ClientEndpointConfig> implements javax.websocket.ClientEndpointConfig {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        ClientEndpointConfig(jakarta.websocket.ClientEndpointConfig delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public List getExtensions() {
            return WebSocketShim
                .<javax.websocket.Extension>of(delegate.getExtensions())
                .collect(Collectors.toList());
        }

        @Override
        public javax.websocket.ClientEndpointConfig.Configurator getConfigurator() {
            return WebSocketShim.of(delegate.getConfigurator());
        }

        @Override
        public List<String> getPreferredSubprotocols() {
            return delegate.getPreferredSubprotocols();
        }

        @Override
        public SSLContext getSSLContext() {
            return delegate.getSSLContext();
        }

        @Override
        public List getEncoders() {
            return delegate
                .getEncoders()
                .stream()
                .map(clazz -> WebSocketShim.<javax.websocket.Encoder>of(javax.websocket.Encoder.class, clazz))
                .collect(Collectors.toList());
        }

        @Override
        public List getDecoders() {
            return delegate
                .getDecoders()
                .stream()
                .map(clazz -> WebSocketShim.<javax.websocket.Decoder>of(javax.websocket.Decoder.class, clazz))
                .collect(Collectors.toList());
        }

        @Override
        public Map<String, Object> getUserProperties() {
            return delegate.getUserProperties();
        }
    }

    final class ClientEndpointConfig$Builder extends javax.websocket.ClientEndpointConfig.Builder {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        ClientEndpointConfig$Builder(jakarta.websocket.ClientEndpointConfig.Builder delegate) {
            super(delegate);
        }
    }

    final class ClientEndpointConfig$Configurator extends javax.websocket.ClientEndpointConfig.Configurator {
        private final jakarta.websocket.ClientEndpointConfig.Configurator delegate;

        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        ClientEndpointConfig$Configurator(jakarta.websocket.ClientEndpointConfig.Configurator delegate) {
            this.delegate = delegate;
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public void beforeRequest(Map<String, List<String>> headers) {
            delegate.beforeRequest(headers);
        }

        @Override
        public void afterResponse(javax.websocket.HandshakeResponse handshakeResponse) {
            delegate.afterResponse(handshakeResponse);
        }

        @Override
        public void afterResponse(jakarta.websocket.HandshakeResponse handshakeResponse) {
            delegate.afterResponse(handshakeResponse);
        }
    }

    final class CloseReason extends javax.websocket.CloseReason {
        private final jakarta.websocket.CloseReason delegate;

        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        CloseReason(jakarta.websocket.CloseReason delegate) {
            super(WebSocketShim.of(delegate.getCloseCode()), delegate.getReasonPhrase());
            this.delegate = delegate;
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public javax.websocket.CloseReason.CloseCode getCloseCode() {
            return WebSocketShim.of(delegate.getCloseCode());
        }

        @Override
        public String getReasonPhrase() {
            return delegate.getReasonPhrase();
        }

        @Override
        public String toString() {
            return delegate.toString();
        }
    }

    final class CloseReason$CloseCode extends Shim.Delegate<jakarta.websocket.CloseReason.CloseCode> implements javax.websocket.CloseReason.CloseCode {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        CloseReason$CloseCode(jakarta.websocket.CloseReason.CloseCode delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public int getCode() {
            return delegate.getCode();
        }
    }

    final class ContainerProvider extends javax.websocket.ContainerProvider {
        private static final Class<?> JAKARTA = MethodHandles.lookup().lookupClass().getSuperclass().getSuperclass();

        private final jakarta.websocket.ContainerProvider delegate;

        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        ContainerProvider(jakarta.websocket.ContainerProvider delegate) {
            this.delegate = delegate;
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        protected javax.websocket.WebSocketContainer getContainer() {
            try {
                // We must use reflection as we cannot access the protected method directly.
                return WebSocketShim.of(JAKARTA.getDeclaredMethod("getContainer").invoke(delegate));
            } catch (ReflectiveOperationException exception) {
                throw new IllegalStateException("Failed to invoke delegate method", exception);
            }
        }
    }

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

    final class Decoder extends Shim.Delegate<jakarta.websocket.Decoder> implements javax.websocket.Decoder {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        Decoder(jakarta.websocket.Decoder delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public void init(javax.websocket.EndpointConfig config) {
            delegate.init(config);
        }

        @Override
        public void init(jakarta.websocket.EndpointConfig config) {
            delegate.init(config);
        }

        @Override
        public void destroy() {
            delegate.destroy();
        }
    }

    final class Decoder$Binary<T> extends Shim.Delegate<jakarta.websocket.Decoder.Binary<T>> implements javax.websocket.Decoder.Binary<T> {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        Decoder$Binary(jakarta.websocket.Decoder.Binary<T> delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public T decode(ByteBuffer bytes) throws javax.websocket.DecodeException {
            try {
                return delegate.decode(bytes);
            } catch (jakarta.websocket.DecodeException exception) {
                throw WebSocketShim.<javax.websocket.DecodeException>of(exception);
            }
        }
        @Override
        public boolean willDecode(ByteBuffer bytes) {
            return delegate.willDecode(bytes);
        }

        @Override
        public void init(javax.websocket.EndpointConfig config) {
            delegate.init(config);
        }

        @Override
        public void init(jakarta.websocket.EndpointConfig config) {
            delegate.init(config);
        }

        @Override
        public void destroy() {
            delegate.destroy();
        }
    }

    final class Decoder$BinaryStream<T> extends Shim.Delegate<jakarta.websocket.Decoder.BinaryStream<T>> implements javax.websocket.Decoder.BinaryStream<T> {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        Decoder$BinaryStream(jakarta.websocket.Decoder.BinaryStream<T> delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public T decode(InputStream stream) throws javax.websocket.DecodeException, IOException {
            try {
                return delegate.decode(stream);
            } catch (jakarta.websocket.DecodeException exception) {
                throw WebSocketShim.<javax.websocket.DecodeException>of(exception);
            }
        }

        @Override
        public void init(javax.websocket.EndpointConfig config) {
            delegate.init(config);
        }

        @Override
        public void init(jakarta.websocket.EndpointConfig config) {
            delegate.init(config);
        }

        @Override
        public void destroy() {
            delegate.destroy();
        }
    }

    final class Decoder$Text<T> extends Shim.Delegate<jakarta.websocket.Decoder.Text<T>> implements javax.websocket.Decoder.Text<T> {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        Decoder$Text(jakarta.websocket.Decoder.Text<T> delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public T decode(String text) throws javax.websocket.DecodeException {
            try {
                return delegate.decode(text);
            } catch (jakarta.websocket.DecodeException exception) {
                throw WebSocketShim.<javax.websocket.DecodeException>of(exception);
            }
        }
        @Override
        public boolean willDecode(String text) {
            return delegate.willDecode(text);
        }

        @Override
        public void init(javax.websocket.EndpointConfig config) {
            delegate.init(config);
        }

        @Override
        public void init(jakarta.websocket.EndpointConfig config) {
            delegate.init(config);
        }

        @Override
        public void destroy() {
            delegate.destroy();
        }
    }

    final class Decoder$TextStream<T> extends Shim.Delegate<jakarta.websocket.Decoder.TextStream<T>> implements javax.websocket.Decoder.TextStream<T> {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        Decoder$TextStream(jakarta.websocket.Decoder.TextStream<T> delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public T decode(Reader reader) throws javax.websocket.DecodeException, IOException {
            try {
                return delegate.decode(reader);
            } catch (jakarta.websocket.DecodeException exception) {
                throw WebSocketShim.<javax.websocket.DecodeException>of(exception);
            }
        }

        @Override
        public void init(javax.websocket.EndpointConfig config) {
            delegate.init(config);
        }

        @Override
        public void init(jakarta.websocket.EndpointConfig config) {
            delegate.init(config);
        }

        @Override
        public void destroy() {
            delegate.destroy();
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

    final class Encoder extends Shim.Delegate<jakarta.websocket.Encoder> implements javax.websocket.Encoder {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        Encoder(jakarta.websocket.Encoder delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public void init(javax.websocket.EndpointConfig config) {
            delegate.init(config);
        }

        @Override
        public void init(jakarta.websocket.EndpointConfig config) {
            delegate.init(config);
        }

        @Override
        public void destroy() {
            delegate.destroy();
        }
    }

    final class Encoder$Binary<T> extends Shim.Delegate<jakarta.websocket.Encoder.Binary<T>> implements javax.websocket.Encoder.Binary<T> {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        Encoder$Binary(jakarta.websocket.Encoder.Binary<T> delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public ByteBuffer encode(T object) throws javax.websocket.EncodeException {
            try {
                return delegate.encode(object);
            } catch (jakarta.websocket.EncodeException exception) {
                throw WebSocketShim.<javax.websocket.EncodeException>of(exception);
            }
        }

        @Override
        public void init(javax.websocket.EndpointConfig config) {
            delegate.init(config);
        }

        @Override
        public void init(jakarta.websocket.EndpointConfig config) {
            delegate.init(config);
        }

        @Override
        public void destroy() {
            delegate.destroy();
        }
    }

    final class Encoder$BinaryStream<T> extends Shim.Delegate<jakarta.websocket.Encoder.BinaryStream<T>> implements javax.websocket.Encoder.BinaryStream<T> {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        Encoder$BinaryStream(jakarta.websocket.Encoder.BinaryStream<T> delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public void encode(T object, OutputStream stream) throws javax.websocket.EncodeException, IOException {
            try {
                delegate.encode(object, stream);
            } catch (jakarta.websocket.EncodeException exception) {
                throw WebSocketShim.<javax.websocket.EncodeException>of(exception);
            }
        }

        @Override
        public void init(javax.websocket.EndpointConfig config) {
            delegate.init(config);
        }

        @Override
        public void init(jakarta.websocket.EndpointConfig config) {
            delegate.init(config);
        }

        @Override
        public void destroy() {
            delegate.destroy();
        }
    }

    final class Encoder$Text<T> extends Shim.Delegate<jakarta.websocket.Encoder.Text<T>> implements javax.websocket.Encoder.Text<T> {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        Encoder$Text(jakarta.websocket.Encoder.Text<T> delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public String encode(T object) throws javax.websocket.EncodeException {
            try {
                return delegate.encode(object);
            } catch (jakarta.websocket.EncodeException exception) {
                throw WebSocketShim.<javax.websocket.EncodeException>of(exception);
            }
        }

        @Override
        public void init(javax.websocket.EndpointConfig config) {
            delegate.init(config);
        }

        @Override
        public void init(jakarta.websocket.EndpointConfig config) {
            delegate.init(config);
        }

        @Override
        public void destroy() {
            delegate.destroy();
        }
    }

    final class Encoder$TextStream<T> extends Shim.Delegate<jakarta.websocket.Encoder.TextStream<T>> implements javax.websocket.Encoder.TextStream<T> {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        Encoder$TextStream(jakarta.websocket.Encoder.TextStream<T> delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public void encode(T object, Writer writer) throws javax.websocket.EncodeException, IOException {
            try {
                delegate.encode(object, writer);
            } catch (jakarta.websocket.EncodeException exception) {
                throw WebSocketShim.<javax.websocket.EncodeException>of(exception);
            }
        }

        @Override
        public void init(javax.websocket.EndpointConfig config) {
            delegate.init(config);
        }

        @Override
        public void init(jakarta.websocket.EndpointConfig config) {
            delegate.init(config);
        }

        @Override
        public void destroy() {
            delegate.destroy();
        }
    }

    final class Endpoint extends javax.websocket.Endpoint {
        private final jakarta.websocket.Endpoint delegate;

        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        Endpoint(jakarta.websocket.Endpoint delegate) {
            this.delegate = delegate;
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public void onOpen(javax.websocket.Session session, javax.websocket.EndpointConfig config) {
            delegate.onOpen(session, config);
        }

        @Override
        public void onOpen(jakarta.websocket.Session session, jakarta.websocket.EndpointConfig config) {
            delegate.onOpen(session, config);
        }

        @Override
        public void onClose(javax.websocket.Session session, javax.websocket.CloseReason closeReason) {
            delegate.onClose(session, closeReason);
        }

        @Override
        public void onClose(jakarta.websocket.Session session, jakarta.websocket.CloseReason closeReason) {
            delegate.onClose(session, closeReason);
        }

        @Override
        public void onError(javax.websocket.Session session, Throwable cause) {
            delegate.onError(session, cause);
        }

        @Override
        public void onError(jakarta.websocket.Session session, Throwable cause) {
            delegate.onError(session, cause);
        }
    }

    final class EndpointConfig extends Shim.Delegate<jakarta.websocket.EndpointConfig> implements javax.websocket.EndpointConfig {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        EndpointConfig(jakarta.websocket.EndpointConfig delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public List getEncoders() {
            return WebSocketShim
                .<javax.websocket.Encoder>of(delegate.getEncoders())
                .collect(Collectors.toList());
        }

        @Override
        public List getDecoders() {
            return WebSocketShim
                .<javax.websocket.Decoder>of(delegate.getDecoders())
                .collect(Collectors.toList());
        }

        @Override
        public Map<String, Object> getUserProperties() {
            return delegate.getUserProperties();
        }
    }

    final class Extension extends Shim.Delegate<jakarta.websocket.Extension> implements javax.websocket.Extension {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        Extension(jakarta.websocket.Extension delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public String getName() {
            return delegate.getName();
        }

        @Override
        public List getParameters() {
            return WebSocketShim
                .<javax.websocket.Extension.Parameter>of(delegate.getParameters())
                .collect(Collectors.toList());
        }
    }

    final class Extension$Parameter extends Shim.Delegate<jakarta.websocket.Extension.Parameter> implements javax.websocket.Extension.Parameter {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        Extension$Parameter(jakarta.websocket.Extension.Parameter delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public String getName() {
            return delegate.getName();
        }

        @Override
        public String getValue() {
            return delegate.getValue();
        }
    }

    final class HandshakeRequest extends Shim.Delegate<jakarta.websocket.server.HandshakeRequest> implements javax.websocket.server.HandshakeRequest {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        HandshakeRequest(jakarta.websocket.server.HandshakeRequest delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public Map<String, List<String>> getHeaders() {
            return delegate.getHeaders();
        }

        @Override
        public Principal getUserPrincipal() {
            return delegate.getUserPrincipal();
        }

        @Override
        public URI getRequestURI() {
            return delegate.getRequestURI();
        }

        @Override
        public boolean isUserInRole(String role) {
            return delegate.isUserInRole(role);
        }

        @Override
        public Object getHttpSession() {
            return delegate.getHttpSession();
        }

        @Override
        public Map<String, List<String>> getParameterMap() {
            return delegate.getParameterMap();
        }

        @Override
        public String getQueryString() {
            return delegate.getQueryString();
        }
    }

    final class HandshakeResponse extends Shim.Delegate<jakarta.websocket.HandshakeResponse> implements javax.websocket.HandshakeResponse {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        HandshakeResponse(jakarta.websocket.HandshakeResponse delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public Map<String, List<String>> getHeaders() {
            return delegate.getHeaders();
        }
    }

    final class MessageHandler extends Shim.Delegate<jakarta.websocket.MessageHandler> implements javax.websocket.MessageHandler {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        MessageHandler(jakarta.websocket.MessageHandler delegate) {
            super(delegate);
        }
    }

    final class MessageHandler$Partial<T> extends Shim.Delegate<jakarta.websocket.MessageHandler.Partial<T>> implements javax.websocket.MessageHandler.Partial<T> {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        MessageHandler$Partial(jakarta.websocket.MessageHandler.Partial<T> delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public void onMessage(T partialMessage, boolean last) {
            delegate.onMessage(partialMessage, last);
        }
    }

    final class MessageHandler$Whole<T> extends Shim.Delegate<jakarta.websocket.MessageHandler.Whole<T>> implements javax.websocket.MessageHandler.Whole<T> {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        MessageHandler$Whole(jakarta.websocket.MessageHandler.Whole<T> delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public void onMessage(T message) {
            delegate.onMessage(message);
        }
    }

    final class PongMessage extends Shim.Delegate<jakarta.websocket.PongMessage> implements javax.websocket.PongMessage {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        PongMessage(jakarta.websocket.PongMessage delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public ByteBuffer getApplicationData() {
            return delegate.getApplicationData();
        }
    }

    final class RemoteEndpoint extends Shim.Delegate<jakarta.websocket.RemoteEndpoint> implements javax.websocket.RemoteEndpoint {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        RemoteEndpoint(jakarta.websocket.RemoteEndpoint delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public void setBatchingAllowed(boolean allowed) throws IOException {
            delegate.setBatchingAllowed(allowed);
        }

        @Override
        public boolean getBatchingAllowed() {
            return delegate.getBatchingAllowed();
        }

        @Override
        public void flushBatch() throws IOException {
            delegate.flushBatch();
        }

        @Override
        public void sendPing(ByteBuffer applicationData) throws IOException, IllegalArgumentException {
            delegate.sendPing(applicationData);
        }

        @Override
        public void sendPong(ByteBuffer applicationData) throws IOException, IllegalArgumentException {
            delegate.sendPong(applicationData);
        }
    }

    final class RemoteEndpoint$Async extends Shim.Delegate<jakarta.websocket.RemoteEndpoint.Async> implements javax.websocket.RemoteEndpoint.Async {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        RemoteEndpoint$Async(jakarta.websocket.RemoteEndpoint.Async delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public long getSendTimeout() {
            return delegate.getSendTimeout();
        }

        @Override
        public void setSendTimeout(long timeoutmillis) {
            delegate.setSendTimeout(timeoutmillis);
        }

        @Override
        public void sendText(String text, javax.websocket.SendHandler handler) {
            delegate.sendText(text, handler);
        }

        @Override
        public void sendText(String text, jakarta.websocket.SendHandler handler) {
            delegate.sendText(text, handler);
        }

        @Override
        public Future<Void> sendText(String text) {
            return delegate.sendText(text);
        }

        @Override
        public Future<Void> sendBinary(ByteBuffer data) {
            return delegate.sendBinary(data);
        }

        @Override
        public void sendBinary(ByteBuffer data, javax.websocket.SendHandler handler) {
            delegate.sendBinary(data, handler);
        }

        @Override
        public void sendBinary(ByteBuffer data, jakarta.websocket.SendHandler handler) {
            delegate.sendBinary(data, handler);
        }

        @Override
        public Future<Void> sendObject(Object data) {
            return delegate.sendObject(data);
        }

        @Override
        public void sendObject(Object data, javax.websocket.SendHandler handler) {
            delegate.sendObject(data, handler);
        }

        @Override
        public void sendObject(Object data, jakarta.websocket.SendHandler handler) {
            delegate.sendObject(data, handler);
        }

        @Override
        public void setBatchingAllowed(boolean allowed) throws IOException {
            delegate.setBatchingAllowed(allowed);
        }

        @Override
        public boolean getBatchingAllowed() {
            return delegate.getBatchingAllowed();
        }

        @Override
        public void flushBatch() throws IOException {
            delegate.flushBatch();
        }

        @Override
        public void sendPing(ByteBuffer applicationData) throws IOException, IllegalArgumentException {
            delegate.sendPing(applicationData);
        }

        @Override
        public void sendPong(ByteBuffer applicationData) throws IOException, IllegalArgumentException {
            delegate.sendPong(applicationData);
        }
    }

    final class RemoteEndpoint$Basic extends Shim.Delegate<jakarta.websocket.RemoteEndpoint.Basic> implements javax.websocket.RemoteEndpoint.Basic {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        RemoteEndpoint$Basic(jakarta.websocket.RemoteEndpoint.Basic delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public void sendText(String text) throws IOException {
            delegate.sendText(text);
        }

        @Override
        public void sendBinary(ByteBuffer data) throws IOException {
            delegate.sendBinary(data);
        }

        @Override
        public void sendText(String partialMessage, boolean isLast) throws IOException {
            delegate.sendText(partialMessage, isLast);
        }

        @Override
        public void sendBinary(ByteBuffer partialByte, boolean isLast) throws IOException {
            delegate.sendBinary(partialByte, isLast);
        }

        @Override
        public OutputStream getSendStream() throws IOException {
            return delegate.getSendStream();
        }

        @Override
        public Writer getSendWriter() throws IOException {
            return delegate.getSendWriter();
        }

        @Override
        public void sendObject(Object data) throws javax.websocket.EncodeException, IOException {
            try {
                delegate.sendObject(data);
            } catch (jakarta.websocket.EncodeException exception) {
                throw WebSocketShim.<javax.websocket.EncodeException>of(exception);
            }
        }

        @Override
        public void setBatchingAllowed(boolean allowed) throws IOException {
            delegate.setBatchingAllowed(allowed);
        }

        @Override
        public boolean getBatchingAllowed() {
            return delegate.getBatchingAllowed();
        }

        @Override
        public void flushBatch() throws IOException {
            delegate.flushBatch();
        }

        @Override
        public void sendPing(ByteBuffer applicationData) throws IOException, IllegalArgumentException {
            delegate.sendPing(applicationData);
        }

        @Override
        public void sendPong(ByteBuffer applicationData) throws IOException, IllegalArgumentException {
            delegate.sendPong(applicationData);
        }
    }

    final class SendHandler extends Shim.Delegate<jakarta.websocket.SendHandler> implements javax.websocket.SendHandler {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        SendHandler(jakarta.websocket.SendHandler delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public void onResult(javax.websocket.SendResult result) {
            delegate.onResult(result.getDelegate());
        }

        @Override
        public void onResult(jakarta.websocket.SendResult result) {
            delegate.onResult(result);
        }
    }

    final class SendResult extends javax.websocket.SendResult {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        SendResult(jakarta.websocket.SendResult delegate) {
            super(delegate);
        }
    }

    final class ServerApplicationConfig extends Shim.Delegate<jakarta.websocket.server.ServerApplicationConfig> implements javax.websocket.server.ServerApplicationConfig {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        ServerApplicationConfig(jakarta.websocket.server.ServerApplicationConfig delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public Set getEndpointConfigs(Set endpointClasses) {
            return WebSocketShim
                .<javax.websocket.server.ServerEndpointConfig>of(delegate.getEndpointConfigs(endpointClasses))
                .collect(Collectors.toCollection(LinkedHashSet::new));
        }

        @Override
        public Set<Class<?>> getAnnotatedEndpointClasses(Set<Class<?>> scanned) {
            return delegate.getAnnotatedEndpointClasses(scanned);
        }
    }

    final class ServerContainer extends Shim.Delegate<jakarta.websocket.server.ServerContainer> implements javax.websocket.server.ServerContainer {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        ServerContainer(jakarta.websocket.server.ServerContainer delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public void addEndpoint(Class<?> endpointClass) throws javax.websocket.DeploymentException {
            try {
                delegate.addEndpoint(endpointClass);
            } catch (jakarta.websocket.DeploymentException exception) {
                throw WebSocketShim.<javax.websocket.DeploymentException>of(exception);
            }
        }

        @Override
        public void addEndpoint(
            javax.websocket.server.ServerEndpointConfig endpointConfig
        ) throws javax.websocket.DeploymentException {
            try {
                delegate.addEndpoint(endpointConfig);
            } catch (jakarta.websocket.DeploymentException exception) {
                throw WebSocketShim.<javax.websocket.DeploymentException>of(exception);
            }
        }

        @Override
        public void addEndpoint(
            jakarta.websocket.server.ServerEndpointConfig endpointConfig
        ) throws javax.websocket.DeploymentException {
            try {
                delegate.addEndpoint(endpointConfig);
            } catch (jakarta.websocket.DeploymentException exception) {
                throw WebSocketShim.<javax.websocket.DeploymentException>of(exception);
            }
        }

        @Override
        public void upgradeHttpToWebSocket(
            Object httpServletRequest,
            Object httpServletResponse,
            javax.websocket.server.ServerEndpointConfig endpointConfig,
            Map<String, String> pathParameters
        ) throws javax.websocket.DeploymentException, IOException {
            try {
                delegate.upgradeHttpToWebSocket(httpServletRequest, httpServletResponse, endpointConfig, pathParameters);
            } catch (jakarta.websocket.DeploymentException exception) {
                throw WebSocketShim.<javax.websocket.DeploymentException>of(exception);
            }
        }

        @Override
        public void upgradeHttpToWebSocket(
            Object httpServletRequest,
            Object httpServletResponse,
            jakarta.websocket.server.ServerEndpointConfig endpointConfig,
            Map<String, String> pathParameters
        ) throws javax.websocket.DeploymentException, IOException {
            try {
                delegate.upgradeHttpToWebSocket(httpServletRequest, httpServletResponse, endpointConfig, pathParameters);
            } catch (jakarta.websocket.DeploymentException exception) {
                throw WebSocketShim.<javax.websocket.DeploymentException>of(exception);
            }
        }

        @Override
        public long getDefaultAsyncSendTimeout() {
            return delegate.getDefaultAsyncSendTimeout();
        }

        @Override
        public void setAsyncSendTimeout(long timeout) {
            delegate.setAsyncSendTimeout(timeout);
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
            return WebSocketShim
                .<javax.websocket.Extension>of(delegate.getInstalledExtensions())
                .collect(Collectors.toCollection(LinkedHashSet::new));
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
                throw WebSocketShim.<javax.websocket.DeploymentException>of(exception);
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
                throw WebSocketShim.<javax.websocket.DeploymentException>of(exception);
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
                throw WebSocketShim.<javax.websocket.DeploymentException>of(exception);
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
                throw WebSocketShim.<javax.websocket.DeploymentException>of(exception);
            }
        }

        @Override
        public javax.websocket.Session connectToServer(
            Object annotatedEndpointInstance,
            URI path
        ) throws javax.websocket.DeploymentException, IOException {
            try {
                return WebSocketShim.of(delegate.connectToServer(annotatedEndpointInstance, path));
            } catch (jakarta.websocket.DeploymentException exception) {
                throw WebSocketShim.<javax.websocket.DeploymentException>of(exception);
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
                throw WebSocketShim.<javax.websocket.DeploymentException>of(exception);
            }
        }
    }

    final class ServerEndpointConfig extends Shim.Delegate<jakarta.websocket.server.ServerEndpointConfig> implements javax.websocket.server.ServerEndpointConfig {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        ServerEndpointConfig(jakarta.websocket.server.ServerEndpointConfig delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public List getExtensions() {
            return WebSocketShim
                .<javax.websocket.Extension>of(delegate.getExtensions())
                .collect(Collectors.toList());
        }

        @Override
        public javax.websocket.server.ServerEndpointConfig.Configurator getConfigurator() {
            return WebSocketShim.of(delegate.getConfigurator());
        }

        @Override
        public Class<?> getEndpointClass() {
            return delegate.getEndpointClass();
        }

        @Override
        public String getPath() {
            return delegate.getPath();
        }

        @Override
        public List<String> getSubprotocols() {
            return delegate.getSubprotocols();
        }

        @Override
        public List getEncoders() {
            return delegate
                .getEncoders()
                .stream()
                .map(clazz -> WebSocketShim.<javax.websocket.Encoder>of(javax.websocket.Encoder.class, clazz))
                .collect(Collectors.toList());
        }

        @Override
        public List getDecoders() {
            return delegate
                .getDecoders()
                .stream()
                .map(clazz -> WebSocketShim.<javax.websocket.Decoder>of(javax.websocket.Decoder.class, clazz))
                .collect(Collectors.toList());
        }

        @Override
        public Map<String, Object> getUserProperties() {
            return delegate.getUserProperties();
        }
    }

    final class ServerEndpointConfig$Builder extends javax.websocket.server.ServerEndpointConfig.Builder {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        ServerEndpointConfig$Builder(jakarta.websocket.server.ServerEndpointConfig.Builder delegate) {
            super(delegate);
        }
    }

    final class ServerEndpointConfig$Configurator extends javax.websocket.server.ServerEndpointConfig.Configurator {
        private final jakarta.websocket.server.ServerEndpointConfig.Configurator delegate;

        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        ServerEndpointConfig$Configurator(jakarta.websocket.server.ServerEndpointConfig.Configurator delegate) {
            this.delegate = delegate;
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public javax.websocket.server.ServerEndpointConfig.Configurator getContainerDefaultConfigurator() {
            return WebSocketShim.of(delegate.getContainerDefaultConfigurator());
        }

        @Override
        public String getNegotiatedSubprotocol(List<String> supported, List<String> requested) {
            return delegate.getNegotiatedSubprotocol(supported, requested);
        }

        @Override
        public List<javax.websocket.Extension> getNegotiatedExtensions(List installed, List requested) {
            return WebSocketShim
                .<javax.websocket.Extension>of(delegate.getNegotiatedExtensions(installed, requested))
                .collect(Collectors.toList());
        }

        @Override
        public boolean checkOrigin(String originHeaderValue) {
            return delegate.checkOrigin(originHeaderValue);
        }

        @Override
        public void modifyHandshake(
            javax.websocket.server.ServerEndpointConfig endpointConfig,
            javax.websocket.server.HandshakeRequest request,
            javax.websocket.HandshakeResponse response
        ) {
            delegate.modifyHandshake(endpointConfig, request, response);
        }

        @Override
        public void modifyHandshake(
            jakarta.websocket.server.ServerEndpointConfig endpointConfig,
            jakarta.websocket.server.HandshakeRequest request,
            jakarta.websocket.HandshakeResponse response
        ) {
            delegate.modifyHandshake(endpointConfig, request, response);
        }

        @Override
        public <T> T getEndpointInstance(Class<T> endpointClass) throws InstantiationException {
            return delegate.getEndpointInstance(endpointClass);
        }
    }

    final class Session extends Shim.Delegate<jakarta.websocket.Session> implements javax.websocket.Session {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        Session(jakarta.websocket.Session delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public javax.websocket.WebSocketContainer getContainer() {
            return WebSocketShim.of(delegate.getContainer());
        }

        @Override
        public void addMessageHandler(javax.websocket.MessageHandler handler) throws IllegalStateException {
            delegate.addMessageHandler(handler);
        }

        @Override
        public void addMessageHandler(jakarta.websocket.MessageHandler handler) throws IllegalStateException {
            delegate.addMessageHandler(handler);
        }

        @Override
        public <T> void addMessageHandler(Class<T> clazz, javax.websocket.MessageHandler.Whole<T> handler) {
            delegate.addMessageHandler(clazz, handler);
        }

        @Override
        public <T> void addMessageHandler(Class<T> clazz, jakarta.websocket.MessageHandler.Whole<T> handler) {
            delegate.addMessageHandler(clazz, handler);
        }

        @Override
        public <T> void addMessageHandler(Class<T> clazz, javax.websocket.MessageHandler.Partial<T> handler) {
            delegate.addMessageHandler(clazz, handler);
        }

        @Override
        public <T> void addMessageHandler(Class<T> clazz, jakarta.websocket.MessageHandler.Partial<T> handler) {
            delegate.addMessageHandler(clazz, handler);
        }

        @Override
        public Set getMessageHandlers() {
            return WebSocketShim
                .<javax.websocket.MessageHandler>of(delegate.getMessageHandlers())
                .collect(Collectors.toCollection(LinkedHashSet::new));
        }

        @Override
        public void removeMessageHandler(javax.websocket.MessageHandler handler) {
            delegate.removeMessageHandler(handler);
        }

        @Override
        public void removeMessageHandler(jakarta.websocket.MessageHandler handler) {
            delegate.removeMessageHandler(handler);
        }

        @Override
        public String getProtocolVersion() {
            return delegate.getProtocolVersion();
        }

        @Override
        public String getNegotiatedSubprotocol() {
            return delegate.getNegotiatedSubprotocol();
        }

        @Override
        public List getNegotiatedExtensions() {
            return WebSocketShim
                .<javax.websocket.Extension>of(delegate.getNegotiatedExtensions())
                .collect(Collectors.toList());
        }

        @Override
        public boolean isSecure() {
            return delegate.isSecure();
        }

        @Override
        public boolean isOpen() {
            return delegate.isOpen();
        }

        @Override
        public long getMaxIdleTimeout() {
            return delegate.getMaxIdleTimeout();
        }

        @Override
        public void setMaxIdleTimeout(long milliseconds) {
            delegate.setMaxIdleTimeout(milliseconds);
        }

        @Override
        public void setMaxBinaryMessageBufferSize(int length) {
            delegate.setMaxBinaryMessageBufferSize(length);
        }

        @Override
        public int getMaxBinaryMessageBufferSize() {
            return delegate.getMaxBinaryMessageBufferSize();
        }

        @Override
        public void setMaxTextMessageBufferSize(int length) {
            delegate.setMaxTextMessageBufferSize(length);
        }

        @Override
        public int getMaxTextMessageBufferSize() {
            return delegate.getMaxTextMessageBufferSize();
        }

        @Override
        public javax.websocket.RemoteEndpoint.Async getAsyncRemote() {
            return WebSocketShim.of(delegate.getAsyncRemote());
        }

        @Override
        public javax.websocket.RemoteEndpoint.Basic getBasicRemote() {
            return WebSocketShim.of(delegate.getBasicRemote());
        }

        @Override
        public String getId() {
            return delegate.getId();
        }

        @Override
        public void close() throws IOException {
            delegate.close();
        }

        @Override
        public void close(javax.websocket.CloseReason reason) throws IOException {
            delegate.close(reason);
        }

        @Override
        public void close(jakarta.websocket.CloseReason closeReason) throws IOException {
            delegate.close(closeReason);
        }

        @Override
        public URI getRequestURI() {
            return delegate.getRequestURI();
        }

        @Override
        public Map<String, List<String>> getRequestParameterMap() {
            return delegate.getRequestParameterMap();
        }

        @Override
        public String getQueryString() {
            return delegate.getQueryString();
        }

        @Override
        public Map<String, String> getPathParameters() {
            return delegate.getPathParameters();
        }

        @Override
        public Map<String, Object> getUserProperties() {
            return delegate.getUserProperties();
        }

        @Override
        public Principal getUserPrincipal() {
            return delegate.getUserPrincipal();
        }

        @Override
        public Set getOpenSessions() {
            return WebSocketShim
                .<javax.websocket.Session>of(delegate.getOpenSessions())
                .collect(Collectors.toCollection(LinkedHashSet::new));
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
        public void setAsyncSendTimeout(long timeout) {
            delegate.setAsyncSendTimeout(timeout);
        }

        @Override
        public javax.websocket.Session connectToServer(
            Object annotatedEndpointInstance,
            URI path
        ) throws javax.websocket.DeploymentException, IOException {
            try {
                return WebSocketShim.of(delegate.connectToServer(annotatedEndpointInstance, path));
            } catch (jakarta.websocket.DeploymentException exception) {
                throw WebSocketShim.<javax.websocket.DeploymentException>of(exception);
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
                throw WebSocketShim.<javax.websocket.DeploymentException>of(exception);
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
                throw WebSocketShim.<javax.websocket.DeploymentException>of(exception);
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
                throw WebSocketShim.<javax.websocket.DeploymentException>of(exception);
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
                throw WebSocketShim.<javax.websocket.DeploymentException>of(exception);
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
                throw WebSocketShim.<javax.websocket.DeploymentException>of(exception);
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
            return WebSocketShim
                .<javax.websocket.Extension>of(delegate.getInstalledExtensions())
                .collect(Collectors.toCollection(LinkedHashSet::new));
        }
    }
}
