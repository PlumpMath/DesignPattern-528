package abstractFactory.listfactory;
import abstractFactory.factory.Item;
import abstractFactory.factory.Page;
import java.util.Iterator;

/**
 *
 * @author kinoshita_h
 */
public class ListPage extends Page {

    /**
     *
     * @param title
     * @param author
     */
    public ListPage(String title, String author) {
        super(title, author);
    }

    /**
     *
     * @return
     */
    @Override
    public String makeHTML() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("<html><head><title>").append(title).append("</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>").append(title).append("</h1>\n");
        buffer.append("<ul>\n");
        Iterator it = content.iterator();
        while (it.hasNext()) {
            Item item = (Item)it.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("<hr><address>").append(author).append("</address>");
        buffer.append("</body></html>\n");
        return buffer.toString();
    }
}
