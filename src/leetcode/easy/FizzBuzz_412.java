package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz_412 {
    public static void main(String[] args) {
        FizzBuzz_412 fizzBuzz412 = new FizzBuzz_412();
        System.out.print(fizzBuzz412.fizzBuzz(15));
    }

    public List<String> fizzBuzz(int n) {
        List<String> fb = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                fb.add("FizzBuzz");
            } else if (i % 3 == 0) {
                fb.add("Fizz");
            } else if (i % 5 == 0) {
                fb.add("Buzz");
            } else {
                fb.add(String.valueOf(i));
            }
        }
        return fb;
    }
}