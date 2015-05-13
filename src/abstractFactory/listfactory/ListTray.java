package abstractFactory.listfactory;
import abstractFactory.factory.Item;
import abstractFactory.factory.Tray;
import java.util.Iterator;

/**
 *
 * @author kinoshita_h
 */
public class ListTray extends Tray {

    /**
     *
     * @param caption
     */
    public ListTray(String caption) {
        super(caption);
    }

    /**
     *
     * @return
     */
    @Override
    public String makeHTML() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("<li>\n");
        buffer.append(caption).append("\n");
        buffer.append("<ul>\n");
        Iterator it = tray.iterator();
        while (it.hasNext()) {
            Item item = (Item)it.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("</li>\n");
        return buffer.toString();
    }
}
