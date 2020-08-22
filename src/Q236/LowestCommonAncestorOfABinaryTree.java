package Q236;

import java.util.Stack;

public class LowestCommonAncestorOfABinaryTree {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null) {
            return null;
        }
        if (root == p || root == q) {
            return root;
        }

        TreeNode leftAncestor = lowestCommonAncestor(root.left, p, q);
        TreeNode rightAncestor = lowestCommonAncestor(root.right, p, q);
        if (leftAncestor == null && rightAncestor == null) {
            return null;
        }

        if (leftAncestor != null && rightAncestor != null) {
            return root;
        }

        return leftAncestor == null? rightAncestor: leftAncestor;

    }



     public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
     }
}
