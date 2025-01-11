package leetcode.easy;

import java.util.Arrays;
import java.util.Stack;

public class ArrayToBinarySearchTree_108 {
    public static void main(String[] args) {
        ArrayToBinarySearchTree_108 abst = new ArrayToBinarySearchTree_108();
        int[] nums = {-3, 1, 4, 6};
        abst.sortedArrayToBST(nums);
    }

    public TreeNode sortedArrayToBST(int [] nums) {
        return buildTree(nums, 0, nums.length - 1);
    }

    private TreeNode buildTree(int [] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = left + (right - left) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = buildTree(nums, left, mid - 1);
        node.right = buildTree(nums, mid + 1, right);
        return node;
    }

    public TreeNode sortedArrayToBSTSecondSolution(int [] nums) {
        if (nums.length == 1) {
            return new TreeNode(nums[0], null, null);
        }
        int size = nums.length;
        int rootIndex = size / 2;
        int i = 0;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(null);
        TreeNode currentLeft = null;
        while (i < rootIndex) {
            currentLeft = new TreeNode(nums[i], stack.pop(), null);
            stack.push(currentLeft); // передача по ссылке объекта?
            i++;
        }
        TreeNode currentRight = null;
        stack.clear();
        stack.push(null);
        int j = size - 1;
        while (j > rootIndex) {
            currentRight = new TreeNode(nums[j], null, stack.pop());
            stack.push(currentRight);
            j--;
        }

        return new TreeNode(nums[rootIndex], currentLeft, currentRight);
    }

    public TreeNode sortedArrayToBSTThirdSolution(int[] nums) {
        if (nums.length == 1) {
            return new TreeNode(nums[0], null, null);
        }
        if (nums.length == 2) {
            return new TreeNode(nums[1], new TreeNode(nums[0]), null);
        }
        int size = nums.length;
        int rootIndex = size / 2;
        int[] leftNums = Arrays.copyOfRange(nums, 0, rootIndex);
        int[] rightNums = Arrays.copyOfRange(nums, rootIndex + 1, size);

        return new TreeNode(nums[rootIndex], sortedArrayToBSTThirdSolution(leftNums),
                sortedArrayToBSTThirdSolution(rightNums));
    }
}
