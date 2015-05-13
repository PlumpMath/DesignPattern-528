package observer;

import java.util.Random;

/**
 *
 * @author kinoshita_h
 */
public class RandomNumberGenerator extends NumberGenerator {
    private final Random random = new Random();   // 乱数生成機
    private int number;                     // 現在の数

    /**
     *
     * @return
     */
    @Override
    public int getNumber() {                // 数を取得する
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
