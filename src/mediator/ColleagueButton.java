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
    public void setMediator(Mediator mediator) {            // Mediator��ێ�
        this.mediator = mediator;
    }

    /**
     *
     * @param enabled
     */
    public void setColleagueEnabled(boolean enabled) {      // Mediator����L��/�������w�������
        setEnabled(enabled);
    }
}
