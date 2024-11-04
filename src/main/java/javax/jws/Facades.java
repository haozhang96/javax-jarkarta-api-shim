package javax.jws;

import javax.Shim;

/**
 * This interface contains {@link jakarta.jws}-to-{@link javax.jws} facades used for wrapping Jakarta Web Services
 *   Metadata objects into their Java Web Services Metadata counterparts.
 *
 * @deprecated Use {@link jakarta.jws} instead.
 */
@Deprecated(since = "jakarta.jws")
@SuppressWarnings("all")
interface Facades {
    //==================================================================================================================
    // Annotations
    //==================================================================================================================

    final class HandlerChain extends Shim.Delegate.Annotation<jakarta.jws.HandlerChain> implements javax.jws.HandlerChain, JWSShim {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        HandlerChain(jakarta.jws.HandlerChain delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public String file() {
            return delegate.file();
        }

        @Override
        public String name() {
            return delegate.name();
        }
    }

    final class InitParam extends Shim.Delegate.Annotation<jakarta.jws.soap.InitParam> implements javax.jws.soap.InitParam, JWSShim {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        InitParam(jakarta.jws.soap.InitParam delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public String name() {
            return delegate.name();
        }

        @Override
        public String value() {
            return delegate.value();
        }
    }

    final class Oneway extends Shim.Delegate.Annotation<jakarta.jws.Oneway> implements javax.jws.Oneway, JWSShim {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        Oneway(jakarta.jws.Oneway delegate) {
            super(delegate);
        }
    }

    final class SOAPBinding extends Shim.Delegate.Annotation<jakarta.jws.soap.SOAPBinding> implements javax.jws.soap.SOAPBinding, JWSShim {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        SOAPBinding(jakarta.jws.soap.SOAPBinding delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public Style style() {
            return JWSShim.of(delegate.style());
        }

        @Override
        public Use use() {
            return JWSShim.of(delegate.use());
        }

        @Override
        public ParameterStyle parameterStyle() {
            return JWSShim.of(delegate.parameterStyle());
        }
    }

    final class SOAPMessageHandler extends Shim.Delegate.Annotation<jakarta.jws.soap.SOAPMessageHandler> implements javax.jws.soap.SOAPMessageHandler, JWSShim {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        SOAPMessageHandler(jakarta.jws.soap.SOAPMessageHandler delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public String name() {
            return delegate.name();
        }

        @Override
        public String className() {
            return delegate.className();
        }

        @Override
        public javax.jws.soap.InitParam[] initParams() {
            return JWSShim
                .<javax.jws.soap.InitParam>of(delegate.initParams())
                .toArray(javax.jws.soap.InitParam[]::new);
        }

        @Override
        public String[] roles() {
            return delegate.roles();
        }

        @Override
        public String[] headers() {
            return delegate.headers();
        }
    }

    final class SOAPMessageHandlers extends Shim.Delegate.Annotation<jakarta.jws.soap.SOAPMessageHandlers> implements javax.jws.soap.SOAPMessageHandlers, JWSShim {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        SOAPMessageHandlers(jakarta.jws.soap.SOAPMessageHandlers delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================


        @Override
        public javax.jws.soap.SOAPMessageHandler[] value() {
            return JWSShim
                .<javax.jws.soap.SOAPMessageHandler>of(delegate.value())
                .toArray(javax.jws.soap.SOAPMessageHandler[]::new);
        }
    }


    final class WebMethod extends Shim.Delegate.Annotation<jakarta.jws.WebMethod> implements javax.jws.WebMethod, JWSShim {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        WebMethod(jakarta.jws.WebMethod delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public String operationName() {
            return delegate.operationName();
        }

        @Override
        public String action() {
            return delegate.action();
        }

        @Override
        public boolean exclude() {
            return delegate.exclude();
        }
    }

    final class WebParam extends Shim.Delegate.Annotation<jakarta.jws.WebParam> implements javax.jws.WebParam, JWSShim {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        WebParam(jakarta.jws.WebParam delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public String name() {
            return delegate.name();
        }

        @Override
        public String partName() {
            return delegate.partName();
        }

        @Override
        public String targetNamespace() {
            return delegate.targetNamespace();
        }

        @Override
        public Mode mode() {
            return JWSShim.of(delegate.mode());
        }

        @Override
        public boolean header() {
            return delegate.header();
        }
    }

    final class WebResult extends Shim.Delegate.Annotation<jakarta.jws.WebResult> implements javax.jws.WebResult, JWSShim {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        WebResult(jakarta.jws.WebResult delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public String name() {
            return delegate.name();
        }

        @Override
        public String partName() {
            return delegate.partName();
        }

        @Override
        public String targetNamespace() {
            return delegate.targetNamespace();
        }

        @Override
        public boolean header() {
            return delegate.header();
        }
    }

    final class WebService extends Shim.Delegate.Annotation<jakarta.jws.WebService> implements javax.jws.WebService, JWSShim {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        WebService(jakarta.jws.WebService delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public String name() {
            return delegate.name();
        }

        @Override
        public String targetNamespace() {
            return delegate.targetNamespace();
        }

        @Override
        public String serviceName() {
            return delegate.serviceName();
        }

        @Override
        public String portName() {
            return delegate.portName();
        }

        @Override
        public String wsdlLocation() {
            return delegate.wsdlLocation();
        }

        @Override
        public String endpointInterface() {
            return delegate.endpointInterface();
        }
    }
}
