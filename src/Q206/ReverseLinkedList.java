package Q206;

import Q25.ReverseNodesKGroup;

/**
 * Reverse a singly linked list.
 */


public class ReverseLinkedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode pre = null;
        ListNode cur = head;
        ListNode next = head.next;

        while (next != null) {
            cur.next = pre;
            pre = cur;
            cur = next;
            next = next.next;
        }
        cur.next = pre;
        return cur;
    }

}
