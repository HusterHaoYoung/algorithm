package leetcode;

public class ReverseList_206_Solution {
    public ListNode myReverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode pHead = new ListNode(-1);
        pHead.next = head;
        ListNode h = head;
        ListNode tail = head;
        ListNode tmp = head.next;
        while (tmp != null) {
            ListNode next = tmp.next;
            tmp.next = h;
            tail.next = next;
            h = tmp;
            tmp = next;
        }
        pHead.next = h;
        return pHead.next;
    }

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