package Lesson_7;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;


public class NumberComparatorTest {

    @Test
    @DisplayName("Сравнение 2 и 1")
    public void testAreaTriangleWithCorrectResult() {
        assertEquals(true, NumberComparator.numberComparator(2,1), "Тест выполнился с ошибкой");
    }

    @Test
    @DisplayName("Сравнение 1 и 2") // с использованием assertTrue
    public void testAreaTriangleWithMistake() {
        assertTrue(NumberComparator.numberComparator(1,2), "Ошибка сравнения");
    }
}
