package leetcode.easy;

import java.util.Arrays;

public class PlusOne_66 {
    public static void main(String[] args) {
        PlusOne_66 po = new PlusOne_66();
        int [] digits = {7, 8, 9};
        System.out.println(Arrays.toString(po.plusOne(digits)));
    }

    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;
        return newDigits;
    }
}
