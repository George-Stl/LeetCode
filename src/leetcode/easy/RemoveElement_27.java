package leetcode.easy;

import java.util.*;

public class RemoveElement_27 {
    public static void main(String[] args) {
        RemoveElement_27 re = new RemoveElement_27();
        int [] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(re.removeElement(nums, val));
        System.out.println(Arrays.toString(nums));
    }

    public int removeElement(int[] nums, int val) {
        Queue<Integer> queue = new LinkedList<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                queue.offer(i);
            }
            if (nums[i] != val) {
                count++;
                if (!queue.isEmpty()) {
                    nums[queue.remove()] = nums[i];
                    nums[i] = val;
                    queue.offer(i);
                }
            }
        }
        return count;
    }
}
