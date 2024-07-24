package Figures;

public class ComparableCircle extends Circle {
    public ComparableCircle(){
        super(1, "белый", 1.0);
    }
    public ComparableCircle(double radius){
        super(radius, "синий", 1.0);
    }

    public ComparableCircle compareTo(Circle c){
        if(getArea() > c.getArea()){return this;}
        else return (ComparableCircle) c;
    }
    @Override
    public String toString(){
        return "Круг радиусом " + this.getRadius() + ", цвет " +
            this.getColor() + ", вес " + this.getWeight() + ".\n Площадь: " +
            this.getArea();
    }
}
