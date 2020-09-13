package ds.binarysearchtree;

public class BST {
    private Node root;

    public boolean isEmpty() {
        return null == root;
    }

    //This method inserts a new node into the binary tree
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

    //This method finds the min value in a binary tree
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

    //This method finds the max value in a binary tree
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

    //This method deletes a node from the BST
    public void deleteNode(Node elementToDelete) {
        if(isEmpty()) {
            System.out.println("Empty BST");
        } else {
            Node parent = root, traverser = root;
            boolean isLeftChild = false;
            while(null!=traverser && elementToDelete.key!=traverser.key) {
                parent = traverser;
                if(elementToDelete.key< traverser.key){
                    isLeftChild = true;
                    traverser = traverser.leftChild;
                } else {
                    isLeftChild = false;
                    traverser = traverser.leftChild;
                }
            }

            int numberOfChildren = getNumberOfChildren(elementToDelete);
            switch (numberOfChildren) {
                case 0:
                    if(root==traverser){
                        root= null;
                    } else if(isLeftChild) {
                        parent.leftChild = null;
                    } else {
                        parent.rightChild = null;
                    }
                    break;
                case 1:
                    Node replacerChild;
                    if(null!=traverser.leftChild) {
                        replacerChild = traverser.leftChild;
                    } else {
                        replacerChild = traverser.rightChild;
                    }
                    if(root == traverser) {
                        root = replacerChild;
                    } else if(isLeftChild) {
                        parent.leftChild = replacerChild;
                    } else {
                        parent.rightChild = replacerChild;
                    }

            }
        }

    }

    //This method return the number of children the node has
    public int getNumberOfChildren(Node node) {
        int numberOfChildren = 0;
        if(null!=node) {
            if(null!=node.leftChild) {
                numberOfChildren++;
            }
            if(null!=node.rightChild) {
                numberOfChildren++;
            }
        }
        return numberOfChildren;
    }

    private Node getSuccessor(Node nodeToDelete) {
        Node successor = nodeToDelete;

        return successor;
    }
}
