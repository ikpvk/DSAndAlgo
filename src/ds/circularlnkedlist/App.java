package ds.circularlnkedlist;

public class App {
    public static void main(String[] args) {
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        System.out.println(circularLinkedList.isEmpty());
        circularLinkedList.displayList();
        circularLinkedList.insertFirst(2);
        circularLinkedList.insertFirst(1);
        circularLinkedList.insertLast(3);
        circularLinkedList.insertLast(4);
        System.out.println(circularLinkedList.isEmpty());
        circularLinkedList.displayList();
        circularLinkedList.deleteFirst();
        circularLinkedList.deleteFirst();
        circularLinkedList.deleteFirst();
        circularLinkedList.deleteFirst();
        System.out.println(circularLinkedList.isEmpty());
        circularLinkedList.displayList();
        circularLinkedList.deleteFirst();
        System.out.println(circularLinkedList.isEmpty());
        circularLinkedList.displayList();

    }
}
