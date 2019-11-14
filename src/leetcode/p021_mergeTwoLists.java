package leetcode;
/*有序链表合并
方法一：迭代法
关键：新建一个假头结点用来解决链表头结点

* */
public class p021_mergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode preHead = new ListNode(-1);
        ListNode pre = preHead;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                pre.next = l1;
                pre = l1;
                l1 = l1.next;
            } else {
                pre.next = l2;
                pre = l2;
                l2 = l2.next;
            }
        }
        if (l1 == null) pre.next = l2;
        else pre.next = l1;
        return preHead.next;
    }

    public ListNode mergeTwoListsRer(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if(l1.val < l2.val){
            l1.next = mergeTwoListsRer(l1.next,l2);
            return l1;
        }else {
            l2.next = mergeTwoListsRer(l1,l2.next);
            return l2;
        }
    }
}