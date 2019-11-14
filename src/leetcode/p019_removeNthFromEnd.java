package leetcode;

public class p019_removeNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        ListNode pHead = new ListNode(-1);
        ListNode pre = pHead;
        pHead.next = head;
        for (int i = 0; i < n - 1; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next;
        }
        pre.next = slow.next;
        return pHead.next;
    }
}
