package Lesson_7;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class NumberComparatorTest {


    @Test(description = "Сравнение 2 и 1")
    public void testAreaTriangleWithCorrectResult() {
        assertEquals(true, NumberComparator.numberComparator(2,1), "Тест выполнился с ошибкой");
    }

    @Test(description = "Сравнение 1 и 2")
    public void testAreaTriangleWithMistake() {
        assertTrue(NumberComparator.numberComparator(1,2), "Ошибка сравнения");
    }
}
