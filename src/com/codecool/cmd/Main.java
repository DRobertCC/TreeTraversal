package com.codecool.cmd;

import com.codecool.api.*;
class Main {
    // Driver method 
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("\nPreorder traversal of the binary tree: ");
        tree.printPreorder();

        System.out.println("\nInorder traversal of the binary tree: ");
        tree.printInorder();

        System.out.println("\nPostorder traversal of the binary tree: ");
        tree.printPostorder();

        System.out.println("\nLevel order recursive traversal of the binary tree: ");
        tree.printLevelOrderRecursive();

        System.out.println("\nLevel order traversal of the binary tree with queue: ");
        tree.printLevelOrderQueue();
    }
}