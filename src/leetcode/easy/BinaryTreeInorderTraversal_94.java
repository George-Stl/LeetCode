package leetcode.easy;

import jdk.incubator.vector.VectorOperators;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }

public class BinaryTreeInorderTraversal_94 {
    public static void main(String[] args) {
        BinaryTreeInorderTraversal_94 btit = new BinaryTreeInorderTraversal_94();
        TreeNode node = new TreeNode(1);
        System.out.println(btit.inorderTraversal(node));
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> nodeStack = new Stack<>();
        List<Integer> resultList = new ArrayList<>();
        TreeNode current = root;
        while (current != null || !nodeStack.isEmpty()) {
            while (current != null) {
                nodeStack.push(current);
                current = current.left;
            }
            current = nodeStack.pop();
            resultList.add(current.val);
            current = current.right;
        }
        return resultList;
    }
}


