package org.example.Memento;

public class Memento {
    private String text;

    public Memento(String text) {
        this.text = text;
    }

    public String getText(){
        return this.text;
    }
}
