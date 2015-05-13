package adapter.sample01;

/**
 *
 * @author kinopp
 */
public class Banner {
    private final String string;

    /**
     *
     * @param string
     */
    public Banner(String string) {
        this.string = string;
    }

    /**
     *
     */
    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    /**
     *
     */
    public void showWithAster() {
        System.out.println("*" + string + "*");
    }
}
