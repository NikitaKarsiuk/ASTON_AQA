package Lesson_4.Task_1;

public class Animals {

    public String name;
    private static int animalCounter = 0;

    public Animals (String name)
    {
        this.name = name;
        animalCounter++;
    }

    public void run(int distance) {
        System.out.printf("%s пробежал %d м.\n", name, distance);
    }

    public void swim(int distance) {
        System.out.printf("%s проплыл %d м.\n", name, distance);
    }

    public static void getCatAmount(){
        System.out.printf("Кол-во созданных животных: %x\n", animalCounter);
    }
}
