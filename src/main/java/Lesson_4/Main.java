package Lesson_4;

import Lesson_4.Task_1.Bowl;
import Lesson_4.Task_1.Cat;
import Lesson_4.Task_2.Circle;
import Lesson_4.Task_2.GeometricShape;
import Lesson_4.Task_2.Rectangle;
import Lesson_4.Task_2.Triangle;

public class Main {

    private static void task_1(){
        Bowl bowl = new Bowl(100);

        Cat[] catArray = new Cat[]
                {
                  new Cat("Барсик"),
                        new Cat("Мурзик"),
                        new Cat("Васька"),
                        new Cat("Кузя")
                };

        for (Cat cat : catArray){
            cat.eat(35, bowl);
        }

        for (Cat cat : catArray){
            cat.catSatiety();
        }

        bowl.addFood(25);
        catArray[2].eat(35, bowl);
        catArray[2].catSatiety();
    }

    private static void task_2()
    {
        GeometricShape circle = new Circle(5, "Красный", "Черный");
        circle.printInfo();
        GeometricShape rectangle = new Rectangle(5, 10 , "Зеленый", "Синий");
        rectangle.printInfo();
        GeometricShape triangle = new Triangle(2,8,7, "Желтый", "Оранжевый");
        triangle.printInfo();
    }
    public static void main(String[] args) {
        //task_1();
        task_2();
    }
}