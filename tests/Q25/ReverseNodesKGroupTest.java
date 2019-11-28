package Q25;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class ReverseNodesKGroupTest {
    ReverseNodesKGroup r = new ReverseNodesKGroup();

    @Test
    void reverseKGroup() {
        ReverseNodesKGroup.ListNode head = new ReverseNodesKGroup.ListNode(1);
        head.next = new ReverseNodesKGroup.ListNode(2);
        head.next.next = new ReverseNodesKGroup.ListNode(3);
        head.next.next.next = new ReverseNodesKGroup.ListNode(4);
        head.next.next.next.next = new ReverseNodesKGroup.ListNode(5);
        r.reverseKGroup(head, 2);

    }
}