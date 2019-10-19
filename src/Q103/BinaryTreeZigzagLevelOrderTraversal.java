package Q103;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigzagLevelOrderTraversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<List<Integer>> output = new ArrayList<>();
        Queue<TreeNode> s = new LinkedList<>();
        s.offer(root);
        boolean leftToRight = true;
        while (!s.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            int size = s.size();
            for (int i = 0; i < size; i++) {
                if (leftToRight) {
                    TreeNode t = ((LinkedList<TreeNode>) s).removeFirst();
                    temp.add(t.val);
                    if (t.left != null) {
                        ((LinkedList<TreeNode>) s).addLast(t.left);
                    }

                    if (t.right != null) {
                        ((LinkedList<TreeNode>) s).addLast(t.right);
                    }
                } else {
                    TreeNode t = ((LinkedList<TreeNode>) s).removeLast();
                    temp.add(t.val);
                    if (t.right != null) {
                        ((LinkedList<TreeNode>) s).addFirst(t.right);
                    }

                    if (t.left != null) {
                        ((LinkedList<TreeNode>) s).addFirst(t.left);
                    }


                }

            }
            output.add(temp);
            leftToRight = !leftToRight;

        }
        return output;
    }
}
