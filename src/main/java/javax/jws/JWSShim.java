package javax.jws;

import javax.Shim;
import javax.jws.soap.SOAPBinding;
import java.util.stream.Stream;

/**
 * @deprecated Use {@link jakarta.jws} instead.
 */
@Deprecated(since = "jakarta.jws")
public interface JWSShim extends Shim {
    //==================================================================================================================
    // Factory Methods
    //==================================================================================================================

    static <S> S of(Object object) {
        if (object == null || object instanceof JWSShim) {
            return S(object);
        } else if (object instanceof jakarta.jws.HandlerChain) {
            return S(new Facades.HandlerChain(S(object)));
        } else if (object instanceof jakarta.jws.soap.InitParam) {
            return S(new Facades.InitParam(S(object)));
        } else if (object instanceof jakarta.jws.Oneway) {
            return S(new Facades.Oneway(S(object)));
        } else if (object instanceof jakarta.jws.soap.SOAPBinding) {
            return S(new Facades.SOAPBinding(S(object)));
        } else if (object instanceof jakarta.jws.soap.SOAPBinding.ParameterStyle) {
            return S(SOAPBinding.ParameterStyle.valueOf(object.toString()));
        } else if (object instanceof jakarta.jws.soap.SOAPBinding.Style) {
            return S(SOAPBinding.Style.valueOf(object.toString()));
        } else if (object instanceof jakarta.jws.soap.SOAPBinding.Use) {
            return S(SOAPBinding.Use.valueOf(object.toString()));
        } else if (object instanceof jakarta.jws.soap.SOAPMessageHandler) {
            return S(new Facades.SOAPMessageHandler(S(object)));
        } else if (object instanceof jakarta.jws.soap.SOAPMessageHandlers) {
            return S(new Facades.SOAPMessageHandlers(S(object)));
        } else if (object instanceof jakarta.jws.WebMethod) {
            return S(new Facades.WebMethod(S(object)));
        } else if (object instanceof jakarta.jws.WebParam) {
            return S(new Facades.WebParam(S(object)));
        } else if (object instanceof jakarta.jws.WebParam.Mode) {
            return S(WebParam.Mode.valueOf(object.toString()));
        } else if (object instanceof jakarta.jws.WebResult) {
            return S(new Facades.WebResult(S(object)));
        } else if (object instanceof jakarta.jws.WebService) {
            return S(new Facades.WebService(S(object)));
        }

        throw new UnsupportedOperationException("Unknown type: " + object.getClass().getName());
    }

    static <S> Class<? extends S> of(Class<S> shimType, Class<?> interfaceType) {
        return Shim.of(shimType, interfaceType);
    }

    static <S> Stream<S> of(Object[] objects) {
        return Shim.of(JWSShim::of, objects);
    }

    static <S> Stream<S> of(Iterable<?> objects) {
        return Shim.of(JWSShim::of, objects);
    }

    //==================================================================================================================
    // Private Helper Methods
    //==================================================================================================================

    @SuppressWarnings("unchecked")
    private static <S> S S(Object object) {
        return (S) object;
    }
}
