package leetcode;

public class CountNodes_222_Solution {
    public int countNodes(TreeNode root) {
        if (root == null)
            return 0;
        return countNodeCore(root);
    }

    private int countNodeCore(TreeNode root) {
        int ans = 0;
        if (root.left == null) return 1;
        if (depth(root.left) == depth(root.right) + 1)
            ans = countNodeCore(root.left) + (int) Math.pow(2, depth(root.right));
        else
            ans = countNodeCore(root.right) + (int) Math.pow(2, depth(root.left));
        return ans;
    }

    private int depth(TreeNode root) {
        int ans = 0;
        while (root != null) {
            ans++;
            root = root.left;
        }
        return ans;
    }
}
