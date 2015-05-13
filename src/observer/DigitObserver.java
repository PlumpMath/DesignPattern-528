package observer;

/**
 *
 * @author kinoshita_h
 */
public class DigitObserver implements Observer {

    /**
     *
     * @param generator
     */
    @Override
    public void update(NumberGenerator generator) {
        System.out.println("DigitObserver:" + generator.getNumber());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}
