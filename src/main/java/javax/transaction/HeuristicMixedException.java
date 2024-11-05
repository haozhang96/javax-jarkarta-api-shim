package javax.transaction;

/**
 * @deprecated Use {@link jakarta.transaction.HeuristicMixedException} instead.
 */
@Deprecated(since = "jakarta.transaction.HeuristicMixedException")
public class HeuristicMixedException extends jakarta.transaction.HeuristicMixedException implements TransactionShim {
    private static final long serialVersionUID = 2345014349685956666L; // Use the ID from jakarta.transaction.

    //==================================================================================================================
    // Constructors
    //==================================================================================================================

    /**
     * @see jakarta.transaction.HeuristicMixedException#HeuristicMixedException()
     */
    public HeuristicMixedException() {
        super();
    }

    /**
     * @see jakarta.transaction.HeuristicMixedException#HeuristicMixedException(String)
     */
    public HeuristicMixedException(String message) {
        super(message);
    }
}
