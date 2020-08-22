package ds.circularlnkedlist;

public class CircularLinkedList {
    private Node first;
    private Node last;

    public boolean isEmpty() {
        return null == first;
    }

    public void insertFirst(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            first = last = newNode;
        } else {
            newNode.next = first;
            first = newNode;
        }
        System.out.println("New node " + data + " inserted to the beginning");
    }

    public void insertLast(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            first = last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        System.out.println("New node " + data + " inserted to the end");
    }

    public void deleteFirst() {
        if (isEmpty()) {
            System.out.println("Empty list. No values to delete");
        } else {
            int data = first.data;
            System.out.println("Node " + data + " deleted from the beginning");
            if (first == last) {
                first = last = null;
            } else {
                first = first.next;
            }
        }
    }

    public void displayList() {
        if (isEmpty()) {
            System.out.println("Empty list. No values to display");
        } else {
            Node iterator = first;
            while(true) {
                System.out.println("{ "+iterator.data+" }");
                iterator = iterator.next;
                if(null==iterator) {
                    break;
                }
            }
        }
    }

}
