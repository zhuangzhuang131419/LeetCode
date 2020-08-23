package Xiecheng;

import java.util.*;
import java.util.stream.Collectors;

class WorkflowNode {
    String nodeId;
    int timeoutMillis;
    List<WorkflowNode> nextNodes;
    boolean initialised;

    public static WorkflowNode load(String value) {
        // Create head node;
        Map<String, WorkflowNode> map = new HashMap<>();
        WorkflowNode head = new WorkflowNode("HEAD", 0, null);
        map.put(head.nodeId, head);

        for (String nodeValue : value.split("\\|")) {
            String[] properties = nodeValue.split("\\`");
            if (properties.length == 0) {
                return null;
            }
            WorkflowNode node = map.get(properties[0]);

            node.timeoutMillis = Integer.parseInt(properties[1]);
            node.initialised = true;

            // Check next nodes
            if (properties.length < 3) {
                return null;
            }
            if (properties[2].equals("END")) {
                continue;
            }
            node.nextNodes = Arrays.stream(properties[2].split(","))
                    .map(p -> new WorkflowNode(p, 0, null))
                    .collect(Collectors.toList());
            node.nextNodes.forEach(p -> map.put(p.nodeId, p));

            map.put(node.nodeId, node);
        }

        return head;
    }

    public WorkflowNode(String nodeId, int timeoutMillis, List<WorkflowNode> nextNodes) {
        this.nodeId = nodeId;
        this.timeoutMillis = timeoutMillis;
        this.nextNodes = nextNodes;
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            WorkflowNode node = WorkflowNode.load(cin.next());
            if (node == null) {
                System.out.println(-1);
            } else {
                System.out.println(calculatePath(node));
            }

        }
    }

    static HashMap<WorkflowNode, Integer> map = new HashMap<>();

    public static int calculatePath(WorkflowNode n) {
        if (map.containsKey(n)) {
            return map.get(n);
        }

        if (n.nextNodes == null || n.nextNodes.isEmpty()) {
            map.put(n, n.timeoutMillis);
            return n.timeoutMillis;
        }
        int max = 0;
        for (WorkflowNode w: n.nextNodes) {
            int path = calculatePath(w);
            if (path > max) {
                max = path;
            }
        }
        map.put(n, max + n.timeoutMillis);
        return max + n.timeoutMillis;
    }
}
