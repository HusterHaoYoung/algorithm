package leetcode;


public class p024_swapPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode pHead = new ListNode(-1);
        pHead.next = head;
        if (head == null || head.next == null) return head;
        ListNode p1 = head;
        ListNode tail = pHead;
        while (p1 != null && p1.next != null) {
            ListNode p2 = p1.next;
            ListNode tmp = p2.next;
            p2.next = p1;
            p1.next = tmp;
            tail.next = p2;
            tail = p1;
            p1 = tmp;
        }
        return pHead.next;
    }
}
