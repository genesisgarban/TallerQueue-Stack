import java.util.LinkedList;
public class TextEditor {
    LinkedList<String> actions;

    public TextEditor() {
        this.actions = new LinkedList<>();
    }

    public void write(String word) {
        this.actions.addLast(word);
    }

    public void undo() {
        if (!this.actions.isEmpty()) {
            this.actions.removeLast();
        }
    }

    public void printText() {
        for (String action : actions) {
            System.out.print(action + " ");
        }
        System.out.println();
    }
}