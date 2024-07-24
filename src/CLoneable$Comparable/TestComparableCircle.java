package CLoneable$Comparable;

import Figures.ComparableCircle;
import Figures.Rectangle;
import Figures.GeometricObject;

public class TestComparableCircle {
    public static void main(String[] args) {
        GeometricObject circle1 = new ComparableCircle(4);
        GeometricObject circle2 = new ComparableCircle(5.5);
        GeometricObject rectangle1 = new Rectangle(20, 4);


        System.out.println("Площадь первого круга: " + circle1.getArea() + "\n" +
                "Площадь второго круга: " + circle2.getArea());
        System.out.println("Наибольший из двух кругов: " +
                GeometricObject.max(circle1, circle2));
        System.out.println("Площадь прямоугольника: " + rectangle1.getArea());
        System.out.println("Наибольший объект - прямоугольник или круг1: " +
                GeometricObject.max(rectangle1, circle1));
    }
}
