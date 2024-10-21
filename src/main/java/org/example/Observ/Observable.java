package org.example.Observ;

public interface Observable {
    void add(org.example.Observ.Observer observer);
    void remove(org.example.Observ.Observer observer);
    void notifyObservers();
}
