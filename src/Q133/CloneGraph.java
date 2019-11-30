package Q133;

import java.util.*;

/**
 * Given a reference of a node in a connected undirected graph, return a deep copy (clone) of the graph.
 * Each node in the graph contains a val (int) and a list (List[Node]) of its neighbors.
 */

public class CloneGraph {
    class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {}

        public Node(int _val, List<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    };

    public Node cloneGraph(Node node) {
        return help(node, new HashMap<>());
    }

    public Node help(Node node, Map<Node, Node> map) {
        if (map.containsKey(node)) return map.get(node);

        Node newNode = new Node(node.val, new ArrayList<>());
        map.put(node, newNode);

        List<Node> neigh = new ArrayList<>();
        for (Node n: node.neighbors) {
            Node cloneNeighbor = help(n, map);
            neigh.add(cloneNeighbor);
        }

        newNode.neighbors = neigh;
        return newNode;
    }
}
