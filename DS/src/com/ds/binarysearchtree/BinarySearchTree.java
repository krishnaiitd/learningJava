package com.ds.binarysearchtree;

public class BinarySearchTree {

    // Node to hold the elements
    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            this.key = item;
            this.left = null;
            this.right = null;
        }
    }

    // Root node
    Node root;

    public BinarySearchTree() {
        root = null;
    }

    void insert(int item) {
        root = insertRec(root, item);
    }

    // Recursive function to add elements on BST
    Node insertRec(Node root, int item) {

        if (root == null) {
            root = new Node(item);
            return root;
        }

        if (root.key > item) {
            root.left = insertRec(root.left, item);
        } else if (root.key < item) {
            root.right = insertRec(root.right, item);
        }

        return root;
    }

    void inOrderPrint() {
        inOrderRec(root);
    }
    void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec((root.left));
            System.out.println(root.key);
            inOrderRec(root.right);
        }
    }

    void preORderPrint() {
        preOrderRec(root);
    }
    void preOrderRec(Node root) {
        if (root != null) {
            preOrderRec(root.left);
            preOrderRec(root.right);
            System.out.println(root.key);
        }
    }
    void postOrderPrint() {
        postOrderRec(root);
    }

    void postOrderRec(Node root) {
        if (root != null) {
            System.out.println(root.key);
            postOrderRec(root.left);
            postOrderRec(root.right);
        }
    }


    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(30);
        tree.insert(50);
        tree.insert(20);
        tree.insert(10);

        System.out.println("In-Order");
        tree.inOrderPrint();
        System.out.println("Pre-Order");
        tree.preORderPrint();
        System.out.println("Post-Order");
        tree.postOrderPrint();
        
    }

}
