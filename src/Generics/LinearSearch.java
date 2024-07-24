package Generics;

public class LinearSearch <E extends Comparable<E>> implements Comparable<E>{
    private E value;
    LinearSearch(E o){
        this.value = o;
    }
    @Override
    public int compareTo(E o){
        return this.value.compareTo(o);
    }
    public static <E extends Comparable<E>> int linearSearch(E [] array, E target){
        for(int i = 0; i < array.length; i++){
            if(target.compareTo(array[i]) == 0){
                return i;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        Integer[] list = {3, 4, 5, 1, -3, -5, -1};
        System.out.println(linearSearch(list, 2));
        System.out.println(linearSearch(list, 5));
    }
}
