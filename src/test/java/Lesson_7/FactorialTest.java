package Lesson_7;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertEquals;

public class FactorialTest {
    @Test(description = "Факториал 0 должен быть равен 1")
    public void testFactorialZWithCorrectResult() {
        assertEquals(1, Factorial.getFactorial(0));
    }

    @Test(description = "Факториал 1 должен быть равен 1")
    public void testFactorialZWithErrorResult() {
        assertEquals(1, Factorial.getFactorial(5)); //в getFactorial передали значение 5, а не 1
    }

    @Test(description = "Пример сгрупированных утверждений для факториала")
    public void testFactorials() {
        SoftAssert softAssert = new SoftAssert();

                softAssert.assertEquals(1, Factorial.getFactorial(0));
                softAssert.assertEquals(1, Factorial.getFactorial(1));
                softAssert.assertEquals(2, Factorial.getFactorial(2));
                softAssert.assertEquals(6, Factorial.getFactorial(3));

                softAssert.assertAll();
    }
}
