package Lesson_3;

import java.util.ArrayList;
import java.util.List;

public class Park {
    private String name;
    public List<Attraction> attractions;

    public Park(String name, List<Attraction> attractions)
    {
        this.name = name;
        this.attractions = attractions;
    }

    public void printInfo()
    {
        System.out.printf("Информация о парке\nНазвание: %s\n", name);
    }

    public  void printAttractionsInfo(){
        for(Attraction attraction : attractions)
        {
            attraction.printInfo();
        }
    }
}
