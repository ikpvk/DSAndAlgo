package ds.singlelinkedlist;

public class App {

	public static void main(String[] args) {
		
		SingleLinkedList myList = new SingleLinkedList();
		myList.insertFirst(2);
		myList.insertFirst(3);
		myList.insertFirst(4);
		myList.insertFirst(5);
		myList.displayList();
		myList.deleteFirst();
		myList.displayList();

	}

}
