package observer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author kinoshita_h
 */
public abstract class NumberGenerator {
    private final ArrayList<Observer> observers = new ArrayList<>();        // Observer������ێ�

    /**
     *
     * @param observer
     */
    public void addObserver(Observer observer) {    // Observer��ǉ�
        observers.add(observer);
    }

    /**
     *
     * @param observer
     */
    public void deleteObserver(Observer observer) { // Observer���폜
        observers.remove(observer);
    }

    /**
     *
     */
    public void notifyObservers() {
        // Observer�֒ʒm
        observers.stream().forEach(o -> o.update(this));
    }

    /**
     *
     * @return
     */
    public abstract int getNumber();                // �����擾����

    /**
     *
     */
    public abstract void execute();                 // ���𐶐�����
}
