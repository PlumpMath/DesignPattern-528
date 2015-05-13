package abstractFactory.listfactory;

import abstractFactory.factory.Factory;
import abstractFactory.factory.Link;
import abstractFactory.factory.Page;
import abstractFactory.factory.Tray;

/**
 *
 * @author kinoshita_h
 */
public class ListFactory extends Factory {

    /**
     *
     * @param caption
     * @param url
     * @return
     */
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    /**
     *
     * @param caption
     * @return
     */
    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    /**
     *
     * @param title
     * @param author
     * @return
     */
    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
