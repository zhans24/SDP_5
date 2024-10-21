package org.example.Memento;

public class TextEditor {
    private StringBuilder text = new StringBuilder();

    public void write(String text) {
        this.text.append(text);
    }

    public String getText() {
        return text.toString();
    }

    public Memento save() {
        return new Memento(text.toString());
    }

    public void restore(Memento memento) {
        text = new StringBuilder(memento.getText());
    }
}