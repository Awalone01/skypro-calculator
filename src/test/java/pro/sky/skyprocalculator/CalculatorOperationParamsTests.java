package pro.sky.skyprocalculator;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static pro.sky.skyprocalculator.CalculatorOperationConstants.*;

public class CalculatorOperationParamsTests {

    private final CalculatorOperation out = new CalculatorOperation();

    @ParameterizedTest
    @MethodSource("additionParamsForTests")
    public void shouldReturnSumOfNumbers(int firstNum, int secondNum, int expectedNum) {
        assertEquals(expectedNum, out.addition(firstNum, secondNum));
    }

    @ParameterizedTest
    @MethodSource("subtractionParamsForTests")
    public void shouldReturnExpectedNumAfterSubtraction(int firstNum, int secondNum, int expectedNum) {
        assertEquals(expectedNum, out.subtraction(firstNum, secondNum));
    }

    @ParameterizedTest
    @MethodSource("multiplicationParamsForTests")
    public void shouldReturnExpectedNumAfterMultiplication(int firstNum, int secondNum, int expectedNum) {
        assertEquals(expectedNum, out.multiplication(firstNum, secondNum));
    }

    @ParameterizedTest
    @MethodSource("divisionParamsForTests")
    public void shouldReturnExpectedNumAfterDivision(int firstNum, int secondNum, int expectedNum) {
        assertEquals(expectedNum, out.division(firstNum, secondNum));
    }

    public static Stream<Arguments> additionParamsForTests() {
        return Stream.of(
                Arguments.of(ONE, TWO, THREE),
                Arguments.of(FOUR, MINUS_ONE, THREE)
        );
    }

    public static Stream<Arguments> subtractionParamsForTests() {
        return Stream.of(
                Arguments.of(THREE, TWO, ONE),
                Arguments.of(THREE, MINUS_ONE, FOUR)
        );
    }

    public static Stream<Arguments> multiplicationParamsForTests() {
        return Stream.of(
                Arguments.of(THREE, ONE, THREE),
                Arguments.of(ZERO, FOUR, ZERO)
        );
    }

    public static Stream<Arguments> divisionParamsForTests() {
        return Stream.of(
                Arguments.of(THREE, ONE, THREE),
                Arguments.of(FOUR, TWO, TWO)
        );
    }


}
