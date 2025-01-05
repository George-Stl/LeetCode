package leetcode.easy;

public class SearchInsertPosition_35 {
    public static void main(String[] args) {
        SearchInsertPosition_35 sip = new SearchInsertPosition_35();
        int [] nums = {1,3,5,6}; // length = 4; index 0:3
        int target = -1; //2 5 7
        System.out.println(sip.searchInsert(nums, target));
    }
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int half = (end + start) / 2;
            if (nums[half] == target) {
                return half;
            } else if (nums[half] > target) {
                end = half - 1;
            } else if (nums[half] < target) {
                start = half + 1;
            }
        }
        return start;
    }
}
