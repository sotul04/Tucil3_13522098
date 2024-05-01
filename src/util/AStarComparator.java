package util;

import java.util.Comparator;

public class AStarComparator implements Comparator<Node>{
    @Override
    public int compare(Node obj1, Node obj2){
        return Integer.compare(obj1.getPriorityValue(), obj2.getPriorityValue());
    }
}
