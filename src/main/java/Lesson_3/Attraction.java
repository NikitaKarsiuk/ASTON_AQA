package Lesson_3;
import java.time.LocalTime;

public class Attraction {
    private String name;
    private LocalTime openingTime;
    private LocalTime closingTime;
    private double price;

    public Attraction(String name, LocalTime openingTime, LocalTime closingTime, double price)
    {
        this.name = name;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.price = price;
    }

    public void printInfo()
    {
        System.out.printf("Информация об аттракционе\nНазвание: %s\nВремя работы: %s - %s\nЦена: %.2f BYN\n\n", name, openingTime, closingTime, price);
    }
}
