package observer;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class NumberGenerator {
    private final ArrayList<Observer> observers = new ArrayList<>();        // Observer‚½‚¿‚ğ•Û

    public void addObserver(Observer observer) {    // Observer‚ğ’Ç‰Á
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) { // Observer‚ğíœ
        observers.remove(observer);
    }

    public void notifyObservers() {
        // Observer‚Ö’Ê’m
        observers.stream().forEach(o -> o.update(this));
    }

    public abstract int getNumber();                // ”‚ğæ“¾‚·‚é

    public abstract void execute();                 // ”‚ğ¶¬‚·‚é
}
