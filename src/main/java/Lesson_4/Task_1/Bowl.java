package Lesson_4.Task_1;

public class Bowl
{
    private int foodAmount;

    public Bowl(int foodAmount)
    {
        this.foodAmount = foodAmount;
    }

    public void addFood(int amount){
        foodAmount = foodAmount + amount;
        System.out.printf("В миску положили %d г. корма\n", amount);
    }

    public int getAmountOfFood()
    {
        return foodAmount;
    }

    public void changeAmountOfFood(int amount)
    {
        foodAmount = foodAmount - amount;
    }
}
