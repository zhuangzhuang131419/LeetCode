package Q173;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Implement an iterator over a binary search tree (BST). Your iterator will be initialized with the root node of a BST.
 *
 * Calling next() will return the next smallest number in the BST.
 */

public class BinarySearchTreeIterator {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    class BSTIterator {

        Stack<TreeNode> q = new Stack<>();
        TreeNode cur;

        public BSTIterator(TreeNode root) {
            if (root != null) {
                cur = root;
                q.add(cur);
            }
        }

        /** @return the next smallest number */
        public int next() {

            if (q.isEmpty()) return -1;
            while (cur.left != null) {
                q.push(cur.left);
                cur = cur.left;
            }

            TreeNode temp = q.pop();
            if (temp != null) {
                if (temp.right != null) {
                    q.add(temp.right);
                    cur = temp.right;
                }
                return temp.val;
            }
            return -1;


        }

        /** @return whether we have a next smallest number */
        public boolean hasNext() {
            return !q.isEmpty();
        }
    }


}
