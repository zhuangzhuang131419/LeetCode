package Q105;

public class ConstructBinaryTreefromPreorderandInorderTraversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || preorder.length != inorder.length) return null;
        if (preorder.length == 1) {
            if (preorder[0] == inorder[0]) {
                return new TreeNode(preorder[0]);
            } else {
                return null;
            }
        }
        TreeNode root = new TreeNode(preorder[0]);

        int rootPos = -1;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == root.val) {
                rootPos = i;
            }
        }
        int[] leftPreorder = new int[rootPos];
        int[] rightPreorder = new int[preorder.length - rootPos - 1];
        int[] leftInorder = new int[rootPos];
        int[] rightInorder = new int[preorder.length - rootPos - 1];
        for (int i = 1; i < preorder.length; i++) {
            if (i <= rootPos) {
                leftPreorder[i - 1] = preorder[i];
            } else {
                rightPreorder[i - rootPos - 1] = preorder[i];
            }
        }

        for (int i = 0; i < inorder.length; i++) {
            if (i < rootPos) {
                leftInorder[i] = inorder[i];
            }
            if (i > rootPos) {
                rightInorder[i - rootPos - 1] = inorder[i];
            }
        }

        root.left = buildTree(leftPreorder, leftInorder);
        root.right = buildTree(rightPreorder, rightInorder);

        return root;
    }
}
