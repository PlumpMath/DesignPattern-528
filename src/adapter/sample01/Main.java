package adapter.sample01;

/**
 *
 * @author kinopp
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
