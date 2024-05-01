package util;

import java.util.ArrayList;
import java.util.HashSet;

public class BestFirstSearch extends Search {

    public BestFirstSearch(String start, String end) {
        super(start, end, new BestComparator());
    }

    public void search() {
        Node startNode = new Node(start);
        queue.add(startNode);
        visited.add(start);
        
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
                if (!visited.contains(child.getValue())){
                    queue.add(child);
                }
                visited.add(child.getValue());
            }
        }
    }

}
