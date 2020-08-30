package Q234;

public class PalindromeLinkedList {

//    public static void main(String[] args) {
//
//        ListNode n4 = new ListNode(1);
//        ListNode n3 = new ListNode(2, n4);
//        ListNode n2 = new ListNode(1, n3);
//        ListNode n1 = new ListNode(1, n2);
//
//        System.out.println(isPalindrome(n1));
//    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        if (head.next.next == null) {
            return head.val == head.next.val;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return isEqual(head, reverse(slow.next));
    }

    public ListNode reverse(ListNode root) {
        if (root == null || root.next == null) {
            return root;
        }
        ListNode pre = null;
        ListNode cur = root;
        ListNode next = root.next;
        while (cur.next != null) {
            cur.next = pre;
            pre = cur;
            cur = next;
            next = cur.next;
        }
        cur.next = pre;
        return cur;
    }

    public boolean isEqual(ListNode n1, ListNode n2) {
        if (n1 == null || n2 == null) {
            return true;
        }

        if (n1.val == n2.val) {
            return isEqual(n1.next, n2.next);
        }

        return false;

    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
