class Circle extends GeometricObject {
    protected double radius;

    /**
     * Заданный по умолчанию конструктор
     */
    public Circle() {
        this(1.0, "белый", 1.0);
    }

    /**
     * Создает круг с указанным радиусом
     */
    public Circle(double radius) {
        super("белый", 1.0);
        this.radius = radius;
    }

    /**
     * Создает круг с указанным радиусом, весом и цветом
     */
    public Circle(double radius, String color, double weight) {
        super(color, weight);
        this.radius = radius;
    }

    /**
     * Getter-метод для радиуса
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Setter-метод для радиуса
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Реализует абстрактный метод getArea класса GeometricObject
     */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /**
     * Реализует абстрактный метод getPerimeter класса GeometricObject
     */
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /**
     * Переопределяет метод equals, определенный в классе Object
     */
    @Override
    public boolean equals(Object circle) {
        return this.radius == ((Circle) circle).getRadius();
    }

    @Override
    public String toString() {
        return "[круг] радиус = " + radius + " Площадь " + this.getArea();
    }
}