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
    public ColleagueTextField(String text, int columns) {   // コンストラクタ
        super(text, columns);
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
        setBackground(enabled ? Color.white : Color.lightGray);
    }
    @Override
    public void textValueChanged(TextEvent e) {             // 文字列が変化したらMediatorに通知
        mediator.colleagueChanged();
    }
}
