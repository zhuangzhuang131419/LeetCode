package Q94;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    List<Integer> output = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return new ArrayList<>();
        inorderTraversal(root.left);
        output.add(root.val);
        inorderTraversal(root.right);
        return output;
    }


}
