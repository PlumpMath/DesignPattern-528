package iterator;

/**
 * 本棚を表すクラス
 * @author kinopp
 */
public class BookShelf implements Aggregate {
    private final Book[] books;
    private int last = 0;

    /**
     *
     * @param maxsize
     */
    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    /**
     *
     * @param index
     * @return
     */
    public Book getBookAt(int index) {
        return books[index];
    }

    /**
     *
     * @param book
     */
    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    /**
     *
     * @return
     */
    public int getLength() {
        return last;
    }
    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
