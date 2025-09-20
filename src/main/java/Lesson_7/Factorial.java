package Lesson_7;

public class Factorial {
    public static int getFactorial(int value)
    {
        int result = 1;

        for(int number = 1; number <= value; number++){
            result = result * number;
        }

        return result;
    }
}
