package ds.singlelinkedlist;

public class Node {
    public int data;
    public Node next;

	Node(int data) {
		this.data = data;
	}

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public void displayNode() {
        System.out.println("Data : " + data);
    }
}
