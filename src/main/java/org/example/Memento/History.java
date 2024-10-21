package org.example.Memento;

import java.util.Stack;

public class History {
    private final Stack<Memento> mementoStack;

    public History() {
        mementoStack = new Stack<>();
    }

    public void save(Memento memento) {
        mementoStack.push(memento);
    }

    public Memento undo() {
        if (!mementoStack.isEmpty()) {
            mementoStack.pop();
            return mementoStack.elementAt(mementoStack.size()-1);
        } else {
            throw new RuntimeException("Error");
        }
    }
}