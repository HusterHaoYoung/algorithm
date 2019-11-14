package leetcode;

public class p082_deleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode pre = new ListNode(-1);
        ListNode pHead = pre;
        ListNode p = head;
        while (p != null) {
            ListNode tmp = p;
            while (p.next != null && p.next.val == tmp.val) p = p.next;
            if (p == tmp) {
                pre.next = tmp;
                pre = tmp;
            }
            p = p.next;
        }
        pre.next =null;
        return pHead.next;
    }
}
