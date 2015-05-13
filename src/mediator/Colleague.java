package mediator;

/**
 *
 * @author kinoshita_h
 */
public interface Colleague {

    /**
     *
     * @param mediator
     */
    public abstract void setMediator(Mediator mediator);

    /**
     *
     * @param enabled
     */
    public abstract void setColleagueEnabled(boolean enabled);
}
