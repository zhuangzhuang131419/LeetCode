package Q25;

public class ReverseNodesKGroup {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null && head.next == null) return head;

        ListNode start = head;
        ListNode end = start;
        for (int i = 0; i < k; i++) {
            if (end.next != null) {
                end = end.next;
            } else {
                return head;
            }
        }

//        while (start != end && )



        return head;
    }

}
