package javax.servlet.http;

import jakarta.ws.rs.HttpMethod;
import jakarta.ws.rs.core.HttpHeaders;

import javax.servlet.*;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.MessageFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.stream.Stream;

/**
 * @deprecated Use {@link jakarta.servlet.http.HttpServlet} instead.
 */
@Deprecated(since = "jakarta.servlet.http.HttpServlet")
@SuppressWarnings("JavadocReference")
public abstract class HttpServlet extends GenericServlet {
    /**
     * @see jakarta.servlet.http.HttpServlet#LEGACY_DO_HEAD
     */
    @SuppressWarnings("removal")
    public static final String LEGACY_DO_HEAD = jakarta.servlet.http.HttpServlet.LEGACY_DO_HEAD;

    private static final long serialVersionUID = 8466325577512134784L; // Use the ID from jakarta.servlet.
    private static final String PACKAGE_NAME = "jakarta.servlet.http";
    private static final ResourceBundle MESSAGES  = ResourceBundle.getBundle(PACKAGE_NAME + ".LocalStrings");
    private static final Set<String> BAD_REQUEST_PROTOCOLS = Set.of("HTTP/0.9", "HTTP/1.0");
    private static final String CRLF = "\r\n";

    //==================================================================================================================
    // HttpServlet Implementation Methods
    //==================================================================================================================

    /**
     * @see jakarta.servlet.http.HttpServlet#service(jakarta.servlet.http.HttpServletRequest, jakarta.servlet.http.HttpServletResponse)
     */
    protected void service(
        HttpServletRequest request,
        HttpServletResponse response
    ) throws ServletException, IOException {
        switch (request.getMethod()) {
            case HttpMethod.GET: {
                final var lastModified = getLastModified(request);
                if (lastModified == -1L) {
                    doGet(request, response);
                } else if (request.getDateHeader(HttpHeaders.IF_MODIFIED_SINCE) < lastModified) {
                    updateLastModified(request, response);
                    doGet(request, response);
                } else {
                    response.setStatus(HttpServletResponse.SC_NOT_MODIFIED);
                }
                break;
            }

            case HttpMethod.HEAD: updateLastModified(request, response); doHead(request, response); break;
            case HttpMethod.POST: doPost(request, response); break;
            case HttpMethod.PUT: doPut(request, response); break;
            case HttpMethod.DELETE: doDelete(request, response); break;
            case HttpMethod.OPTIONS: doOptions(request, response); break;
            case "TRACE": doTrace(request, response); break;
            default: response.sendError(HttpServletResponse.SC_NOT_IMPLEMENTED, unsupportedMethod(null, request.getMethod()));
        }
    }

    /**
     * @see jakarta.servlet.http.HttpServlet#doGet(jakarta.servlet.http.HttpServletRequest, jakarta.servlet.http.HttpServletResponse)
     */
    protected void doGet(
        HttpServletRequest request,
        HttpServletResponse response
    ) throws ServletException, IOException {
        doUnsupported(request, response);
    }

    /**
     * @see jakarta.servlet.http.HttpServlet#doHead(jakarta.servlet.http.HttpServletRequest, jakarta.servlet.http.HttpServletResponse)
     */
    protected void doHead(
        HttpServletRequest request,
        HttpServletResponse response
    ) throws ServletException, IOException {
        if (Boolean.parseBoolean(getServletConfig().getInitParameter(LEGACY_DO_HEAD))) {
            try {
                final var wrapperClass = Class.forName(PACKAGE_NAME + ".NoBodyResponse");
                final var wrapper =
                    wrapperClass
                        .getDeclaredConstructor(jakarta.servlet.http.HttpServletResponse.class)
                        .newInstance(response);
                doGet(request, ServletShim.of(wrapper));

                final var method = wrapperClass.getDeclaredMethod("setContentLength");
                if (method.trySetAccessible()) {
                    method.invoke(wrapper);
                }

                return;
            } catch (ReflectiveOperationException exception) {
                // Fall through to non-legacy behavior.
            }
        }

        doGet(request, response);
    }

    /**
     * @see jakarta.servlet.http.HttpServlet#doPost(jakarta.servlet.http.HttpServletRequest, jakarta.servlet.http.HttpServletResponse)
     */
    protected void doPost(
        HttpServletRequest request,
        HttpServletResponse response
    ) throws ServletException, IOException {
        doUnsupported(request, response);
    }

    /**
     * @see jakarta.servlet.http.HttpServlet#doPut(jakarta.servlet.http.HttpServletRequest, jakarta.servlet.http.HttpServletResponse)
     */
    protected void doPut(
        HttpServletRequest request,
        HttpServletResponse response
    ) throws ServletException, IOException {
        doUnsupported(request, response);
    }

    /**
     * @see jakarta.servlet.http.HttpServlet#doDelete(jakarta.servlet.http.HttpServletRequest, jakarta.servlet.http.HttpServletResponse)
     */
    protected void doDelete(
        HttpServletRequest request,
        HttpServletResponse response
    ) throws ServletException, IOException {
        doUnsupported(request, response);
    }

    /**
     * @see jakarta.servlet.http.HttpServlet#doOptions(jakarta.servlet.http.HttpServletRequest, jakarta.servlet.http.HttpServletResponse)
     */
    protected void doOptions(
        HttpServletRequest request,
        HttpServletResponse response
    ) throws ServletException, IOException {
        Set<String> allowedMethods = new HashSet<>(8);

        for (final var method : (Iterable<Method>) getDeclaredMethods(getClass()).distinct()::iterator) {
            switch (method.getName()) {
                case "doGet": allowedMethods.addAll(Set.of(HttpMethod.GET, HttpMethod.HEAD)); break;
                case "doPost": allowedMethods.add(HttpMethod.POST); break;
                case "doPut": allowedMethods.add(HttpMethod.PUT); break;
                case "doDelete": allowedMethods.add(HttpMethod.DELETE); break;
            }
        }

        response.setHeader(HttpHeaders.ALLOW, String.join(", ", allowedMethods));
    }

    /**
     * @see jakarta.servlet.http.HttpServlet#doTrace(jakarta.servlet.http.HttpServletRequest, jakarta.servlet.http.HttpServletResponse)
     */
    protected void doTrace(
        HttpServletRequest request,
        HttpServletResponse response
    ) throws ServletException, IOException {
        var payload = new StringBuilder(String.format("TRACE %s %s", request.getRequestURI(), request.getProtocol()));

        for (final var headerName : Collections.list(request.getHeaderNames())) {
            payload.append(CRLF).append(headerName).append(": ").append(request.getHeader(headerName));
        }
        payload.append(CRLF);

        response.setContentType("message/http");
        response.setContentLength(payload.length());
        response.getOutputStream().print(payload.toString());
    }

    /**
     * @see jakarta.servlet.http.HttpServlet#getLastModified(jakarta.servlet.http.HttpServletRequest)
     */
    protected long getLastModified(HttpServletRequest request) {
        return -1L;
    }

    //==================================================================================================================
    // Servlet Implementation Methods
    //==================================================================================================================

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    public void service(
        ServletRequest request,
        ServletResponse response
    ) throws ServletException, IOException {
        if (!(request instanceof HttpServletRequest && response instanceof HttpServletResponse)) {
            throw new ServletException("non-HTTP request or response");
        }

        service((HttpServletRequest) request, (HttpServletResponse) response);
    }

    //==================================================================================================================
    // Private Helper Methods
    //==================================================================================================================

    private void doUnsupported(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendError(
            BAD_REQUEST_PROTOCOLS.contains(request.getProtocol())
                ? HttpServletResponse.SC_BAD_REQUEST
                : HttpServletResponse.SC_METHOD_NOT_ALLOWED,
            unsupportedMethod(request.getMethod())
        );
    }

    private String unsupportedMethod(String method, Object... arguments) {
        final var key = String.format("http.method_%snot_implemented", method != null ? method.toLowerCase() + "_" : "");
        return MessageFormat.format(MESSAGES.getString(key), arguments);
    }

    private Stream<Method> getDeclaredMethods(Class<?> clazz) {
        final var superClass = clazz.getSuperclass();
        final var methods = Stream.of(clazz.getDeclaredMethods());
        return superClass == HttpServlet.class ? methods : Stream.concat(methods, getDeclaredMethods(superClass));
    }

    private void updateLastModified(HttpServletRequest request, HttpServletResponse response) {
        final var lastModified = getLastModified(request);
        if (!response.containsHeader(HttpHeaders.LAST_MODIFIED) && lastModified >= 0L) {
            response.setDateHeader(HttpHeaders.LAST_MODIFIED, lastModified);
        }
    }
}
