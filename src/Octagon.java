
import Figures.GeometricObject;

public class Octagon extends GeometricObject implements Comparable<GeometricObject>, Cloneable {

    private double side;

    Octagon(){
        this(0);
    }

    Octagon(double side){
        this.side = side;
    }

    double getSide(){
        return side;
    }
    void setSide(double side){
        this.side = side;
    }
    @Override
    public double getArea() {
        return (2 + 4/Math.sqrt(2)) * side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 8;
    }

    @Override
    public int compareTo(GeometricObject o) {
        return getSide() > ((Octagon)o).getSide() ? 1 : (getSide() < ((Octagon)o).getSide() ? -1 : 0);
    }
    @Override
    public boolean equals(Object o){
        return getSide() - ((Octagon)o).getSide() == 0;
    }
    public Octagon clone(){
        try{
            return (Octagon)super.clone();
        }catch(CloneNotSupportedException e){
            return null;
        }

    }
    public String toString(){
        return "[восьмиугольник] сторона: " + getSide() +
                " площадь: " + getArea();
    }
}
