package com.codecool.api;

// Java program for different tree traversals
public class BinaryTree {
    // Root of Binary Tree
    public Node root;

    public BinaryTree() {
        root = null;
    }


    /* Given a binary tree, print its nodes in preorder*/

    private void printPreorder(Node node) {
        if (node == null)
            return;

        /* first print data of node */
        System.out.print(node.key + " ");

        /* then recur on left subtree */
        printPreorder(node.left);

        /* now recur on right subtree */
        printPreorder(node.right);
    }

    // Wrappers over above recursive functions
    public void printPreorder() {
        printPreorder(root);
    }


    // Given a binary tree, print its nodes in inorder
    private void printInorder(Node node) {
        if (node == null)
            return;

        // first recur on left child
        printInorder(node.left);

        // then print the data of node
        System.out.print(node.key + " ");

        // now recur on right child
        printInorder(node.right);
    }

    // Wrappers over above recursive functions
    public void printInorder() {
        printInorder(root);
    }


    /* Given a binary tree, print its nodes according to the
      "bottom-up" postorder traversal. */
    private void printPostorder(Node node) {
        if (node == null)
            return;

        // first recur on left subtree
        printPostorder(node.left);

        // then recur on right subtree
        printPostorder(node.right);

        // now deal with the node
        System.out.print(node.key + " ");
    }

    // Wrappers over above recursive functions
    public void printPostorder() {
        printPostorder(root);
    }
}


