package adapter.sample02;

/**
 *
 * @author kinopp
 */
public class PrintBanner extends Print {
    private final Banner banner;

    /**
     *
     * @param string
     */
    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    /**
     *
     */
    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    /**
     *
     */
    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
