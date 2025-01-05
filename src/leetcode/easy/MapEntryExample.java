package leetcode.easy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapEntryExample {

    public static void main(String[] args) {
        Map<String, Integer> fruits = new HashMap<>();
        fruits.put("apple", 1);
        fruits.put("banana", 2);
        fruits.put("pomelo", 3);
        System.out.println(fruits);
        Iterator<Map.Entry<String, Integer>> iterator = fruits.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> fruit = iterator.next();
            String fruitStr = fruit.getKey();
            Integer fruitInt = fruit.getValue();
            if (fruitStr.endsWith("a")) {
                iterator.remove();
            }
            if (fruitInt >= 3) {
                iterator.remove();
            }
        }
        System.out.println(fruits);

    }
}
