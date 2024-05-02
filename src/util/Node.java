package util;

import java.util.ArrayList;
import java.util.HashSet;public class Node {
    
    /**
     * Menyimpan dictionary yang akan digunakan untuk validasi Node baru yang akan diciptakan
     */
    public static HashSet<String> dictionary; 

    public static char letters[] = new char[]{
        'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
        'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
    };

    public static void initDictionary() {
        try {
            dictionary = Dictionary.getDictionary();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Mengandung node dari parent-nya
    private Node before;

    // Nilai yang tersimpan
    private String value;
    // Number dari node g(n)
    private int length;
    // The heuristic value h(n)
    private int heuristic;

    public Node() {
        value = "";
        before = null;
        length = 0;
        heuristic = 0;
    }

    public Node(String value) {
        this.value = value;
        length = 1;
        before = null;
        heuristic = 0;
    }

    public Node(String value, int heuristic) {
        this(value);
        this.heuristic = heuristic;
    }

    public int length() {
        return length;
    }
    
    public void setLength(int length) {
        this.length = length;
    }

    public String getValue() {
        return value;
    }

    public void setParent(Node parent) {
        before = parent;
    }

    public Node getParent() {
        return before;
    }

    public int getHeuristic() {
        return heuristic;
    }

    private static int countHeuristic(String current, String target) {
        int len = target.length();

        int counter = 0;

        for (int i = 0; i < len; i++) {
            if (current.charAt(i) != target.charAt(i)) {
                counter++;
            }
        }

        return counter;
    }

    public int getPriorityValue() {
        return length + heuristic;
    }

    private boolean isValueVisited(String val) {
        Node current = this;
        while (current != null) {
            if (current.value.equals(val)) {
                return true;
            }
            current = current.before;
        }
        return false;
    }

    public ArrayList<Node> generateChild() {
        StringBuilder builder = new StringBuilder(value);

        int len = value.length();
        ArrayList<Node> list = new ArrayList<>();

        for (int i = 0; i < len; i++) {

            if (i > 0){
                builder.setCharAt(i-1, value.charAt(i-1));
            }

            for (int j = 0; j < 26; j++) {

                builder.setCharAt(i, letters[j]);
                String newValue = new String(builder);

                if (dictionary.contains(newValue)) {
                    if (!isValueVisited(newValue)) {

                        Node newNode = new Node(newValue);
                        newNode.setParent(this);
                        newNode.setLength(this.length+1);
                        list.add(newNode);

                    }
                }
            }
        }

        return list;
    }

    public ArrayList<Node> generateChildHeuristic(String target) {
        StringBuilder builder = new StringBuilder(value);

        int len = value.length();
        ArrayList<Node> list = new ArrayList<>();

        for (int i = 0; i < len; i++) {

            if (i > 0){
                builder.setCharAt(i-1, value.charAt(i-1));
            }

            for (int j = 0; j < 26; j++) {

                builder.setCharAt(i, letters[j]);
                String newValue = new String(builder);

                if (dictionary.contains(newValue)) {
                    if (!isValueVisited(newValue)) {

                        Node newNode = new Node(newValue, countHeuristic(newValue, target));
                        newNode.setParent(this);
                        newNode.setLength(this.length+1);
                        list.add(newNode);
                        
                    }
                }
            }
        }

        return list;
    }
    
    @Override
    public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
        } 
        return (anObject instanceof Node) &&
                ((Node) anObject).getValue().equals(getValue());
    }
    
}
