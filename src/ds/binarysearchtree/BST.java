package ds.binarysearchtree;

public class BST {
    private Node root;

    public boolean isEmpty() {
        return null == root;
    }

    public void insert(int key, String value) {
        Node newNode = new Node(key, value);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node traverser = root;
            while (true) {
                if (key < traverser.key) {
                    if (null == traverser.leftChild) {
                        traverser.leftChild = newNode;
                        break;
                    } else {
                        traverser = traverser.leftChild;
                    }
                } else {
                    if (null == traverser.rightChild) {
                        traverser.rightChild = newNode;
                        break;
                    } else {
                        traverser = traverser.rightChild;
                    }
                }
            }
        }
        System.out.println("New node {" + newNode.key + ":" + newNode.value + "} inserted");
    }

    public void findMin() {
        if (isEmpty()) {
            System.out.println("Empty BST");
        } else {
            Node traverser = root;
            while (null != traverser.leftChild) {
                traverser = traverser.leftChild;
            }
            System.out.println("Min node : {" + traverser.key + ":" + traverser.value + "}");
        }
    }

    public void findMax() {
        if (isEmpty()) {
            System.out.println("Empty BST");
        } else {
            Node traverser = root;
            while (null != traverser.rightChild) {
                traverser = traverser.rightChild;
            }
            System.out.println("Max node : {" + traverser.key + ":" + traverser.value + "}");
        }
    }
}
