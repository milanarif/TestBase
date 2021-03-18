package stack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class LIFOStackTest {

    LIFOStack lifoStack = new LIFOStack();

    @Test
    void newStackIsEmpty() {
        assertThat(lifoStack.empty()).isTrue();
    }

    @Test
    void afterPushEmptyIsFalse() {
        lifoStack.push(1);
        assertThat(lifoStack.empty()).isFalse();
    }

    @Test
    void popOnEmptyListThrowsException() {
        //junit style
        assertThrows(IllegalStateException.class, () -> lifoStack.pop());
        //assertJ style
        assertThatThrownBy(() -> lifoStack.pop()).isInstanceOf(IllegalStateException.class);
        assertThatExceptionOfType(IllegalStateException.class).isThrownBy(() -> lifoStack.pop());
        assertThatIllegalStateException().isThrownBy(() -> lifoStack.pop());
    }

    @Test
    void pushThenPop() {
        lifoStack.push(1);
        assertThat(lifoStack.pop()).isEqualTo(1);
    }

    @Test
    void pushTwiceThenPop() {
        lifoStack.push(1);
        lifoStack.push(2);
        assertThat(lifoStack.pop()).isEqualTo(2);
    }

    @Test
    void pushPopIsEmpty() {
        lifoStack.push(1);
        lifoStack.pop();
        assertThat(lifoStack.empty()).isTrue();
    }

    @Test
    void pushPushThenPopPop() {
        lifoStack.push(1);
        lifoStack.push(2);
        assertThat(lifoStack.pop()).isEqualTo(2);
        assertThat(lifoStack.pop()).isEqualTo(1);
        assertThat(lifoStack.empty()).isTrue();
    }

    @Test
    void pushPushPushThenPopPop() {
        lifoStack.push(1);
        lifoStack.push(2);
        lifoStack.push(3);
        assertThat(lifoStack.pop()).isEqualTo(3);
        assertThat(lifoStack.pop()).isEqualTo(2);
        assertThat(lifoStack.pop()).isEqualTo(1);
    }


}
