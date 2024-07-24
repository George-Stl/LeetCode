import Figures.Circle;
import Figures.Rectangle;
import Figures.Square;
import Figures.GeometricObject;

public class TestSumArea {
    public static double sumArea(GeometricObject[] arrayObjects){
        double sumArea = 0;
        for(GeometricObject obj : arrayObjects){
            sumArea += obj.getArea();
        }
        return sumArea;
    }
    public static void main(String[] args) {
        GeometricObject[] objects = new GeometricObject[4];
        objects[0] = new Circle(7.1);
        objects[1] = new Square(4.5);
        objects[2] = new Circle(8.9);
        objects[3] = new Rectangle(3.2, 8);

        System.out.println("Объекты: ");
        for(GeometricObject obj : objects){
            System.out.println(obj);
        }
        System.out.println("Суммарная площадь: " + sumArea(objects));
    }
}
