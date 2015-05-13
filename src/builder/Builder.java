package builder;

/**
 *
 * @author kinoshita_h
 */
public interface Builder {

    /**
     *
     * @param title
     */
    public abstract void makeTitle(String title);

    /**
     *
     * @param str
     */
    public abstract void makeString(String str);

    /**
     *
     * @param items
     */
    public abstract void makeItems(String[] items);

    /**
     *
     */
    public abstract void close();
    
    /**
     *
     * @return
     */
    public abstract String getResult();
}
