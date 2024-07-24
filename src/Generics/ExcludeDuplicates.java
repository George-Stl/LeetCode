package Generics;

import java.util.ArrayList;
import java.util.List;

public class ExcludeDuplicates<E> {
    public static <E> ArrayList<E> excludeDuplicates(ArrayList<E> obj){
        ArrayList<E> withoutDuplicates = new ArrayList<>();
        while(!obj.isEmpty()){
            if(!withoutDuplicates.contains(obj.get(obj.size() - 1))){
                withoutDuplicates.add(obj.remove(obj.size() - 1));
            }
            else{
                obj.remove(obj.size() - 1);
            }
        }
        return withoutDuplicates;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(List.of(new Integer[]{2, 3, 4, 5, 6, 3, 2, 5, 3, 6, 7, 8}));
        System.out.println("Коллекция: " + list);
        System.out.println("Без дубликатов: " + excludeDuplicates(list));

    }
}
