public class TestOctagon {
    public static void main(String[] args) {
        Octagon octagon = new Octagon(5);
        System.out.println(octagon);
        System.out.println("Периметр: " + octagon.getPerimeter());

        Octagon cloneOctagon = octagon.clone();
        System.out.println("Клонированный объект Octagon: " + cloneOctagon);
        Octagon anotherOctagon = new Octagon(7);
        System.out.println("Сравнение двух объектов: " +
                octagon.compareTo(anotherOctagon));
        System.out.println("Сравнение двух объектов: " +
                octagon.equals(cloneOctagon));
    }
}
