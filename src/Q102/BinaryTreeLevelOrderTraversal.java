package Q102;

import java.util.*;

public class BinaryTreeLevelOrderTraversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<List<Integer>> output = new ArrayList<>();
        Queue<TreeNode> s = new LinkedList<>();
        s.offer(root);
        while (!s.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            int size = s.size();
            for (int i = 0; i < size; i++) {
                TreeNode t = s.poll();
                temp.add(t.val);
                if (t.left != null) {
                    s.offer(t.left);
                }

                if (t.right != null) {
                    s.offer(t.right);
                }
            }
            output.add(temp);

        }
        return output;

    }
}
