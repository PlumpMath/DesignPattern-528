package abstractFactory.tablefactory;

import abstractFactory.factory.Link;

/**
 *
 * @author kinoshita_h
 */
public class TableLink extends Link {

    /**
     *
     * @param caption
     * @param url
     */
    public TableLink(String caption, String url) {
        super(caption, url);
    }
    
    /**
     *
     * @return
     */
    @Override
    public String makeHTML() {
        return "<td><a href=\"" + url + "\">" + caption + "</a></td>\n";
    }
}
