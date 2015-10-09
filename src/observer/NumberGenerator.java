package observer;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class NumberGenerator {
    private final ArrayList<Observer> observers = new ArrayList<>();        // Observer������ێ�

    public void addObserver(Observer observer) {    // Observer��ǉ�
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) { // Observer���폜
        observers.remove(observer);
    }

    public void notifyObservers() {
        // Observer�֒ʒm
        observers.stream().forEach(o -> o.update(this));
    }

    public abstract int getNumber();                // �����擾����

    public abstract void execute();                 // ���𐶐�����
}
