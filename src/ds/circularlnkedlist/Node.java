package ds.circularlnkedlist;

public class Node {
    public int data;
    public Node next;

    Node(int data) {
        this.data = data;
    }

    public void displayNode() {
        System.out.println("Data : " + data);
    }
}
