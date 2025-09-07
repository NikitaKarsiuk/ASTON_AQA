package Lesson_4.Task_1;

public class Cat extends Animals
{
    private static final int MAX_RUN_DISTANCE = 200;
    private static int catCounter = 0;
    private boolean satiety = false;
    public Cat(String name) {
        super(name);
        catCounter++;
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
        System.out.printf("%s не умеет плавать!", name);
    }

    public void eat(int amount, Bowl bowl)
    {
        int amountOfFoodInBowl = bowl.getAmountOfFood();

        if(amount > amountOfFoodInBowl)
        {
            System.out.printf("В миске недостаточно кол-во корма (%d) для %s\n", amountOfFoodInBowl, name);
        }
        else
        {
            System.out.printf("%s съел %d г. корма из миски\n", name, amount);
            bowl.changeAmountOfFood(amount);
            satiety = true;
        }
    }

    public void catSatiety(){
        System.out.println(satiety ? name + " сытый" : name + " голодоный");
    }
    public static void getCatAmount(){
        System.out.printf("Кол-во созданных котов: %x\n", catCounter);
    }
}
