package calc;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class CalculatorTest {

    @Test
    @DisplayName("Calling add with two numbers returns sum")
    void sumOfAdd() {
        Calculator calculator = new Calculator();

        var actualSum = calculator.add(1, 1);

        assertEquals(2, actualSum, "Called add with 1,1 should return 2");
    }

    @Test
    @DisplayName("Calling add with two negative numbers returns sum")
    void sumOfAddNegative() {
        Calculator calculator = new Calculator();

        var actualSum = calculator.add(-1, -1);

        assertEquals(-2, actualSum);
    }

    @Test
        //@Tag("IT")
    void productOfMul() {
        Calculator calculator = new Calculator();

        var actualProduct = calculator.mul(1, 1);

        assertThat(actualProduct).isOne().isGreaterThan(0);
        assertThat("Hej").startsWith("H").endsWith("j");
        assertThat(List.of("a", "b")).contains("a");
//        assertEquals(1, actualProduct);
    }

    @Test
    void onePair() {
        Calculator calculator = new Calculator();

        var actualPair = calculator.getAPair();

        assertEquals(1, actualPair.first());
        assertEquals(2, actualPair.second());
    }

    @Test
    void branchFalse() {
        Calculator calculator = new Calculator();

        var actualResult = calculator.branchingExample(1);

        assertFalse(actualResult);
        assertThat(actualResult).isFalse();
    }
}
