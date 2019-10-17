package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class WidthOfBinaryTree_662_Solution {
    public int widthOfBinaryTree(TreeNode root) {
        Queue<TreeNodePlusSer> queue = new LinkedList<>();
        queue.add(new TreeNodePlusSer(root, 1, 0));
        int left = 1;
        int level = 0;
        int width = 0;
        while (!queue.isEmpty()) {
            TreeNodePlusSer tmp = queue.poll();
            if (tmp != null) {
                if (level < tmp.level) {
                    level = tmp.level;
                    left = tmp.num;
                }
                width = Math.max(width, tmp.num - left + 1);
                if(tmp.root.left!=null)
                    queue.add(new TreeNodePlusSer(tmp.root.left, 2 * tmp.num, tmp.level + 1));
                if(tmp.root.right!=null)
                    queue.add(new TreeNodePlusSer(tmp.root.right, 2 * tmp.num + 1, tmp.level + 1));
            }
        }
        return width;
    }

}

class TreeNodePlusSer {
    TreeNode root;
    int num;
    int level;

    TreeNodePlusSer(TreeNode x, int y, int z) {
        root = x;
        num = y;
        level = z;
    }
}