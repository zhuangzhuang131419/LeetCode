package Q23;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergekSortedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    Comparator<ListNode> comparator = new Comparator<ListNode>() {
        @Override
        public int compare(ListNode o1, ListNode o2) {
            return o1.val - o2.val;
        }
    };

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }

        PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>(comparator);
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                priorityQueue.add(lists[i]);
            }
        }

        ListNode head = priorityQueue.poll();
        if (head == null) {
            return null;
        }
        ListNode curNode = head;
        if (head.next != null) {
            priorityQueue.add(head.next);
        }
        while (!priorityQueue.isEmpty()) {
            ListNode node = priorityQueue.poll();
            if (node.next != null) {
                priorityQueue.add(node.next);
            }
            curNode.next = node;
            curNode = curNode.next;
        }
        return head;

    }

}
