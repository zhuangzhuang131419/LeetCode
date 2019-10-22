package Q113;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.
 */

public class PathSumII {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    List<List<Integer>> output = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root == null) return output;
        findPaths(root, sum , new ArrayList<>());
        return output;
    }

    public void findPaths(TreeNode root, int sum,List<Integer> current){

        if(root == null){
            return;
        }

        current.add(root.val);

        if(root.val == sum && root.left == null && root.right == null){
            output.add(current);
            return;
        }

        findPaths(root.left, sum - root.val, new ArrayList<>(current));
        findPaths(root.right, sum - root.val, new ArrayList<>(current));

    }
}
