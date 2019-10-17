package forOffer;

import leetcode.TreeNode;

public class KthNode_Solution {
    int cnt;
    TreeNode ans;

    TreeNode KthNode(TreeNode pRoot, int k) {
        if (k <= 0)
            return null;
        cnt = 0;
//        find(pRoot);
        prefind(pRoot,0);
        return ans;
    }

    private void find(TreeNode root) {
        if (root == null) return;
        find(root.left);
        if (--cnt == 0) {
            ans = root;
        }
        find(root.right);

    }

    private void prefind(TreeNode root, int k) {
        if (root == null) return;
        if (cnt == k - 1) {
            ans = root;
            return;
        }
        if (k < cntNode(root.left) + 1){
            prefind(root.left, k);
        }
        else{
            prefind(root.right, k);
            cnt = cnt + cntNode(root.left) + 1;
        }

    }

    int cntNode(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        } else
            return cntNode(root.left) + cntNode(root.right) + 1;

    }
}
