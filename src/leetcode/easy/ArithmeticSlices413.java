package leetcode.easy;

public class ArithmeticSlices413 {
    public static void main(String[] args) {
        ArithmeticSlices413 as = new ArithmeticSlices413();
        int[] nums = new int [] {1, 2, 3, 4, 1};
        System.out.println(as.numberOfArithmeticSlices(nums));
    }
    public int numberOfArithmeticSlices(int[] nums) {
        int curr = 0, sum = 0;
        for (int i=2; i<nums.length; i++)
            if (nums[i]-nums[i-1] == nums[i-1]-nums[i-2]) {
                curr += 1;
                sum += curr;
            } else {
                curr = 0;
            }
        return sum;
    }
}
