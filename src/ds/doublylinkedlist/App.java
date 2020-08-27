package ds.doublylinkedlist;

public class App {
    public static void main(String[] args) {
        DoublyLinkedList dList = new DoublyLinkedList();
        dList.insertFirst(22);
        dList.insertFirst(44);
        dList.insertFirst(66);
        dList.insertLast(11);
        dList.insertLast(33);
        dList.insertLast(55);
        dList.displayFwd();
        dList.displayBwd();
        dList.deleteFirst();
        dList.deleteLast();
        dList.deleteKey(22);
        dList.deleteKey(0);
        dList.displayFwd();
        dList.insertAfter(22,77);
        dList.insertAfter(2,7);
        dList.insertAfter(33,88);
        dList.displayFwd();
    }
}