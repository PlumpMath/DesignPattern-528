package abstractFactory.factory;
import java.util.ArrayList;

/**
 *
 * @author kinoshita_h
 */
public abstract class Tray extends Item {

    /**
     *
     */
    protected ArrayList tray = new ArrayList();

    /**
     *
     * @param caption
     */
    public Tray(String caption) {
        super(caption);
    }

    /**
     *
     * @param item
     */
    public void add(Item item) {
        tray.add(item);
    }
}
