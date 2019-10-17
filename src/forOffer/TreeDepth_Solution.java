package forOffer;

import leetcode.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class TreeDepth_Solution {
    public int TreeDepth(TreeNode root) {
        return TreeDepthCore(root);
    }

    private int TreeDepthCore(TreeNode root) {
        if (root == null) {
            return 0;
        } else
            return TreeDepth(root.left) > TreeDepth(root.right) ? TreeDepth(root.left) + 1 : TreeDepth(root.right) + 1;

    }

    private int TreeDepthCore1(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) {
            return 0;
        }
        queue.add(root);
        int level = 0, next = 0, cur = 1;
        while (!queue.isEmpty()) {
            TreeNode tmp = queue.poll();
            cur--;
            if (tmp.left != null) {
                next++;
                queue.add(tmp.left);
            }
            if (tmp.right != null) {
                next++;
                queue.add(tmp.right);
            }
            if (cur == 0) {
                System.out.println(tmp.val+" next = "+next);
                level++;
                cur = next;
                next = 0;
            }
        }
        return level;
    }
}
