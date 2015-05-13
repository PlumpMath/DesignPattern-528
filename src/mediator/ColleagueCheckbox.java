package mediator;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

/**
 *
 * @author kinoshita_h
 */
public class ColleagueCheckbox extends Checkbox implements ItemListener, Colleague {
    private Mediator mediator;

    /**
     *
     * @param caption
     * @param group
     * @param state
     */
    public ColleagueCheckbox(String caption, CheckboxGroup group, boolean state) {  // コンストラクタ
        super(caption, group, state);
    }

    /**
     *
     * @param mediator
     */
    @Override
    public void setMediator(Mediator mediator) {            // Mediatorを保持
        this.mediator = mediator;
    }

    /**
     *
     * @param enabled
     */
    @Override
    public void setColleagueEnabled(boolean enabled) {      // Mediatorから有効/無効が指示される
        setEnabled(enabled);
    }
    @Override
    public void itemStateChanged(ItemEvent e) {             // 状態が変化したらMediatorに通知
        mediator.colleagueChanged();
    }
}
