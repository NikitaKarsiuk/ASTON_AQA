package Lesson_3;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Park {
    private String name;
    public List<Lesson_3.Park.Attraction> attractions;

    public Park(String name, List<Lesson_3.Park.Attraction> attractions)
    {
        this.name = name;
        this.attractions = attractions;
    }

    public void printInfo()
    {
        System.out.printf("Информация о парке\nНазвание: %s\n", name);
    }

    public  void printAttractionsInfo(){
        for(Lesson_3.Park.Attraction attraction : attractions)
        {
            attraction.printInfo();
        }
    }

    public static class Attraction {
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

}
