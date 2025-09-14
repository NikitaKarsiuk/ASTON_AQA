package Lesson_6;

import java.util.Map;

public class Student {
    private String name;
    private String group;
    private  int course;
    private Map<String, Double> lessonGrade;
    public  Student(String name, String group, int course, Map<String, Double> lessonGrade)
    {
        this.name = name;
        this.group = group;
        this.course = course;
        this.lessonGrade = lessonGrade;
    }

    public double getStudentAvgGrades()
    {
        double avgGrades = 0;
        for (double grade : lessonGrade.values())
        {
            avgGrades += grade;
        }
        return avgGrades / lessonGrade.size();
    }

    public String getName(){
        return name;
    }

    public  String getGroup(){
        return group;
    }

    public int getCourse(){
        return course;
    }

    public void transferStudentOnNextCourse()
    {
        course++;
    }
}
