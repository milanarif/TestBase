package stack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class LIFOStackTest {

    LIFOStack lifoStack = new LIFOStack();

    @Test
    void newStackIsEmpty() {
        assertThat(lifoStack.empty()).isTrue();
    }


}
