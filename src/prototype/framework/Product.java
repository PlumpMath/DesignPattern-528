package prototype.framework;
import java.lang.Cloneable;

/**
 *
 * @author kinoshita_h
 */
public interface Product extends Cloneable {

    /**
     *
     * @param s
     */
    public abstract void use(String s);

    /**
     *
     * @return
     */
    public abstract Product createClone();
}
