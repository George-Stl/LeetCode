package leetcode.easy;

public class BalancedBinaryTree_110 {
    public static void main(String[] args) {
        BalancedBinaryTree_110 bbt = new BalancedBinaryTree_110();
        TreeNode node = new TreeNode(1);
        bbt.isBalanced(node);
    }

    public boolean isBalanced(TreeNode root) {
        Short step = (short) 0;
        if (root == null) {
            return true;
        }
        if (root.left == null && root.right == null) {
            return true;
        }
        if (root.left == null || root.right == null)
        return step < (short) 2 && isBalanced(root.left, step) && isBalanced(root.right, step);
    }

    private boolean isBalanced(TreeNode root, Short step) {

    }
}
