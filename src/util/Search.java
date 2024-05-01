package util;

import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;

public abstract class Search {

    protected String start;
    protected String end;
    protected int counterNode;
    protected boolean found;
    protected Node solution;
    protected PriorityQueue<Node> queue;
    protected HashSet<String> visited;

    public Search(String start, String end, Comparator<Node> comparator) {
        this.start = start;
        this.end = end;
        this.counterNode = 0;
        this.solution = null;
        this.found = false;
        this.queue = new PriorityQueue<>(comparator);
        visited = new HashSet<>();
    }

    public int getCounterNode() {
        return this.counterNode;
    }

    public Node getSolution() {
        return this.solution;
    }
    
    public abstract void search();
}
