package adapter.sample01;

/**
 *
 * @author kinopp
 */
public class PrintBanner extends Banner implements Print {

    /**
     *
     * @param string
     */
    public PrintBanner(String string) {
        super(string);
    }

    /**
     *
     */
    @Override
    public void printWeak() {
        showWithParen();
    }

    /**
     *
     */
    @Override
    public void printStrong() {
        showWithAster();
    }
}
