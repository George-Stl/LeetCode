package Figures;

public class Square extends GeometricObject
        implements Colorable {
    private double side;
    public Square(){
        super("оранжевый", 1.0);
        this.side = 0;
    }
    public Square(double side){
        super("красный", 1.5);
        this.side = side;
    }
    double getSide(){
        return this.side;
    }
    void setSide(double side){
        this.side = side;
    }
    @Override
    public double getArea(){
        return side*side;
    }
    @Override
    public double getPerimeter(){
        return side*4;
    }
    @Override
    public void howToColor(){
        System.out.println("Раскрасьте все четыре стороны");
    }
    @Override
    public String toString(){
        return "[квадрат] сторона = " + this.getSide() +
        " Площадь: " + this.getArea();
    }
}
