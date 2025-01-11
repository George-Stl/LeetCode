package leetcode.easy;

import java.util.Stack;

public class SymmetricTree_101 {
    public static void main(String[] args) {
        SymmetricTree_101 st = new SymmetricTree_101();
        TreeNode root = new TreeNode(1);
        System.out.println(st.isSymmetric(root));
    }
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null) {
            return false;
        }
        return node1.val == node2.val && isMirror(node1.left, node2.right)
                && isMirror(node1.right, node2.left);
    }



    public boolean isSymmetricSecondSolution(TreeNode root) {
        Stack<TreeNode> leftStack = new Stack<>();
        Stack<TreeNode> rightStack = new Stack<>();
        leftStack.push(root.left);
        rightStack.push(root.right);

        while (!leftStack.isEmpty() && !rightStack.isEmpty()) {
            TreeNode currentLeft = leftStack.pop();
            TreeNode currentRight = rightStack.pop();
            if (currentLeft == null && currentRight == null) {
                continue;
            }
            if (currentLeft == null || currentRight == null) {
                return false;
            }
            if (currentLeft.val != currentRight.val) {
                return false;
            }
            leftStack.push(currentLeft.left);
            leftStack.push(currentLeft.right);
            rightStack.push(currentRight.right);
            rightStack.push(currentRight.left);
        }
        return leftStack.isEmpty() && rightStack.isEmpty();
    }
}
