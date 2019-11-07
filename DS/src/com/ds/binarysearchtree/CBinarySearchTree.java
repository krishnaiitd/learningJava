package com.ds.binarysearchtree;

public class CBinarySearchTree {

    private static class Node<T> {

        public T data;
        private Node<T> left, right;

        public Node(T data, Node<T> l, Node<T> r) {
            left = l;
            right = r;
            this.data = data;
        }

        public Node(T data) {
            this(data, null, null);
        }

        public String toString() {
            return data.toString();
        }
    }

    Node root;

    public Node insertRecursively(Node root, Integer item) {
        if (root == null) {
            root = new Node(item);
            return root;
        }

        if (item.compareTo(Integer.valueOf((Integer) root.data)) > 0) {
            root.left = insertRecursively(root, item);
        } else {
            root.right = insertRecursively(root, item);
        }
        return root;
    }

    public static void main(String args[]) {
        CBinarySearchTree bst = new CBinarySearchTree();
        bst.root = new Node(12);
    }

}
