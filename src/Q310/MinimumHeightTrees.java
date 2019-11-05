package Q310;

import java.util.*;

/**
 * For an undirected graph with tree characteristics, we can choose any node as the root.
 * The result graph is then a rooted tree.
 * Among all possible rooted trees, those with minimum height are called minimum height trees (MHTs).
 * Given such a graph, write a function to find all the MHTs and return a list of their root labels.
 */

public class MinimumHeightTrees {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {

        int minHeight = Integer.MAX_VALUE;
        List<Integer> output = new ArrayList<>();
        if (edges.length == 0) {
            output.add(0);
            return output;
        }

        Map<Integer, List<Integer>> adjacent = new HashMap<>();

        for (int i = 0; i < edges.length; i++) {
            List<Integer> l = adjacent.get(edges[i][0]);
            if (l == null) {
                l = new ArrayList<>();
            }
            l.add(edges[i][1]);
            adjacent.put(edges[i][0], l);

            l = adjacent.get(edges[i][1]);
            if (l == null) {
                l = new ArrayList<>();
            }
            l.add(edges[i][0]);
            adjacent.put(edges[i][1], l);
        }

        // 超时！！
        for (int i = 0; i < n; i++) {
            Set<Integer> visited = new HashSet<>();
            int t = computeHeight(i, adjacent, visited);
            if (t < minHeight) {
                minHeight = t;
                output.clear();
                output.add(i);
            } else if (t == minHeight) {
                output.add(i);
            }
        }

        return output;
    }

    private int computeHeight(int root, Map<Integer, List<Integer>> m, Set<Integer> visited) {
        if (visited.contains(root)) return 0;
        int height = 0;
        visited.add(root);
        for (Integer i: m.get(root)) {
            int t = computeHeight(i, m, visited);
            if (t > height) {
                height = t;
            }
        }
        height++;
        return height;
    }

}
