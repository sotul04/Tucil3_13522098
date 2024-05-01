package util;

import java.util.ArrayList;

public class BestFirstSearch extends Search {

    public BestFirstSearch(String start, String end) {
        super(start, end, new BestComparator());
    }

    public void search() {
        Node startNode = new Node(start);
        queue.add(startNode);
        
        while (!queue.isEmpty() && !found) {
            counterNode++;
            Node currNode = queue.poll();
            if (currNode.getValue().equals(end)) {
                found = true;
                solution = currNode;
                continue;
            }
            ArrayList<Node> childs = currNode.generateChildHeuristic(end);
            
            for (Node child : childs) {
                queue.add(child);
            }
        }
    }

}
