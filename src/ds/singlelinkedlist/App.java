package ds.singlelinkedlist;

public class App {

	public static void main(String[] args) {
		
		SingleLinkedList myList = new SingleLinkedList();
		myList.insertFirst(2);
		myList.insertLast(3);
		myList.insertLast(4);
		myList.insertLast(5);
		myList.displayList();
		myList.deleteFirst();
		myList.displayList();
		myList.insertFirst(2);
		myList.insertFirst(1);
		myList.insertLast(6);
		myList.displayList();
	}

}
