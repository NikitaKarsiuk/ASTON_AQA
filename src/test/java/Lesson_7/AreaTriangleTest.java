package Lesson_7;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AreaTriangleTest {

    @Test
    @DisplayName("Площадь треугольника равна 1")
    public void testAreaTriangleWithCorrectResult() {
        assertEquals(1, AreaTriangle.getAreaTriangle(1,2));
    }

    @Test
    @DisplayName("Площадь треугольника равна 2")
    public void testAreaTriangleWithMistake() {
        assertEquals(2, AreaTriangle.getAreaTriangle(1,2)); // ошибка в expected result
    }

    @ParameterizedTest
    @DisplayName("Параметризованного тест площади треугольника")
    @CsvSource({
            "3, 4, 6",
            "5, 2, 5",
            "10, 5, 25",
    })
    void testAreaTriangleParameterized(double sideA, double height, double expectedArea) {
        assertEquals(expectedArea, AreaTriangle.getAreaTriangle(sideA, height));
    }

}
