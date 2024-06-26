package util;

import java.util.ArrayList;

public class AStartSearch extends Search{

    public AStartSearch(String start, String end) {
        super(start, end, new AStarComparator());
    }

    public void search() {
        Node startNode = new Node(start);
        queue.add(startNode);
        
        while (!queue.isEmpty()) {
            Node currNode = queue.poll();
            
            visited.add(currNode.getValue());
            counterNode++;
            
            if (currNode.getValue().equals(end)) {
                if (found) {
                    if (solution.length() > currNode.length()){
                        solution = currNode;
                    }
                } else {
                    solution = currNode;
                    found = true;
                }
                
                continue;

            } else if (found) {
                if (currNode.getPriorityValue() > solution.length()) {
                    continue;
                }
            }
            ArrayList<Node> childs = currNode.generateChildHeuristic(end);
            
            for (Node child : childs) {
                if (!visited.contains(child.getValue())) {
                    queue.add(child);
                }
            }
        }
    }
}
