package Lesson_7;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AreaTriangleTest {

    @Test (description = "Площадь треугольника равна 1")
    public void testAreaTriangleWithCorrectResult() {
        assertEquals(1, AreaTriangle.getAreaTriangle(1,2));
    }

    @Test (description = "Площадь треугольника равна 2")
    public void testAreaTriangleWithMistake() {
        assertEquals(2, AreaTriangle.getAreaTriangle(1,2), "Ошибка выполнения теста"); // ошибка в expected result
    }

    @DataProvider(name = "triangleData")
    public Object[][] triangleDataProvider() {
        return new Object[][]{
                {3, 4, 6},
                {5, 2, 5},
                {10, 5, 25},
        };
    }

    @Test (description = "Параметризованного тест площади треугольника", dataProvider = "triangleData")
    void testAreaTriangleParameterized(double sideA, double height, double expectedArea) {
        assertEquals(expectedArea, AreaTriangle.getAreaTriangle(sideA, height));
   }
}
