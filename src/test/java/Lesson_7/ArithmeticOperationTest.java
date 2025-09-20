package Lesson_7;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ArithmeticOperationTest {
    @DataProvider(name = "additionData")
    public Object[][] additionDataProvider() {
        return new Object[][]{
                {3, 4, 7},
                {5, 2, 7},
                {10, 5, 16},
        };
    }

    @DataProvider(name = "subtractionData")
    public Object[][] subtractionDataProvider() {
        return new Object[][]{
                {3, 4, -1},
                {5, 2, 4},
                {10, 5, 5},
        };
    }

    @DataProvider(name = "divisionData")
    public Object[][] divisionDataProvider() {
        return new Object[][]{
                {3, 4, 0.75},
                {4, 2, 2},
                {10, 5, 3},
        };
    }

    @DataProvider(name = "multiplicationData")
    public Object[][] multiplicationDataProvider() {
        return new Object[][]{
                {3, 4, 12},
                {4, 2, 8},
                {10, 5, 50},
        };
    }

    @Test(description = "Параметризованный тест для сложения", dataProvider = "additionData")
    void testAdditionParameterized(int value_1, int value_2, int result) {
        assertEquals(result, ArithmeticOperation.addition(value_1, value_2));
    }

    @Test(description = "Параметризованный тест для вычитания", dataProvider = "subtractionData")
    void testSubtractionParameterized(int value_1, int value_2, int result) {
        assertEquals(result, ArithmeticOperation.subtraction(value_1, value_2));
    }

    @Test(description = "Параметризованный тест для деления", dataProvider = "divisionData")
    void testDivisionParameterized(int value_1, int value_2, double result) {
        assertEquals(result, ArithmeticOperation.divison(value_1, value_2));
    }

    @Test(description = "Параметризованный тест для умножения", dataProvider = "multiplicationData")
    void testMultiplicationParameterized(int value_1, int value_2, double result) {
        assertEquals(result, ArithmeticOperation.multiplication(value_1, value_2));
    }
}
