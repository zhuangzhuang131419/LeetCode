package Q114;

/**
 * Given a binary tree, flatten it to a linked list in-place.
 */

public class FlattenBinaryTreetoLinkedList {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public void flatten(TreeNode root) {
        if (root == null) return;
        flatten(root.left);
        flatten(root.right);

        TreeNode left = root.left;
        if (left != null) {
            while (left.right != null) {
                left = left.right;
            }

            left.right = root.right;
            root.right = root.left;
            root.left = null;
        }
    }
}
