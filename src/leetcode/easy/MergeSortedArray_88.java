package leetcode.easy;

import java.util.Arrays;

public class MergeSortedArray_88 {
    public static void main(String[] args) {
        MergeSortedArray_88 msa = new MergeSortedArray_88();
        int [] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int [] nums2 = {2, 5, 6};
        int n = 3;
        msa.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] < nums2[j]) {
                nums1[k] = nums2[j];
                j--;
            } else {
                nums1[k] = nums1[i];
                i--;
            }
            k--;
        }
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}
