package javax.transaction;

/**
 * @deprecated Use {@link jakarta.transaction.TransactionManager} instead.
 */
@Deprecated(since = "jakarta.transaction.TransactionManager")
public interface TransactionManager extends jakarta.transaction.TransactionManager, TransactionShim {
    //==================================================================================================================
    // Shim Methods
    //==================================================================================================================

    /**
     * @see #resume(jakarta.transaction.Transaction)
     */
    void resume(Transaction transaction) throws InvalidTransactionException, IllegalStateException, SystemException;

    //==================================================================================================================
    // TransactionManager Implementation Methods
    //==================================================================================================================

    @Override
    void begin() throws NotSupportedException, SystemException;

    @Override
    void commit() throws RollbackException, HeuristicMixedException, HeuristicRollbackException, SecurityException, IllegalStateException, SystemException;

    @Override
    int getStatus() throws SystemException;

    @Override
    Transaction getTransaction() throws SystemException;

    @Override
    default void resume(
        jakarta.transaction.Transaction transaction
    ) throws InvalidTransactionException, IllegalStateException, SystemException {
        resume(TransactionShim.of(transaction));
    }

    @Override
    void rollback() throws IllegalStateException, SecurityException, SystemException;

    @Override
    void setRollbackOnly() throws IllegalStateException, SystemException;

    @Override
    void setTransactionTimeout(int seconds) throws SystemException;

    @Override
    Transaction suspend() throws SystemException;
}
