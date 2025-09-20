package Lesson_7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticOperationTest {
    @ParameterizedTest
    @DisplayName("Параметризованный тест для сложения")
    @CsvSource({
            "3, 4, 7",
            "5, 2, 7",
            "10, 5, 16",
    })
    void testAdditionParameterized(int value_1, int value_2, int result) {
        assertEquals(result, ArithmeticOperation.addition(value_1, value_2));
    }

    @ParameterizedTest
    @DisplayName("Параметризованный тест для вычитания")
    @CsvSource({
            "3, 4, -1",
            "5, 2, 4",
            "10, 5, 5",
    })
    void testSubtractionParameterized(int value_1, int value_2, int result) {
        assertEquals(result, ArithmeticOperation.subtraction(value_1, value_2));
    }

    @ParameterizedTest
    @DisplayName("Параметризованный тест для деления")
    @CsvSource({
            "3, 4, 0.75",
            "4, 2, 2",
            "10, 5, 3",
    })
    void testDivisionParameterized(int value_1, int value_2, double result) {
        assertEquals(result, ArithmeticOperation.divison(value_1, value_2));
    }

    @ParameterizedTest
    @DisplayName("Параметризованный тест для умножения")
    @CsvSource({
            "3, 4, 12",
            "4, 2, 8",
            "10, 5, 50",
    })
    void testMultiplicationParameterized(int value_1, int value_2, double result) {
        assertEquals(result, ArithmeticOperation.multiplication(value_1, value_2));
    }
}
