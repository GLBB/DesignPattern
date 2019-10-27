package obeserver;

import java.util.ArrayList;

public abstract class NumberGenerator {

    private ArrayList<Observer> observers = new ArrayList();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }
}
