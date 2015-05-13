package abstractFactory.tablefactory;
import abstractFactory.factory.Item;
import abstractFactory.factory.Page;
import java.util.Iterator;

/**
 *
 * @author kinoshita_h
 */
public class TablePage extends Page {

    /**
     *
     * @param title
     * @param author
     */
    public TablePage(String title, String author) {
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
        buffer.append("<table width=\"80%\" border=\"3\">\n");
        Iterator it = content.iterator();
        while (it.hasNext()) {
            Item item = (Item)it.next();
            buffer.append("<tr>").append(item.makeHTML()).append("</tr>");
        }
        buffer.append("</table>\n");
        buffer.append("<hr><address>").append(author).append("</address>");
        buffer.append("</body></html>\n");
        return buffer.toString();
    }
}
