package part_one.LinkedList;

/** A node represent an item in the list */
public class Node {
    private int data;
    private Node nextNode;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node node) {
        nextNode = node;
    }
}
