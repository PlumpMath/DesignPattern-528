package visitor;

/**
 *
 * @author kinoshita_h
 */
public class File extends Entry {
    private String name;
    private int size;

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
    public String getName() {
        return name;
    }

    /**
     *
     * @return
     */
    public int getSize() {
        return size;
    }

    /**
     *
     * @param v
     */
    public void accept(Visitor v) {
        v.visit(this);
    }
}
