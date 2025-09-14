package Lesson_6;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;

public class Main {

    public  static void expelStudent(Set<Student> students)
    {
        students.removeIf(student -> {
            if (student.getStudentAvgGrades() < 3) {
                System.out.printf("Отчислен студент %s, %d курса, группа %s \n", student.getName(), student.getCourse(), student.getGroup());
                return true;
            }
            return false;
        });
    }

    public  static void transferStudentOnNextCourse(Set<Student> students)
    {
       for(Student student : students)
       {
           if(student.getStudentAvgGrades() >= 3)
           {
               student.transferStudentOnNextCourse();
               System.out.printf("Студент %s, группы %s переведен на следующий курс\n", student.getName(), student.getGroup());
           }
       }
    }

    public  static void PrintStudent(Set<Student> students, int course)
    {
        for(Student student : students)
        {
            if(student.getCourse() == course)
            {
                System.out.printf("Студент %s из группы %s обучается на %d курсе\n", student.getName(), student.getGroup(), student.getCourse());
            }
        }
    }

    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student("Никита", "Т691", 1, Map.of("Математика", 3.0, "История", 4.0, "Русский язык", 1.0)));
        students.add(new Student("Иван", "Т692", 1, Map.of("Математика", 1.0, "История", 1.0, "Русский язык", 1.0)));
        students.add(new Student("Александр", "Т693", 1, Map.of("Математика", 3.0, "История", 4.0, "Русский язык", 4.0)));
        students.add(new Student("Максим", "Т694", 1, Map.of("Математика", 3.0, "История", 3.0, "Русский язык", 3.0)));

        expelStudent(students);
        transferStudentOnNextCourse(students);
        PrintStudent(students, 2);

//        TelephoneDirectory telephoneDirectory = new TelephoneDirectory();
//        telephoneDirectory.add("Карсюк", "+375(29)111-11-11");
//        telephoneDirectory.add("Карсюк", "+375(29)111-11-15");
//        telephoneDirectory.add("Морозов", "+375(29)111-11-11");
//        telephoneDirectory.add("Карсюк", "+375(29)111-11-17");
//
//        String surname = "Морозов";
//        System.out.printf("Номера телефонов по фамилии: %s, %s", surname, telephoneDirectory.get(surname));

    }
}