package leetcode;

public class p025_reverseKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode pHead = head;
        int flag = 0;
        ListNode preTail = null;
        ListNode curTail = null;
        while (cur != null) {
            ListNode tmp = cur;
            int i = 0;
            while (tmp != null && i < k) {
                i++;
                tmp = tmp.next;
            }
            if (i == k) {
                int j = 0;
                while (j < k) {
                    if (j == 0) {
                        curTail = cur;
                    }
                    ListNode next = cur.next;
                    cur.next = pre;
                    pre = cur;
                    cur = next;
                    j++;
                }
                if (flag == 1) {
                    preTail.next = pre;
                } else {
                    pHead = pre;
                    flag = 1;
                }
                curTail.next = cur;
                preTail = curTail;
            } else {
                cur = null;
            }
        }
        return pHead;
    }
}
