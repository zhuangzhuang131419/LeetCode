package Q109;

import java.util.List;

public class ConvertSortedListtoBinarySearchTree {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        ListNode pre = null;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        TreeNode root = new TreeNode(slow.val);

        if (head == slow) {
            return root;
        }
        if (pre != null) {
            pre.next = null;
        }


        root.left = sortedListToBST(head);
        root.right = sortedListToBST(slow.next);

        // slow is point to the middle of the list


        return root;
    }
}
