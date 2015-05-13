package observer;

/**
 *
 * @author kinoshita_h
 */
public interface Observer {

    /**
     *
     * @param generator
     */
    public abstract void update(NumberGenerator generator);
}
