package jasmine.jragon.avl;
/**
 *
 */
public class UnbalancedEntriesException extends Exception{

    /**
     *
     * @param first
     * @param second
     */
    public UnbalancedEntriesException(int first, int second){
        super("Imbalanced array lengths: " + first + " - " + second);
    }
}