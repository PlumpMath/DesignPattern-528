package visitor;

/**
 *
 * @author kinoshita_h
 */
public abstract class Visitor {

    /**
     *
     * @param file
     */
    public abstract void visit(File file);

    /**
     *
     * @param directory
     */
    public abstract void visit(Directory directory);
}
