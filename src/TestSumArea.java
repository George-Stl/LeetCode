public class TestSumArea {
    public static double sumArea(GeometricObject[] arrayObjects){
        double sumArea = 0;
        for(GeometricObject obj : arrayObjects){
            sumArea += (Double) obj.getArea();
        }
        return sumArea;
    }
    public static void main(String[] args) {
        GeometricObject[] objects = new GeometricObject[4];
        objects[0] = new Circle(4);
        objects[1] = new Square(3);
        objects[2] = new Circle(3.5);
        objects[3] = new Rectangle(2, 4);

        System.out.println("Объекты: ");
        for(GeometricObject obj : objects){
            System.out.println(obj);
        }
        System.out.println("Суммарная площадь: " + sumArea(objects));
    }
}
