package abstractFactory.tablefactory;

import abstractFactory.factory.Factory;
import abstractFactory.factory.Link;
import abstractFactory.factory.Page;
import abstractFactory.factory.Tray;

/**
 *
 * @author kinoshita_h
 */
public class TableFactory extends Factory {

    /**
     *
     * @param caption
     * @param url
     * @return
     */
    @Override
    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }

    /**
     *
     * @param caption
     * @return
     */
    @Override
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }

    /**
     *
     * @param title
     * @param author
     * @return
     */
    @Override
    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }
}
