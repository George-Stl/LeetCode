abstract class GeometricObject implements Comparable<GeometricObject> {
    protected String color;
    protected double weight;

    /** Заданный по умолчанию конструктор */
    protected GeometricObject() {
        color = "белый";
        weight = 1.0;
    }

    /** Создает геометрическую фигуру */
    protected GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    /** Getter-метод для цвета */
    public String getColor() {
        return color;
    }

    /** Setter-метод для цвета */
    public void setColor(String color) {
        this.color = color;
    }

    /** Getter-метод для веса */
    public double getWeight() {
        return weight;
    }

    /** Setter-метод для веса */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /** Абстрактный метод */
    public abstract double getArea();

    /** Абстрактный метод */
    public abstract double getPerimeter();

    public int compareTo(GeometricObject o) {
        if (this.getArea() < o.getArea())
            return -1;
        else if (getArea() == o.getArea())
            return 0;
        else
            return 1;

        // return getArea() < o.getArea() ? -1 : (getArea() == o.getArea() ? 0 : 1);
    }

    public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
        if (o1.compareTo(o2) > 0)
            return o1;
        else
            return o2;

        // return o1.compareTo(o2) ? o1 : o2;
    }
}