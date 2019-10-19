package Q24;

import java.util.List;

public class SwapNodesInPairs {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
}

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode i = head;
        ListNode j = head.next;

        while (i != null && j != null) {
            int temp = i.val;
            i.val = j.val;
            j.val = temp;

            i = j.next;
            if (i != null) {
                j = i.next;
            }
        }
        return head;
    }
}
