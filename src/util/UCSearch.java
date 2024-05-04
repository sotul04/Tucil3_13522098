package util;

import java.util.ArrayList;

public class UCSearch extends Search{

    public UCSearch(String start, String end) {
        super(start, end, new UCSComparator());
    }

    @Override
    public void search() {
        Node startNode = new Node(start);
        queue.add(startNode);
        visited.add(startNode.getValue());
        
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

