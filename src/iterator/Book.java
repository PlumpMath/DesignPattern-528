package iterator;

/**
 * 本を表すクラス
 * @author kinopp
 */
public class Book {
    private final String name;

    /**
     *
     * @param name
     */
    public Book(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }
}
