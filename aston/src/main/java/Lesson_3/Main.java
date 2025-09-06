package Lesson_3;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025",
                "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Product("Samsung S24 Ultra", "01.02.2024",
                "Samsung Corp.", "Korea", 4599, false);
        productsArray[2] = new Product("Samsung S23 Ultra", "01.02.2023",
                "Samsung Corp.", "Korea", 3599, true);
        productsArray[3] = new Product("Samsung S22 Ultra", "01.02.2022",
                "Samsung Corp.", "Korea", 2599, false);
        productsArray[4] = new Product("Samsung S21 Ultra", "01.02.2021",
                "Samsung Corp.", "Korea", 1599, false);

        for (Product product : productsArray) {
            product.printInfo();
        }

        Park[] parksArray = new Park[2];

        parksArray[0] = new Park("Парк отдыха", new ArrayList<Attraction>()
        {
            {
            add(new Attraction("Карусель", LocalTime.of(9, 0), LocalTime.of(18, 0), 15.99));
            add(new Attraction("Ракушки", LocalTime.of(9, 0), LocalTime.of(18, 0), 10));
            add(new Attraction("Колесо обозрения", LocalTime.of(9, 0), LocalTime.of(22, 0), 25));
            }
        });

        parksArray[1] = new Park("Парк развлечений", new ArrayList<Attraction>()
        {
            {
                add(new Attraction("Вертелло-Крутилло", LocalTime.of(10, 0), LocalTime.of(17, 0), 2.28));
                add(new Attraction("Зеркало души", LocalTime.of(9, 0), LocalTime.of(18, 0), 1.90));
                add(new Attraction("Симулятор жизни", LocalTime.of(9, 0), LocalTime.of(18, 0), 0.90));
                add(new Attraction("Знаменитость", LocalTime.of(9, 0), LocalTime.of(18, 0), 0.90));
            }
        });

        for(Park park : parksArray)
        {
            park.printInfo();
            for (Attraction attraction : park.attractions){
                attraction.printInfo();
            }
        }
    }
}