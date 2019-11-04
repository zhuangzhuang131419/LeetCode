package Q259;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    List<String> output = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        help(root, "");
        return output;
    }

    private void help(TreeNode root, String s) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            if (s.equals("")) {
                output.add(s + root.val);
            } else {
                output.add(s + "->" + root.val);
            }

        }

        if (s.equals("")) {
            help(root.left, s + root.val);
            help(root.right, s + root.val);
        } else {
            help(root.left, s + "->" + root.val);
            help(root.right, s + "->" + root.val);
        }



    }
}
