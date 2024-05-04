package util;

public class BestFirstSearch extends Search {

    public BestFirstSearch(String start, String end) {
        super(start, end, null);
    }

    public void search() {
        Node startNode = new Node(start);
        Node currNode = startNode;
        
        while (currNode != null && !found) {
            counterNode++;
            
            if (currNode.getValue().equals(end)) {
                found = true;
                solution = currNode;
                continue;
            }
            
            currNode = currNode.generateChild(end);
        }
    }

}
