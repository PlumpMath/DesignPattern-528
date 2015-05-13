package abstractFactory.tablefactory;
import abstractFactory.factory.Item;
import abstractFactory.factory.Tray;
import java.util.Iterator;

/**
 *
 * @author kinoshita_h
 */
public class TableTray extends Tray {

    /**
     *
     * @param caption
     */
    public TableTray(String caption) {
        super(caption);                     // super(...)‚Æ‚¢‚¤•\‹L–@
    }

    /**
     *
     * @return
     */
    @Override
    public String makeHTML() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("<td>");
        buffer.append("<table width=\"100%\" border=\"1\"><tr>");
        buffer.append("<td bgcolor=\"#cccccc\" align=\"center\" colspan=\"").append(tray.size()).append("\"><b>").append(caption).append("</b></td>");
        buffer.append("</tr>\n");
        buffer.append("<tr>\n");
        Iterator it = tray.iterator();
        while (it.hasNext()) {
            Item item = (Item)it.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</tr></table>");
        buffer.append("</td>");
        return buffer.toString();
    }
}
