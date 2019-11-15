package leetcode;

public class p206_reverseList {
    public ListNode reverseListRecursive(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode p = reverseListRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }
}