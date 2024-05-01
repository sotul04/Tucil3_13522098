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
                
                if (solution != null) {
                    if (solution.length() > currNode.length()){
                        solution = currNode;
                    }
                } else {
                    solution = currNode;
                }

                PriorityQueue<Node> filtered = new PriorityQueue<>(new AStarComparator());
                Iterator<Node> iterator = queue.iterator();

                while (iterator.hasNext()) {
                    Node elem = iterator.next();
                    if (elem.getPriorityValue() <= solution.getPriorityValue()) {
                        filtered.add(elem);
                    }
                }

                if (filtered.isEmpty()) {
                    found = true;
                    continue;
                }

                queue.clear();
                queue.addAll(filtered);

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
