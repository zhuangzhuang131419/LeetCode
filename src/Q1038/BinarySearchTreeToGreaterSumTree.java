package Q1038;

import java.util.ArrayList;
import java.util.Stack;

public class BinarySearchTreeToGreaterSumTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode bstToGst(TreeNode root) {
        Stack<TreeNode> s = new Stack<>();
        int sum = 0;
        TreeNode cur = root;
        while (!s.isEmpty() || cur != null) {
            while (cur != null) {
                s.push(cur);
                cur = cur.right;
            }
            cur = s.pop();
            cur.val += sum;
            sum = cur.val;
            cur = cur.left;
        }

        return root;
    }

}
