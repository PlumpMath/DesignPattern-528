package abstractFactory.factory;

/**
 *
 * @author kinoshita_h
 */
public abstract class Item {

    /**
     *
     */
    protected String caption;

    /**
     *
     * @param caption
     */
    public Item(String caption) {
        this.caption = caption;
    }

    /**
     *
     * @return
     */
    public abstract String makeHTML();
}
