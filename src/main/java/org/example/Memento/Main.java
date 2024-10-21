package org.example.Memento;

public class Main {
    public static void main(String[] args) {
        TextEditor text = new TextEditor();
        History history = new History();

        text.write("Zhasik");
        history.save(text.save());
        System.out.println("Current Text: " + text.getText());
        text.write(" hello");
        history.save(text.save());
        System.out.println(text.getText());

        Memento last = history.undo();
        if (last != null) {
            text.restore(last);
        }
        System.out.println(text.getText());
    }
}