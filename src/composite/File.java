package composite;

/**
 *
 * @author kinoshita_h
 */
public class File extends Entry {
    private final String name;
    private final int size;

    /**
     *
     * @param name
     * @param size
     */
    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    /**
     *
     * @return
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     *
     * @return
     */
    @Override
    public int getSize() {
        return size;
    }

    /**
     *
     * @param prefix
     */
    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }
}
