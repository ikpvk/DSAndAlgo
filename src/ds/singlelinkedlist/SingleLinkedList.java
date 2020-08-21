package ds.singlelinkedlist;

public class SingleLinkedList {
	private Node first;

	public boolean isEmpty() {
		return null == first;
	}

	public void insertFirst(int data) {
		Node newNode = new Node(data, first);
		first = newNode;
		System.out.println("New node "+ data+" inserted to the beginning");
	}
	
	public void deleteFirst() {
		if(isEmpty()) {
			System.out.println("Empty list. Nothing to delete");
		}else {
			System.out.println("Deleting first node "+first.data);
			first = first.next;
		}
	}
	
	public void displayList() {
		Node iterator = first;
		int count = 1;
		while(null!=iterator) {
			System.out.println(count++ + " : "+iterator.data);
			iterator = iterator.next;
		}
	}
}
