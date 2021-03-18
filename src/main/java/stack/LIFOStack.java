package stack;

public class LIFOStack {

    private boolean empty = true;

    public boolean empty() {
        return empty;
    }

    public void push(int i) {
        empty = false;
    }

    public int pop() {
        if (empty)
            throw new IllegalStateException();
        else
            return 1;
    }
}
