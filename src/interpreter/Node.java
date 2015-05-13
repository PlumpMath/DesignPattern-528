package interpreter;

/**
 *
 * @author kinoshita_h
 */
public abstract class Node {

    /**
     *
     * @param context
     * @throws ParseException
     */
    public abstract void parse(Context context) throws ParseException;
}
