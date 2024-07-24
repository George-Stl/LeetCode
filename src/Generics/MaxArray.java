package Generics;
import Figures.Circle;
import Figures.Rectangle;

public class MaxArray <E extends Comparable<E>> implements Comparable<E>{
    private E value;
    @Override
    public int compareTo(E o){
        return value.compareTo(o);
    }
    public static <E extends Comparable<E>> E maxArray(E[] array){
        E maxValue = array[0];
        for(int i = 1; i < array.length; i++){
            if(maxValue.compareTo(array[i]) < 0){
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        Integer[] integers = new Integer[]{2, 3, 5, 1, -1};
        Double[] doubles = new Double[]{7.3, 4.1, 8.9};
        String[] strings = new String[]{"Сочи", "Геленджик", "Анапа", "Ялта"};
        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(3.2, "бежевый", 9.2);
        Circle circle3 = new Circle(2.4);
        Circle circle4 = new Circle(3.3);
        Circle[] listOfCircles = new Circle[]{circle1, circle2, circle3, circle4};
        System.out.println("Наибольший Integer: " + maxArray(integers));
        System.out.println("Наибольший double: " + maxArray(doubles));
        System.out.println("Наибольший String: " + maxArray(strings));
        System.out.println("Наибольший объект: " + maxArray(listOfCircles));
    }
}
