package medium.graph._133_clone_graph;

import java.util.ArrayList;
import java.util.List;

class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<>();
    }

    public Node(int val) {
        this.val = val;
        neighbors = new ArrayList<>();
    }

    public Node(int val, ArrayList<Node> neighbors) {
        this.val = val;
        this.neighbors = neighbors;
    }
}

/*
// Definition for a Node.
public class CloneGraph {
    public int val;
    public List<Node> neighbors;
    public CloneGraph() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public CloneGraph(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public CloneGraph(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        // TODO: Implement solution.
        return null;
    }
}
