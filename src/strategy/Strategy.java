package strategy;

/**
 *
 * @author kinoshita_h
 */
public interface Strategy {

    /**
     *
     * @return
     */
    public abstract Hand nextHand();

    /**
     *
     * @param win
     */
    public abstract void study(boolean win);
}
