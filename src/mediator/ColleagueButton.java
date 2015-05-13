package mediator;

import java.awt.Button;

/**
 *
 * @author kinoshita_h
 */
public class ColleagueButton extends Button implements Colleague {
    private Mediator mediator;

    /**
     *
     * @param caption
     */
    public ColleagueButton(String caption) {
        super(caption);
    }

    /**
     *
     * @param mediator
     */
    public void setMediator(Mediator mediator) {            // Mediator‚ğ•Û
        this.mediator = mediator;
    }

    /**
     *
     * @param enabled
     */
    public void setColleagueEnabled(boolean enabled) {      // Mediator‚©‚ç—LŒø/–³Œø‚ªw¦‚³‚ê‚é
        setEnabled(enabled);
    }
}
