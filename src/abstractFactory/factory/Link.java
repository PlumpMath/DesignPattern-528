package abstractFactory.factory;

/**
 *
 * @author kinoshita_h
 */
public abstract class Link extends Item {

    /**
     *
     */
    protected String url;

    /**
     *
     * @param caption
     * @param url
     */
    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
