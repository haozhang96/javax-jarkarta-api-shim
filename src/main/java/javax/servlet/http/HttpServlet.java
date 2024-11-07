package javax.servlet.http;

import javax.servlet.*;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.MessageFormat;
import java.util.Collection;
import java.util.Collections;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.stream.Collectors;
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
    private static final String PACKAGE_NAME = jakarta.servlet.http.HttpServlet.class.getPackageName();
    private static final ResourceBundle MESSAGES  = ResourceBundle.getBundle(PACKAGE_NAME + ".LocalStrings");
    private static final Collection<String> BAD_REQUEST_PROTOCOLS = Set.of("HTTP/0.9", "HTTP/1.0");
    private static final String CR_LF = "\r\n";

    private final String allowedMethods = getAllowedMethods();

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
            case HttpMethods.GET: {
                final var lastModified = getLastModified(request);
                if (lastModified == -1L) {
                    doGet(request, response);
                } else if (request.getDateHeader(jakarta.ws.rs.core.HttpHeaders.IF_MODIFIED_SINCE) < lastModified) {
                    updateLastModified(request, response);
                    doGet(request, response);
                } else {
                    response.setStatus(HttpServletResponse.SC_NOT_MODIFIED);
                }
                break;
            }

            case HttpMethods.HEAD: updateLastModified(request, response); doHead(request, response); break;
            case HttpMethods.POST: doPost(request, response); break;
            case HttpMethods.PUT: doPut(request, response); break;
            case HttpMethods.DELETE: doDelete(request, response); break;
            case HttpMethods.OPTIONS: doOptions(request, response); break;
            case HttpMethods.TRACE: doTrace(request, response); break;
            default: response.sendError(HttpServletResponse.SC_NOT_IMPLEMENTED, unsupported(null, request.getMethod()));
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
        if (isLegacyDoHead()) {
            try {
                final var wrapperClass = Class.forName(PACKAGE_NAME + ".NoBodyResponse");
                final var wrapperConstructor =
                    wrapperClass.getDeclaredConstructor(jakarta.servlet.http.HttpServletResponse.class);
                if (wrapperConstructor.trySetAccessible()) {
                    final var wrapper = wrapperConstructor.newInstance(response);
                    doGet(request, ServletShim.of(wrapper));

                    final var method = wrapperClass.getDeclaredMethod("setContentLength");
                    if (method.trySetAccessible()) {
                        method.invoke(wrapper);
                        return;
                    }
                }
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
        response.setHeader(jakarta.ws.rs.core.HttpHeaders.ALLOW, allowedMethods);
    }

    /**
     * @see jakarta.servlet.http.HttpServlet#doTrace(jakarta.servlet.http.HttpServletRequest, jakarta.servlet.http.HttpServletResponse)
     */
    protected void doTrace(
        HttpServletRequest request,
        HttpServletResponse response
    ) throws ServletException, IOException {
        var payload =
            new StringBuilder(HttpMethods.TRACE)
                .append(' ')
                .append(request.getRequestURI())
                .append(' ')
                .append(request.getProtocol());

        for (final var headerName : Collections.list(request.getHeaderNames())) {
            payload
                .append(CR_LF)
                .append(headerName)
                .append(": ")
                .append(request.getHeader(headerName));
        }
        payload.append(CR_LF);

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
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        if (!(request instanceof HttpServletRequest && response instanceof HttpServletResponse)) {
            throw new ServletException("non-HTTP request or response");
        }

        service((HttpServletRequest) request, (HttpServletResponse) response);
    }

    //==================================================================================================================
    // Private Helpers
    //==================================================================================================================

    private void doUnsupported(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendError(
            BAD_REQUEST_PROTOCOLS.contains(request.getProtocol())
                ? HttpServletResponse.SC_BAD_REQUEST
                : HttpServletResponse.SC_METHOD_NOT_ALLOWED,
            unsupported(request.getMethod())
        );
    }

    private String unsupported(String method, Object... arguments) {
        final var key = String.format("http.method_%snot_implemented", method != null ? method.toLowerCase() + "_" : "");
        return MessageFormat.format(MESSAGES.getString(key), arguments);
    }

    private String getAllowedMethods() {
        return getDeclaredMethods(getClass())
            .filter(method -> method.getName().startsWith("do"))
            .map(method -> method.getName().substring(2).toUpperCase())
            .flatMap(method -> {
                switch (method) {
                    case HttpMethods.GET: return Stream.of(method, HttpMethods.HEAD);
                    case HttpMethods.HEAD:
                    case HttpMethods.POST:
                    case HttpMethods.PUT:
                    case HttpMethods.DELETE:
                    case HttpMethods.OPTIONS:
                    case HttpMethods.TRACE: return Stream.of(method);
                    default: return Stream.empty();
                }
            })
            .distinct()
            .sorted()
            .collect(Collectors.joining(", "));
    }

    private void updateLastModified(HttpServletRequest request, HttpServletResponse response) {
        final var lastModified = getLastModified(request);
        if (!response.containsHeader(jakarta.ws.rs.core.HttpHeaders.LAST_MODIFIED) && lastModified >= 0L) {
            response.setDateHeader(jakarta.ws.rs.core.HttpHeaders.LAST_MODIFIED, lastModified);
        }
    }

    private boolean isLegacyDoHead() {
        return Boolean.parseBoolean(getServletConfig().getInitParameter(LEGACY_DO_HEAD))
            || Boolean.parseBoolean(getServletConfig().getInitParameter(LEGACY_DO_HEAD.replace("jakarta", "javax")));
    }

    private Stream<Method> getDeclaredMethods(Class<?> clazz) {
        final var superClass = clazz.getSuperclass();
        final var methods = Stream.of(clazz.getDeclaredMethods());
        return superClass == HttpServlet.class ? methods : Stream.concat(methods, getDeclaredMethods(superClass));
    }

    @SuppressWarnings("ClassExplicitlyAnnotation")
    private interface HttpMethods extends jakarta.ws.rs.HttpMethod {
        String TRACE = "TRACE";
    }
}
