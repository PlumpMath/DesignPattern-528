package observer;

import java.util.Random;

/**
 *
 * @author kinoshita_h
 */
public class RandomNumberGenerator extends NumberGenerator {
    private final Random random = new Random();   // ���������@
    private int number;                     // ���݂̐�

    /**
     *
     * @return
     */
    @Override
    public int getNumber() {                // �����擾����
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
