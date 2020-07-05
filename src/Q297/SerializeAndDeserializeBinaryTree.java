package Q297;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SerializeAndDeserializeBinaryTree {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) return "";
        ArrayList<String> nodes = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode top = q.poll();
            if (top != null) {
                nodes.add(Integer.toString(top.val));
                q.offer(top.left);
                q.offer(top.right);
            } else {
                nodes.add("null");
            }
        }

        for (int i = nodes.size() - 1; i >= 0; i--) {
            if (nodes.get(i).equals("null")) {
                nodes.remove(i);
            } else {
                break;
            }
        }
        return String.join(",", nodes);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.equals("")) {
            return null;
        }

        String[] nodes = data.split(",");

        TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        for (int i = 1; i < nodes.length; i = i + 2) {
            TreeNode top = q.poll();
            if (top != null) {
                if (nodes[i].equals("null")) {
                    top.left = null;
                } else {
                    top.left = new TreeNode(Integer.parseInt(nodes[i]));
                }

                if (i + 1 < nodes.length) {

                    if (nodes[i + 1].equals("null")) {
                        top.right = null;
                    } else {
                        top.right = new TreeNode(Integer.parseInt(nodes[i + 1]));
                    }
                }
                if (top.left != null) {
                    q.offer(top.left);
                }

                if (top.right != null) {
                    q.offer(top.right);
                }

            }
        }
        return root;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
