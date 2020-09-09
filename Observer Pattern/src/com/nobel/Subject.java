package com.nobel;

import java.util.ArrayList;
import java.util.List;

// Observable object
public class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    protected void notifyObservers() {
        for (Observer observer: observers)
            observer.update();
    }

}
