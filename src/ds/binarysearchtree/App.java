package ds.binarysearchtree;

public class App {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.findMax();
        bst.findMin();
        bst.insert(10,"Ten");
        bst.insert(20,"Twenty");
        bst.insert(5,"Five");
        bst.findMax();
        bst.findMin();
        bst.deleteNode(20);
        bst.findMax();
        bst.findMin();
    }
}
