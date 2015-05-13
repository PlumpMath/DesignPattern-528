package strategy;

import java.util.Random;

/**
 *
 * @author kinoshita_h
 */
public class WinningStrategy implements Strategy {
    private Random random;
    private boolean won = false;
    private Hand prevHand;

    /**
     *
     * @param seed
     */
    public WinningStrategy(int seed) {
        random = new Random(seed);
    }

    /**
     *
     * @return
     */
    public Hand nextHand() {
        if (!won) {
            prevHand = Hand.getHand(random.nextInt(3));
        }
        return prevHand;
    }

    /**
     *
     * @param win
     */
    public void study(boolean win) {
        won = win;
    }
}
