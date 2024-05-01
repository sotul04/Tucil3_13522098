package util;

import java.util.Comparator;
import java.util.PriorityQueue;

public abstract class Search {

    protected String start;
    protected String end;

    protected int counterNode;

    protected boolean found;

    protected Node solution;

    protected PriorityQueue<Node> queue;

    public Search(String start, String end, Comparator<Node> comparator) {
        this.start = start;
        this.end = end;
        this.counterNode = 0;
        this.solution = null;
        this.found = false;
        this.queue = new PriorityQueue<>(comparator);
    }

    public String getStart() {
        return this.start;
    }

    public String getEnd() {
        return this.end;
    }

    public int getCounterNode() {
        return this.counterNode;
    }

    public Node getSolution() {
        return this.solution;
    }

    public void setSolution(Node solution) {
        this.solution = solution;
    }

    public PriorityQueue<Node> getQueue() {
        return this.queue;
    }

    public boolean isSolutionFound() {
        return found;
    }

    public abstract void search();
}
