package leetcode.easy;

public class SameTree_100 {
    public static void main(String[] args) {
        SameTree_100 st = new SameTree_100();
        TreeNode p = new TreeNode(1);
        TreeNode q = new TreeNode(2);
        st.isSameTree(p, q);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
