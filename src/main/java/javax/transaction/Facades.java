package javax.transaction;

import javax.Shim;
import javax.transaction.xa.XAResource;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * This interface contains {@link jakarta.transaction}-to-{@link javax.transaction} facades used for wrapping Jakarta
 *   Transactions objects into their Java Transactions counterparts.
 *
 * @deprecated Use {@link jakarta.transaction} instead.
 */
@Deprecated(since = "jakarta.transaction")
@SuppressWarnings("all")
interface Facades {
    //==================================================================================================================
    // Annotations
    //==================================================================================================================

    //==================================================================================================================
    // Classes
    //==================================================================================================================

    final class HeuristicCommitException extends javax.transaction.HeuristicCommitException {
        private static final long serialVersionUID = -3977609782149921760L; // Use the ID from jakarta.transaction.

        private final jakarta.transaction.HeuristicCommitException delegate;

        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        HeuristicCommitException(jakarta.transaction.HeuristicCommitException delegate) {
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

    final class HeuristicMixedException extends javax.transaction.HeuristicMixedException {
        private static final long serialVersionUID = 2345014349685956666L; // Use the ID from jakarta.transaction.

        private final jakarta.transaction.HeuristicMixedException delegate;

        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        HeuristicMixedException(jakarta.transaction.HeuristicMixedException delegate) {
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

    final class HeuristicRollbackException extends javax.transaction.HeuristicRollbackException {
        private static final long serialVersionUID = -3483618944556408897L; // Use the ID from jakarta.transaction.

        private final jakarta.transaction.HeuristicRollbackException delegate;

        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        HeuristicRollbackException(jakarta.transaction.HeuristicRollbackException delegate) {
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

    final class InvalidTransactionException extends javax.transaction.InvalidTransactionException {
        private static final long serialVersionUID = 3597320220337691496L; // Use the ID from jakarta.transaction.

        private final jakarta.transaction.InvalidTransactionException delegate;

        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        InvalidTransactionException(jakarta.transaction.InvalidTransactionException delegate) {
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

    final class NotSupportedException extends javax.transaction.NotSupportedException {
        private static final long serialVersionUID = 56870312332816390L; // Use the ID from jakarta.transaction.

        private final jakarta.transaction.NotSupportedException delegate;

        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        NotSupportedException(jakarta.transaction.NotSupportedException delegate) {
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

    final class RollbackException extends javax.transaction.RollbackException {
        private static final long serialVersionUID = 4151607774785285395L; // Use the ID from jakarta.transaction.

        private final jakarta.transaction.RollbackException delegate;

        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        RollbackException(jakarta.transaction.RollbackException delegate) {
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

    final class Status extends Shim.Delegate<jakarta.transaction.Status> implements javax.transaction.Status {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        Status(jakarta.transaction.Status delegate) {
            super(delegate);
        }
    }

    final class Synchronization extends Shim.Delegate<jakarta.transaction.Synchronization> implements javax.transaction.Synchronization {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        Synchronization(jakarta.transaction.Synchronization delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public void beforeCompletion() {
            delegate.beforeCompletion();
        }

        @Override
        public void afterCompletion(int status) {
            delegate.afterCompletion(status);
        }
    }

    final class SystemException extends javax.transaction.SystemException {
        private static final long serialVersionUID = 839699079412719325L; // Use the ID from jakarta.transaction.

        private final jakarta.transaction.SystemException delegate;

        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        SystemException(jakarta.transaction.SystemException delegate) {
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

    final class Transaction extends Shim.Delegate<jakarta.transaction.Transaction> implements javax.transaction.Transaction {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        Transaction(jakarta.transaction.Transaction delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public void registerSynchronization(
            javax.transaction.Synchronization synchronization
        ) throws javax.transaction.RollbackException, javax.transaction.SystemException {
            try {
                delegate.registerSynchronization(synchronization);
            } catch (jakarta.transaction.RollbackException exception) {
                throw TransactionShim.<javax.transaction.RollbackException>of(exception);
            } catch (jakarta.transaction.SystemException exception) {
                throw TransactionShim.<javax.transaction.SystemException>of(exception);
            }
        }

        @Override
        public void registerSynchronization(
            jakarta.transaction.Synchronization synchronization
        ) throws javax.transaction.RollbackException, javax.transaction.SystemException {
            try {
                delegate.registerSynchronization(synchronization);
            } catch (jakarta.transaction.RollbackException exception) {
                throw TransactionShim.<javax.transaction.RollbackException>of(exception);
            } catch (jakarta.transaction.SystemException exception) {
                throw TransactionShim.<javax.transaction.SystemException>of(exception);
            }
        }

        @Override
        public void commit() throws javax.transaction.RollbackException, javax.transaction.HeuristicMixedException, javax.transaction.HeuristicRollbackException, javax.transaction.SystemException {
            try {
                delegate.commit();
            } catch (jakarta.transaction.RollbackException exception) {
                throw TransactionShim.<javax.transaction.RollbackException>of(exception);
            } catch (jakarta.transaction.HeuristicMixedException exception) {
                throw TransactionShim.<javax.transaction.HeuristicMixedException>of(exception);
            } catch (jakarta.transaction.HeuristicRollbackException exception) {
                throw TransactionShim.<javax.transaction.HeuristicRollbackException>of(exception);
            } catch (jakarta.transaction.SystemException exception) {
                throw TransactionShim.<javax.transaction.SystemException>of(exception);
            }
        }

        @Override
        public boolean delistResource(XAResource resource, int flag) throws javax.transaction.SystemException {
            try {
                return delegate.delistResource(resource, flag);
            } catch (jakarta.transaction.SystemException exception) {
                throw TransactionShim.<javax.transaction.SystemException>of(exception);
            }
        }

        @Override
        public boolean enlistResource(
            XAResource resource
        ) throws javax.transaction.RollbackException, javax.transaction.SystemException {
            try {
                return delegate.enlistResource(resource);
            } catch (jakarta.transaction.RollbackException exception) {
                throw TransactionShim.<javax.transaction.RollbackException>of(exception);
            } catch (jakarta.transaction.SystemException exception) {
                throw TransactionShim.<javax.transaction.SystemException>of(exception);
            }
        }

        @Override
        public int getStatus() throws javax.transaction.SystemException {
            try {
                return delegate.getStatus();
            } catch (jakarta.transaction.SystemException exception) {
                throw TransactionShim.<javax.transaction.SystemException>of(exception);
            }
        }

        @Override
        public void rollback() throws javax.transaction.SystemException {
            try {
                delegate.rollback();
            } catch (jakarta.transaction.SystemException exception) {
                throw TransactionShim.<javax.transaction.SystemException>of(exception);
            }
        }

        @Override
        public void setRollbackOnly() throws javax.transaction.SystemException {
            try {
                delegate.setRollbackOnly();
            } catch (jakarta.transaction.SystemException exception) {
                throw TransactionShim.<javax.transaction.SystemException>of(exception);
            }
        }
    }

    final class TransactionalException extends javax.transaction.TransactionalException {
        private static final long serialVersionUID = -8196645329560986417L; // Use the ID from jakarta.transaction.

        private final jakarta.transaction.TransactionalException delegate;

        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        TransactionalException(jakarta.transaction.TransactionalException delegate) {
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

    final class TransactionManager extends Shim.Delegate<jakarta.transaction.TransactionManager> implements javax.transaction.TransactionManager {
        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        TransactionManager(jakarta.transaction.TransactionManager delegate) {
            super(delegate);
        }

        //==============================================================================================================
        // Delegated Methods
        //==============================================================================================================

        @Override
        public void resume(
            javax.transaction.Transaction transaction
        ) throws javax.transaction.InvalidTransactionException, javax.transaction.SystemException {
            try {
                delegate.resume(transaction);
            } catch (jakarta.transaction.InvalidTransactionException exception) {
                throw TransactionShim.<javax.transaction.InvalidTransactionException>of(exception);
            } catch (jakarta.transaction.SystemException exception) {
                throw TransactionShim.<javax.transaction.SystemException>of(exception);
            }
        }

        @Override
        public void resume(
            jakarta.transaction.Transaction transaction
        ) throws javax.transaction.InvalidTransactionException, javax.transaction.SystemException {
            try {
                delegate.resume(transaction);
            } catch (jakarta.transaction.InvalidTransactionException exception) {
                throw TransactionShim.<javax.transaction.InvalidTransactionException>of(exception);
            } catch (jakarta.transaction.SystemException exception) {
                throw TransactionShim.<javax.transaction.SystemException>of(exception);
            }
        }

        @Override
        public void begin() throws javax.transaction.NotSupportedException, javax.transaction.SystemException {
            try {
                delegate.begin();
            } catch (jakarta.transaction.NotSupportedException exception) {
                throw TransactionShim.<javax.transaction.NotSupportedException>of(exception);
            } catch (jakarta.transaction.SystemException exception) {
                throw TransactionShim.<javax.transaction.SystemException>of(exception);
            }
        }

        @Override
        public void commit() throws javax.transaction.RollbackException, javax.transaction.HeuristicMixedException, javax.transaction.HeuristicRollbackException, javax.transaction.SystemException {
            try {
                delegate.commit();
            } catch (jakarta.transaction.RollbackException exception) {
                throw TransactionShim.<javax.transaction.RollbackException>of(exception);
            } catch (jakarta.transaction.HeuristicMixedException exception) {
                throw TransactionShim.<javax.transaction.HeuristicMixedException>of(exception);
            } catch (jakarta.transaction.HeuristicRollbackException exception) {
                throw TransactionShim.<javax.transaction.HeuristicRollbackException>of(exception);
            } catch (jakarta.transaction.SystemException exception) {
                throw TransactionShim.<javax.transaction.SystemException>of(exception);
            }
        }

        @Override
        public int getStatus() throws javax.transaction.SystemException {
            try {
                return delegate.getStatus();
            } catch (jakarta.transaction.SystemException exception) {
                throw TransactionShim.<javax.transaction.SystemException>of(exception);
            }
        }

        @Override
        public javax.transaction.Transaction getTransaction() throws javax.transaction.SystemException {
            try {
                return TransactionShim.of(delegate.getTransaction());
            } catch (jakarta.transaction.SystemException exception) {
                throw TransactionShim.<javax.transaction.SystemException>of(exception);
            }
        }

        @Override
        public void rollback() throws javax.transaction.SystemException {
            try {
                delegate.rollback();
            } catch (jakarta.transaction.SystemException exception) {
                throw TransactionShim.<javax.transaction.SystemException>of(exception);
            }
        }

        @Override
        public void setRollbackOnly() throws javax.transaction.SystemException {
            try {
                delegate.setRollbackOnly();
            } catch (jakarta.transaction.SystemException exception) {
                throw TransactionShim.<javax.transaction.SystemException>of(exception);
            }
        }

        @Override
        public void setTransactionTimeout(int seconds) throws javax.transaction.SystemException {
            try {
                delegate.setTransactionTimeout(seconds);
            } catch (jakarta.transaction.SystemException exception) {
                throw TransactionShim.<javax.transaction.SystemException>of(exception);
            }
        }

        @Override
        public javax.transaction.Transaction suspend() throws javax.transaction.SystemException {
            try {
                return TransactionShim.of(delegate.suspend());
            } catch (jakarta.transaction.SystemException exception) {
                throw TransactionShim.<javax.transaction.SystemException>of(exception);
            }
        }
    }

    final class TransactionRequiredException extends javax.transaction.TransactionRequiredException {
        private static final long serialVersionUID = -1898806419937446439L; // Use the ID from jakarta.transaction.

        private final jakarta.transaction.TransactionRequiredException delegate;

        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        TransactionRequiredException(jakarta.transaction.TransactionRequiredException delegate) {
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

    final class TransactionRolledbackException extends javax.transaction.TransactionRolledbackException {
        private static final long serialVersionUID = -3142798139623020577L; // Use the ID from jakarta.transaction.

        private final jakarta.transaction.TransactionRolledbackException delegate;

        //==============================================================================================================
        // Constructors
        //==============================================================================================================

        TransactionRolledbackException(jakarta.transaction.TransactionRolledbackException delegate) {
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
}
