package Q222;

import java.util.Stack;

public class CountCompleteTreeNode {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int countNodes(TreeNode root) {
        Stack<TreeNode> s = new Stack<>();
        if (root == null) {
            return 0;
        }

        s.add(root);
        int count = 0;
        while (!s.isEmpty()) {
            TreeNode t = s.pop();
            count++;
            if (t.left != null) {
                s.add(t.left);
            }

            if (t.right != null) {
                s.add(t.right);
            }
        }

        return count;
    }


}
