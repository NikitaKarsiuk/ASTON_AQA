package Lesson_4.Task_1;

public class Dog extends Animals
{
    private static final int MAX_RUN_DISTANCE = 500;
    private static final int MAX_SWIM_DISTANCE = 10;
    private static int dogCounter = 0;
    public Dog(String name) {
        super(name);
        dogCounter++;
    }

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE)
        {
            super.run(distance);
        }
        else
        {
            System.out.printf("%s не может пробежать более %d м.\n", name, MAX_RUN_DISTANCE);
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= MAX_SWIM_DISTANCE)
        {
            super.run(distance);
        }
        else
        {
            System.out.printf("%s не может проплыть более %d м.\n", name, MAX_SWIM_DISTANCE);
        }
    }

    public static void getCatAmount()
    {
        System.out.printf("Кол-во созданных собак: %x\n", dogCounter);
    }
}
