package org.example.Memento;

public class Main {
    public static void main(String[] args) {
        TextEditor text = new TextEditor();
        History history = new History();

        // Writing initial text
        text.write("Zhasik");
        history.save(text.save());
        System.out.println("Current Text: " + text.getText()); // Output: Zhasik

        // Writing more text
        text.write(" hello");
        history.save(text.save());
        System.out.println("Current Text: " + text.getText()); // Output: Zhasik hello

        // Undoing the last text addition
        Memento last = history.undo();
        if (last != null) {
            text.restore(last);
        }
        System.out.println("After Undo: " + text.getText()); // This should now show: Zhasik
    }
}