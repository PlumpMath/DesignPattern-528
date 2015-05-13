package visitor;

/**
 *
 * @author kinoshita_h
 */
public interface Element {

    /**
     *
     * @param v
     */
    public abstract void accept(Visitor v);
}
