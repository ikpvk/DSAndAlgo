package ds.binarysearchtree;

import java.util.Stack;

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
    public void deleteNode(int keyToDelete) {
        Node elementToDelete = new Node(keyToDelete, null);
        if (isEmpty()) {
            System.out.println("Empty BST");
        } else {
            Node parent = root, traverser = root;
            boolean isLeftChild = false;
            while (null != traverser && elementToDelete.key != traverser.key) {
                parent = traverser;
                if (elementToDelete.key < traverser.key) {
                    isLeftChild = true;
                    traverser = traverser.leftChild;
                } else {
                    isLeftChild = false;
                    traverser = traverser.rightChild;
                }
            }
            if (null == traverser) {
                System.out.println("No node exists in the BST with key " + keyToDelete);
                return;
            }

            int numberOfChildren = getNumberOfChildren(traverser);
            switch (numberOfChildren) {
                case 0:
                    if (root == traverser) {
                        root = null;
                    } else if (isLeftChild) {
                        parent.leftChild = null;
                    } else {
                        parent.rightChild = null;
                    }
                    break;
                case 1:
                    Node replacerChild;
                    if (null != traverser.leftChild) {
                        replacerChild = traverser.leftChild;
                    } else {
                        replacerChild = traverser.rightChild;
                    }
                    if (root == traverser) {
                        root = replacerChild;
                    } else if (isLeftChild) {
                        parent.leftChild = replacerChild;
                    } else {
                        parent.rightChild = replacerChild;
                    }
                    break;
                case 2:
                    Node successor = getSuccessor(traverser);
                    if (root == traverser) {
                        root = successor;
                    } else if (isLeftChild) {
                        parent.leftChild = successor;
                    } else {
                        parent.rightChild = successor;
                    }
                    successor.leftChild = traverser.leftChild;
                    successor.rightChild = traverser.rightChild;
                    break;
            }
            System.out.println("Node deleted :" + keyToDelete);
        }

    }

    //This method return the number of children the node has
    public int getNumberOfChildren(Node node) {
        int numberOfChildren = 0;
        if (null != node) {
            if (null != node.leftChild) {
                numberOfChildren++;
            }
            if (null != node.rightChild) {
                numberOfChildren++;
            }
        }
        return numberOfChildren;
    }

    private Node getSuccessor(Node nodeToDelete) {
        Node successor = nodeToDelete.rightChild;
        Node parent = successor;
        while (null != successor.leftChild) {
            parent = successor;
            successor = successor.leftChild;
        }
        parent.leftChild = successor.rightChild;
        return successor;
    }


    public void displayTree() {
        Stack globalStack = new Stack();
        globalStack.push(root);
        int nBlanks = 32;
        boolean isRowEmpty = false;
        System.out.println("......................................................");

        while (isRowEmpty == false) {
            Stack localStack = new Stack();
            isRowEmpty = true;
            for (int j = 0; j < nBlanks; j++) {
                System.out.print(" ");
            }

            while (globalStack.isEmpty() == false) {
                Node temp = (Node) globalStack.pop();
                if (temp != null) {
                    System.out.print(temp.key);
                    localStack.push(temp.leftChild);
                    localStack.push(temp.rightChild);
                    if (temp.leftChild != null || temp.rightChild != null) {
                        isRowEmpty = false;
                    }
                } else {
                    System.out.print("--");
                    localStack.push(null);
                    localStack.push(null);
                }

                for (int j = 0; j < nBlanks * 2 - 2; j++) {
                    System.out.print(" ");
                }
            }

            System.out.println();
            nBlanks = nBlanks / 2;

            while (localStack.isEmpty() == false)
                globalStack.push(localStack.pop());
        }
        System.out.println("......................................................");

    }
}
