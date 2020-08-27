package ds.doublylinkedlist;

public class DoublyLinkedList {
    Node first;
    Node last;

    public boolean isEmpty() {
        return null == first;
    }

    public void insertFirst(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            first = last = newNode;
        } else {
            newNode.next = first;
            first.previous = newNode;
            first = newNode;
        }
        System.out.println("New node inserted in the beginning with value " + data);
    }

    public void insertLast(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            first = last = newNode;
        } else {
            newNode.previous = last;
            last.next = newNode;
            last = newNode;
        }
        System.out.println("New node inserted in the end with value " + data);
    }

    public void insertAfter(int key, int data) {
        if (isEmpty()) {
            System.out.println("Empty list");
        } else {
            Node iterator = first;
            while (true) {
                if (null == iterator) {
                    break;
                }
                if (key == iterator.data) {
                    Node newNode = new Node(data);
                    newNode.next = iterator.next;
                    iterator.next = newNode;
                    newNode.previous = iterator;
                    if (null != newNode.next) {
                        newNode.next.previous = newNode;
                    }
                    System.out.println("New node " + data + " inserted after key " + key);
                    break;
                } else {
                    iterator = iterator.next;
                }
            }
        }
    }

    public void deleteFirst() {
        if (isEmpty()) {
            System.out.println("Empty list. Nothing to delete.");
        } else {
            System.out.println("Node removed from the beginning :" + first.data);
            if (first == last) {
                first = last = null;
            } else {
                first = first.next;
                first.previous = null;
            }
        }
    }

    public void deleteLast() {
        if (isEmpty()) {
            System.out.println("Empty list. Nothing to delete.");
        } else {
            System.out.println("Node removed from the end :" + last.data);
            if (first == last) {
                first = last = null;
            } else {
                last = last.previous;
                last.next = null;
            }
        }
    }

    public void deleteKey(int key) {
        if (isEmpty()) {
            System.out.println("Empty list");
        } else {
            Node iterator = first;
            while (true) {
                if (null == iterator) {
                    break;
                }
                if (key == iterator.data) {
                    if (null != iterator.previous) {
                        iterator.previous.next = iterator.next;
                    } else {
                        first = iterator.next;
                    }
                    if (null != iterator.next) {
                        iterator.next.previous = iterator.previous;
                    } else {
                        last = iterator.previous;
                    }
                    System.out.println("Node  " + key + " deleted");
                    break;
                } else {
                    iterator = iterator.next;
                }
            }
        }
    }

    public void displayFwd() {
        if (isEmpty()) {
            System.out.println("Empty list");
        } else {
            Node iterator = first;
            while (null != iterator) {
                System.out.print("{ " + iterator.data + " }  ");
                iterator = iterator.next;
            }
            System.out.println();
        }
    }

    public void displayBwd() {
        if (isEmpty()) {
            System.out.println("Empty list");
        } else {
            Node iterator = last;
            while (null != iterator) {
                System.out.print("{ " + iterator.data + " }  ");
                iterator = iterator.previous;
            }
            System.out.println();
        }
    }

}
