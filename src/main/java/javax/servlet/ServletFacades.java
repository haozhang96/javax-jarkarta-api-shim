package javax.servlet;

import jakarta.annotation.Nonnull;
import jakarta.servlet.Servlet;

import java.io.IOException;

@SuppressWarnings("deprecation")
interface ServletFacades {
    final class Servlet implements javax.servlet.Servlet {
        @Nonnull
        private final jakarta.servlet.Servlet delegate;

        @Override
        public void init(@Nonnull ServletConfig config) throws ServletException {
            try {
                delegate.init(config);
            } catch (jakarta.servlet.ServletException exception) {
                throw of(exception);
            }
        }

        @Override
        public void service(@Nonnull ServletRequest request, @Nonnull ServletResponse response) throws ServletException, IOException {

        }

        @Override
        public ServletConfig getServletConfig() {
            return null;
        }

        @Override
        public String getServletInfo() {
            return "";
        }

        @Override
        public void destroy() {

        }
    }

    @Nonnull
    private static ServletException of(@Nonnull jakarta.servlet.ServletException exception) {
        return new ServletException(exception);
    }
}
