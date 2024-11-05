package javax.transaction;

/**
 * @deprecated Use {@link jakarta.transaction.UserTransaction} instead.
 */
@Deprecated(since = "jakarta.transaction.UserTransaction")
public interface UserTransaction extends jakarta.transaction.UserTransaction, TransactionShim {
    //==================================================================================================================
    // UserTransaction Implementation Methods
    //==================================================================================================================

    @Override
    void begin() throws NotSupportedException, SystemException;

    @Override
    void commit() throws RollbackException, HeuristicMixedException, HeuristicRollbackException, SecurityException, IllegalStateException, SystemException;

    @Override
    void rollback() throws IllegalStateException, SecurityException, SystemException;

    @Override
    void setRollbackOnly() throws IllegalStateException, SystemException;

    @Override
    int getStatus() throws SystemException;

    @Override
    void setTransactionTimeout(int seconds) throws SystemException;
}
