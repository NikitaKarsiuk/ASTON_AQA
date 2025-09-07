package Lesson_4.Task_2;

public interface GeometricShape {
    String getFillColor();
    String getBorderColor();
    double getArea();

    default double getPerimeter() {
        return 0.0;
    }

    default void printInfo() {
        System.out.printf("Периметр: %.2f, Площадь: %.2f, Цвет фона: %s, Цвет границ: %s\n", getPerimeter(), getArea(),getFillColor(), getBorderColor());
    }

}
