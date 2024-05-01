package util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;

public class AStartSearch extends Search{
    


    public AStartSearch(String start, String end) {
        super(start, end, new AStarComparator());
    }

    public void search() {
        Node startNode = new Node(start);
        queue.add(startNode);
        visited.add(start);
        
        while (!queue.isEmpty() && !found) {
            Node currNode = queue.poll();
            counterNode++;
            if (currNode.getValue().equals(end)) {
                
                solution = currNode;
                found = true;
                continue;
            }
            ArrayList<Node> childs = currNode.generateChildHeuristic(end);
            
            for (Node child : childs) {
                if (!visited.contains(child.getValue())) {
                    queue.add(child);
                }
                visited.add(child.getValue());
            }
        }
    }
}
