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
    public ColleagueCheckbox(String caption, CheckboxGroup group, boolean state) {  // �R���X�g���N�^
        super(caption, group, state);
    }

    /**
     *
     * @param mediator
     */
    @Override
    public void setMediator(Mediator mediator) {            // Mediator��ێ�
        this.mediator = mediator;
    }

    /**
     *
     * @param enabled
     */
    @Override
    public void setColleagueEnabled(boolean enabled) {      // Mediator����L��/�������w�������
        setEnabled(enabled);
    }
    @Override
    public void itemStateChanged(ItemEvent e) {             // ��Ԃ��ω�������Mediator�ɒʒm
        mediator.colleagueChanged();
    }
}
