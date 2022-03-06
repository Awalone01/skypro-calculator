package pro.sky.skyprocalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static pro.sky.skyprocalculator.CalculatorOperationConstants.*;

public class CalculatorOperationTest {

    private final CalculatorOperation out = new CalculatorOperation();

    @Test
    public void shouldReturnSumOfOneAndTwo() {
        assertEquals(THREE, out.addition(ONE, TWO));
    }

    @Test
    public void shouldReturnFourWhenThreeMinusMinus_One() {
        assertEquals(FOUR, out.subtraction(THREE, MINUS_ONE));
    }

    @Test
    public void shouldReturnMultiplicationTwoAndTwo() {
        assertEquals(FOUR, out.multiplication(TWO, TWO));
    }

    @Test
    public void shouldReturnTwoAfterDivisionFourAndTwo() {
        assertEquals(TWO, out.division(FOUR, TWO));
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionAfterDivisionOnZero() {
        assertThrows(IllegalArgumentException1.class, () -> out.division(ONE, ZERO));
    }


}
