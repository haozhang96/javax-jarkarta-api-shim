package javax.transaction;

/**
 * @deprecated Use {@link jakarta.transaction.TransactionSynchronizationRegistry} instead.
 */
@Deprecated(since = "jakarta.transaction.TransactionSynchronizationRegistry")
public interface TransactionSynchronizationRegistry extends jakarta.transaction.TransactionSynchronizationRegistry, TransactionShim {
    //==================================================================================================================
    // Shim Methods
    //==================================================================================================================

    /**
     * @see #registerInterposedSynchronization(jakarta.transaction.Synchronization)
     */
    void registerInterposedSynchronization(Synchronization synchronization);

    //==================================================================================================================
    // TransactionSynchronizationRegistry Implementation Methods
    //==================================================================================================================

    @Override
    default void registerInterposedSynchronization(jakarta.transaction.Synchronization synchronization) {
        registerInterposedSynchronization(TransactionShim.of(synchronization));
    }
}
