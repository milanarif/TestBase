package stack;

import java.util.ArrayList;
import java.util.List;

public class LIFOStack {

    private final List<Integer> values = new ArrayList<>();

    public boolean empty() {
        return values.isEmpty();
    }

    public void push(int i) {
        values.add(i);
    }

    public int pop() {
        if (empty())
            throw new IllegalStateException();

        return values.remove(values.size() - 1);
    }
}
