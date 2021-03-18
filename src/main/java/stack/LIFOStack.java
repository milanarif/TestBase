package stack;

public class LIFOStack {

    private boolean empty = true;
    private int value;

    public boolean empty() {
        return empty;
    }

    public void push(int i) {
        empty = false;
        value = i;
    }

    public int pop() {
        if (empty)
            throw new IllegalStateException();
        else
            return value;
    }
}
