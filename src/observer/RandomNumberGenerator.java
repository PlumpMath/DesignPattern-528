package observer;

import java.util.Random;

/**
 *
 * @author kinoshita_h
 */
public class RandomNumberGenerator extends NumberGenerator {
    private final Random random = new Random();   // —”¶¬‹@
    private int number;                     // Œ»İ‚Ì”

    /**
     *
     * @return
     */
    @Override
    public int getNumber() {                // ”‚ğæ“¾‚·‚é
        return number;
    }

    /**
     *
     */
    @Override
    public void execute() {
        for (int i = 0; i < 20; i++) {
            number = random.nextInt(50);
            notifyObservers();
        }
    }
}
