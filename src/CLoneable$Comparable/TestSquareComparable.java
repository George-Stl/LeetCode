package CLoneable$Comparable;

import Figures.Circle;
import Figures.Rectangle;
import Figures.Square;

public class TestSquareComparable {
    public static void main(String[] args) {
        GeometricObject[] objects = {new Square(2),
                new Circle(5), new Square(5),
                new Rectangle(3, 4), new Square(4.5)};

        for (int i = 0; i < objects.length; i++) {
            System.out.println("Площадь равна " + objects[i].getArea());
            if (objects[i] instanceof Colorable)
                ((Colorable)objects[i]).howToColor();
        }
    }
}
