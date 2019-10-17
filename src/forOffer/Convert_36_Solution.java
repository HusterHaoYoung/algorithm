package forOffer;

import leetcode.TreeNode;

public class Convert_36_Solution {
    private TreeNode head;
    private TreeNode tail;

    public TreeNode Convert(TreeNode pRootOfTree) {
        midVisit(pRootOfTree);
        return head;
    }
    void midVisit(TreeNode root){
        if(root == null){
            return;
        }
        midVisit(root.left);
        createList(root);
        midVisit(root.right);
    }
    void createList(TreeNode root){
        if(head == null){
            head = root;
            tail = head;
        }else {
            tail.right = root;
            root.left = tail;
            tail = root;
        }
    }
}