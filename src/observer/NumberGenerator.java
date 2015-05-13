package observer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author kinoshita_h
 */
public abstract class NumberGenerator {
    private final ArrayList<Observer> observers = new ArrayList<>();        // Observerたちを保持

    /**
     *
     * @param observer
     */
    public void addObserver(Observer observer) {    // Observerを追加
        observers.add(observer);
    }

    /**
     *
     * @param observer
     */
    public void deleteObserver(Observer observer) { // Observerを削除
        observers.remove(observer);
    }

    /**
     *
     */
    public void notifyObservers() {
        // Observerへ通知
        observers.stream().forEach(o -> o.update(this));
    }

    /**
     *
     * @return
     */
    public abstract int getNumber();                // 数を取得する

    /**
     *
     */
    public abstract void execute();                 // 数を生成する
}
