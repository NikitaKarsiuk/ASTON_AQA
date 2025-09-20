package Lesson_7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {
    @Test
    @DisplayName("Факториал 0 должен быть равен 1")
    public void testFactorialZWithCorrectResult() {
        assertEquals(1, Factorial.getFactorial(0));
    }

    @Test
    @DisplayName("Факториал 1 должен быть равен 1")
    public void testFactorialZWithErrorResult() {
        assertEquals(1, Factorial.getFactorial(5)); //в getFactorial передали значение 5, а не 1
    }

    @Test
    @DisplayName("Пример сгрупированных утверждений для факториала")
    public void testFactorials() {
        assertAll("Факториалы",
                () -> assertEquals(1, Factorial.getFactorial(0)),
                () -> assertEquals(1, Factorial.getFactorial(1)),
                () -> assertEquals(2, Factorial.getFactorial(2)),
                () -> assertEquals(6, Factorial.getFactorial(3))
        );
    }
}
