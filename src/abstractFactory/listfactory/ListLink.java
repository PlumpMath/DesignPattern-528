package abstractFactory.listfactory;

import abstractFactory.factory.Link;

/**
 *
 * @author kinoshita_h
 */
public class ListLink extends Link {

    /**
     *
     * @param caption
     * @param url
     */
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    /**
     *
     * @return
     */
    @Override
    public String makeHTML() {
        return "  <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
