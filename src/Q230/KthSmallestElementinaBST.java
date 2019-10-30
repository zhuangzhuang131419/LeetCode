package Q230;

/**
 * Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.
 */

public class KthSmallestElementinaBST {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int kthSmallest(TreeNode root, int k) {
        int sizeLeft = sizeOfTree(root.left);
        if (k == sizeLeft + 1) return root.val;

        if (k <= sizeLeft) {
            return kthSmallest(root.left, k);
        } else {
            return kthSmallest(root.right, k - sizeLeft - 1);
        }

    }

    private int sizeOfTree(TreeNode root) {
        if (root == null) return 0;
        return sizeOfTree(root.left) + sizeOfTree(root.right) + 1;
    }
}
