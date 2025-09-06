package Lesson_2;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void printThreeWords()
    {
        System.out.println("Orange\nBanana\nApple");
    }
    public static void checkSumSign()
    {
        int a = 0, b = 10;

        System.out.println(a + b >= 0 ? "Сумма положительная" : "Сумма отрицательная");
    }

    public static void printColor() //имеются вопросы
    {
        int value = 101;

        if (value <= 0)
        {
            System.out.println("Красный");
        }
        else if (value <= 100)
        {
            System.out.println("Желтый");
        }
        else
        {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers()
    {
        int a = 5, b = 5;
        System.out.println(a >= b ? "a >= b" : "a <= b");
    }
    public static boolean rangeOfNumbers(int value_1, int value_2)
    {
        return value_1 + value_2 >= 10 && value_1 + value_2 <= 20;
    }

    public static void checkOfNumber(int value)
    {
        System.out.println(value >= 0 ? "Положительное число" : "Отрицательное число");
    }
    public static boolean returnOfNumber(int value)
    {
        return value >= 0 ? false : true;
    }

    public static void printString(String value, int count)
    {
        for(int i = 0; i < count; i++){
            System.out.println(value);
        }
    }

    public  static  boolean checkForLeapYear(int year){
        if (year % 4 != 0)
        {
            return false;
        }
        else if(year % 100 != 0)
        {
            return true;
        }
        else
        {
            return year % 400 == 0;
        }
    }

    public static void changeNumbersOfArray()
    {
        int[] array = new int[] { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for (int i = 0; i < array.length; i++)
        {
            if(array[i] == 0)
            {
                array[i] = 1;
            }
            else {
                array[i] = 0;
            }
        }
    }

    public static void fillingAnArray()
    {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = i + 1;
        }
    }

    public static void changeNumbersLessNumber(){
        int[] array = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };

        for (int i = 0; i < array.length; i++){
            if(array[i] < 6)
            {
                array[i] = array[i] * 2;
            }
        }
        printArrayForTest(array);
    }

    public static void squareArray(int size){
        int[][] array = new int[size][size];
        fillArray(array);
        printSquareArrayForTest(array);
    }

    public static int[][] fillArray(int[][] array)
    {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array.length; j++)
            {
                if (i == j || i + j == array.length - 1)
                {
                    System.out.print("Input number: ");
                    array[i][j] = scanner.nextInt();
                }
                else
                {
                    array[i][j] = 0;
                }
            }
        }
        return array;
    }

    public static int[] returnsArrayWithOneNumber(int len, int initialValue)
    {
        int[] array = new int[len];
        for (int i = 0; i < len; i++)
        {
            array[i] = initialValue;
        }

        printArrayForTest(array);
        return array;
    }

    public static void printArrayForTest(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printSquareArrayForTest(int[][] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array.length; j++)
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(rangeOfNumbers(3,6)); //Вывод для теста
        checkOfNumber(5);
        System.out.println(returnOfNumber(0));//Вывод для теста
        printString("test", 1);
        System.out.println(checkForLeapYear(100));//Вывод для теста
        changeNumbersOfArray();
        fillingAnArray();
        changeNumbersLessNumber();
        squareArray(4);
        returnsArrayWithOneNumber(5,2);
    }
}