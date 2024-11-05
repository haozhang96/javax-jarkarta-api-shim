package javax.transaction;

import javax.transaction.xa.XAResource;

/**
 * @deprecated Use {@link jakarta.transaction.Transaction} instead.
 */
@Deprecated(since = "jakarta.transaction.Transaction")
public interface Transaction extends jakarta.transaction.Transaction, TransactionShim {
    //==================================================================================================================
    // Shim Methods
    //==================================================================================================================

    /**
     * @see #registerSynchronization(jakarta.transaction.Synchronization)
     */
    void registerSynchronization(
        Synchronization synchronization
    ) throws RollbackException, IllegalStateException, SystemException;

    //==================================================================================================================
    // Transaction Implementation Methods
    //==================================================================================================================

    @Override
    void commit() throws RollbackException, HeuristicMixedException, HeuristicRollbackException, SecurityException, IllegalStateException, SystemException;

    @Override
    boolean delistResource(XAResource resource, int flag) throws IllegalStateException, SystemException;

    @Override
    boolean enlistResource(XAResource resource) throws RollbackException, IllegalStateException, SystemException;

    @Override
    int getStatus() throws SystemException;

    @Override
    default void registerSynchronization(
        jakarta.transaction.Synchronization synchronization
    ) throws RollbackException, IllegalStateException, SystemException {
        registerSynchronization(TransactionShim.of(synchronization));
    }

    @Override
    void rollback() throws IllegalStateException, SystemException;

    @Override
    void setRollbackOnly() throws IllegalStateException, SystemException;
}
