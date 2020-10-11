package ds.binarysearchtree;

public class App {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.findMax();
        bst.findMin();
        bst.insert(10,"Ten");
        bst.insert(20,"Twenty");
        bst.insert(5,"Five");
        bst.displayTree();
        bst.findMax();
        bst.findMin();
        bst.deleteNode(20);
        bst.insert(4,"Four");
        bst.findMax();
        bst.findMin();
        bst.displayTree();
    }
}
