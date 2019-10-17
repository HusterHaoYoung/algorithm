package leetcode;

public class IsValidBST_98_Solution {
    public boolean isValidBST(TreeNode root) {
        if (root == null)
            return true;
        return isValidBSTCore(root, Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    private boolean isValidBSTCore(TreeNode root, int min, int max) {
        if (root == null)
            return true;
        if (root.left != null) {
            if (root.left.val >= root.val || (min != Integer.MAX_VALUE) && (root.left.val <= min)) {
                return false;
            }
        }
        if (root.right != null) {
            if (root.right.val <= root.val ||(max != Integer.MIN_VALUE) && root.right.val >= max){
                return false;
            }
        }
        return isValidBSTCore(root.left, min, root.val) && isValidBSTCore(root.right, root.val, max);
    }
}
