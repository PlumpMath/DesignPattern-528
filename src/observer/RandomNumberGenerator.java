package observer;

import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator {
    private final Random random = new Random();   // —”¶¬‹@
    private int number;                     // Œ»İ‚Ì”

    @Override
    public int getNumber() {                // ”‚ğæ“¾‚·‚é
        return number;
    }

    @Override
    public void execute() {
        for (int i = 0; i < 20; i++) {
            number = random.nextInt(50);
            notifyObservers();
        }
    }
}
