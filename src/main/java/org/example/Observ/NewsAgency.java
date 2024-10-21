package org.example.Observ;

import java.util.ArrayList;
import java.util.List;

class NewsAgency implements Observable {
    private List<Observer> observers;
    private String latestHeadline;

    public NewsAgency() {
        observers = new ArrayList<>();
    }
    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.handleEvent(latestHeadline);
        }
    }

    public void setLatestHeadline(String headline) {
        this.latestHeadline = headline;
        notifyObservers();
    }
}
