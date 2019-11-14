package leetcode;

public class p002_addTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode tail = new ListNode(1);
        ListNode head = tail;
        int level = 0;
        while (l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            ListNode tmp = new ListNode((x + y + level) % 10);
            tail.next = tmp;
            tail = tmp;
            level = (x + y + level) / 10;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        if (level != 0) {
            ListNode tmp = new ListNode(1);
            tail.next = tmp;
        }
        return head.next;
    }


    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        return null;
    }
}