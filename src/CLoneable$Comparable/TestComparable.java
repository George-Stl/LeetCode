package CLoneable$Comparable;
import Figures.Circle;
import Figures.Rectangle;
import Figures.GeometricObject;

public class TestComparable {
    public static void main(String[] args) {
        // Создать два сравнимых круга
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(4);

        // Отобразить наибольший круг
        Circle circle = (Circle) GeometricObject.max(circle1, circle2);
        System.out.println("Радиус наибольшего круга равен " + circle.getRadius());
        System.out.println(circle);

        // Создать два сравнимых прямоугольника
        Rectangle r1 = new Rectangle(5, 4);
        Rectangle r2 = new Rectangle(4, 5);

        System.out.println(r1.compareTo(r2));
        System.out.println("Наибольший прямоугольник равен " + GeometricObject.max(r1, r2));

        System.out.println("Наибольшая геометрическая фигура равна " + GeometricObject.max(circle1, r2));
    }
}