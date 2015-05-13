package bridge;

/**
 *
 * @author kinoshita_h
 */
public class CountDisplay extends Display {

    /**
     *
     * @param impl
     */
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    /**
     *
     * @param times
     */
    public void multiDisplay(int times) {       // times‰ñŒJ‚è•Ô‚µ‚Ä•\Ž¦‚·‚é
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
