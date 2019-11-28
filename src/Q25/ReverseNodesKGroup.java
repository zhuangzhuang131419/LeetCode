package Q25;

/**
 * Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.
 *
 * k is a positive integer and is less than or equal to the length of the linked list.
 * If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it is.
 */

public class ReverseNodesKGroup {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) return new ListNode(1);
        if (head.next == null) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode cur = dummy;
        while (cur != null) {
            cur = reverseK(cur, k);
        }


        return dummy.next;
    }

    private ListNode reverseK(ListNode head, int k) {
        // head -> n1 -> n2 ... nk -> nk+1 ...
        // ==>
        // head -> nk -> nk-1...n1 -> nk+1...
        // return n1

        ListNode n1 = head.next;
        ListNode nk = head;
        for (int i = 0; i < k; i++) {
            nk = nk.next;
            if (nk == null) {
                return null;
            }
        }
        ListNode nkPlus1 = nk.next;
        ListNode cur = n1;
        ListNode prev = null;
        while (cur != nkPlus1) {
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }

        head.next = nk;
        n1.next = nkPlus1;
        return n1;
    }

}
