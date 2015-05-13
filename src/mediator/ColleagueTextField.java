package mediator;

import java.awt.TextField;
import java.awt.Color;
import java.awt.event.TextListener;
import java.awt.event.TextEvent;

/**
 *
 * @author kinoshita_h
 */
public class ColleagueTextField extends TextField implements TextListener, Colleague {
    private Mediator mediator;

    /**
     *
     * @param text
     * @param columns
     */
    public ColleagueTextField(String text, int columns) {   // �R���X�g���N�^
        super(text, columns);
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
        setBackground(enabled ? Color.white : Color.lightGray);
    }
    @Override
    public void textValueChanged(TextEvent e) {             // �����񂪕ω�������Mediator�ɒʒm
        mediator.colleagueChanged();
    }
}
