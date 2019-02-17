package Q2;

// Definition for singly-linked list.
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}

class Q2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newListNode;
        if (l1 == null) {
            newListNode = l2;
        } else if (l2 == null) {
            newListNode = l1;
        } else {
            if (l1.val + l2.val > 9) {
                newListNode = new ListNode(l1.val + l2.val - 10);
                newListNode.next = addTwoNumbers(new ListNode(1), addTwoNumbers(l1.next, l2.next));
            } else {
                newListNode = new ListNode(l1.val + l2.val);
                newListNode.next = addTwoNumbers(l1.next, l2.next);
            }
        }
        return newListNode;
    }

    public static void main(String[] args) {
        Q2 s = new Q2();
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = s.addTwoNumbers(l1, l2);
        System.out.println(result);
    }
}
