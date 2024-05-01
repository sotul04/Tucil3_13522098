package util;

import java.util.ArrayList;
import java.util.HashSet;

public class UCSearch extends Search{

    private HashSet<String> visited;

    public UCSearch(String start, String end) {
        super(start, end, new UCSComparator());
        visited = new HashSet<>();
    }

    @Override
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
            ArrayList<Node> childs = currNode.generateChild();
            
            for (Node child : childs) {
                if (!visited.contains(child.getValue())){
                    queue.add(child);
                }
                visited.add(child.getValue());
            }
        }
    }

}

