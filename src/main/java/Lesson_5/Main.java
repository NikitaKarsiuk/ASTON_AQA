package Lesson_5;

import static java.lang.Integer.parseInt;

public class Main {

    static class MyArraySizeException extends Exception {
        public MyArraySizeException(String message) {
            super(message);
        }
    }

    static class MyArrayDataException extends Exception {
        public MyArrayDataException(String message) {
            super(message);
        }
    }

    public static int SumArray(String[][] array) throws MyArraySizeException, MyArrayDataException
    {
        int sum = 0;

        if(array.length != 4)
        {
            throw new MyArraySizeException("Массив должен быть размером 4х4");
        }

        for(int i = 0; i < array.length; i++)
        {
            if(array[i].length != 4)
            {
                throw new MyArraySizeException("Массив должен юыть размером 4x4");
            }
        }

        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
            {
                try
                {
                    sum += Integer.parseInt(array[i][j]);
                }
                catch (NumberFormatException e)
                {
                    throw new MyArrayDataException("Неверные данные в ячейке " + (i + 1) + " " + (j + 1));
                }
            }
        }

        return  sum;
    }

    public  static void ArrayIndexOutOfBoundsTask (int[] array, int index) throws  ArrayIndexOutOfBoundsException
    {
        try
        {
            array[index] = 1;
        }
        catch (ArrayIndexOutOfBoundsException exception)
        {
            System.out.println("Ошибка, индекс вышел за пределы массива");
        }
    }
    public static void main(String[] args){
        String[][] arrayTask1 =  {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
        };

        int[] arrayTask2 = {1,2,3,4,5};

        try {
            System.out.printf("Сумма массива: %d \n", SumArray(arrayTask1));
            ArrayIndexOutOfBoundsTask(arrayTask2, 6);
        }
        catch (MyArraySizeException | MyArrayDataException exception)
        {
            System.out.println(exception);
        }
    }
}