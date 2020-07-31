package Q148;

/**
 * Sort a linked list in O(n log n) time using constant space complexity.
 */

public class SortList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode sortList(ListNode head) {

        head = mergeSort(head);
        return head;

    }

    public ListNode mergeSort(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode temp = slow.next;
        slow.next = null;

        head = mergeSort(head);
        temp = mergeSort(temp);
        return merge(head, temp);
    }

    public ListNode merge(ListNode n1, ListNode n2) {
        if (n1 == null) {
            return n2;
        }

        if (n2 == null) {
            return n1;
        }
        ListNode dummy = new ListNode();
        ListNode head = dummy;


        ListNode c1 = n1;
        ListNode c2 = n2;

        while (c1 != null || c2 != null) {
            if (c1 == null) {
                dummy.next = c2;
                c2 = c2.next;
            } else if (c2 == null) {
                dummy.next = c1;
                c1 = c1.next;
            } else if (c1.val < c2.val) {
                dummy.next = c1;
                c1 = c1.next;
            } else {
                dummy.next = c2;
                c2 = c2.next;
            }
            dummy = dummy.next;
        }
        return head.next;
    }
}
