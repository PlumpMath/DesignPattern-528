package iterator;

/**
 * 本棚をスキャンするクラス
 * @author kinopp
 */
public class BookShelfIterator implements Iterator {
    private final BookShelf bookShelf;
    private int index;

    /**
     *
     * @param bookShelf
     */
    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    /**
     *
     * @return
     */
    @Override
    public boolean hasNext() {
        return index < bookShelf.getLength();
    }

    /**
     *
     * @return
     */
    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
