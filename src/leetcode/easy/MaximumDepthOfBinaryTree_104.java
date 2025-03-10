package leetcode.easy;

public class MaximumDepthOfBinaryTree_104 {
    public static void main(String[] args) {
        MaximumDepthOfBinaryTree_104 mdbt = new MaximumDepthOfBinaryTree_104();
        TreeNode root = new TreeNode(1);
        mdbt.maxDepth(root);
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public int maxDepthSecondSolution(TreeNode root) {
        int depth = 0;
        if (root == null) {
            return depth;
        }
        depth++;
        return Integer.max(depth(root.left, depth), depth(root.right, depth));
    }

    private int depth(TreeNode node, int currDepth) {
        if (node == null) {
            return currDepth;
        }
        currDepth++;

        return Integer.max(depth(node.left, currDepth), depth(node.right, currDepth));
    }
}
