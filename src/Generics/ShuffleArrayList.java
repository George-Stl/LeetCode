package Generics;

import java.util.ArrayList;
import java.util.Random;

public class ShuffleArrayList {
    public static <E> void shuffle(ArrayList<E> list){

        for(int i = 0 ; i < list.size(); i++){
            E temp = list.get(i);
            Random random = new Random();
            int randomIndex = random.nextInt(0, list.size());
            list.set(i, list.get(randomIndex));
            list.set(randomIndex, temp);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        shuffle(list);
        System.out.println("Перетасованный list: " + list);
    }
}
