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

        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.left.left.left = new Node(8);
        tree.root.left.left.right = new Node(9);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(11);
        tree.root.right.left.left = new Node(12);
        tree.root.right.left.right = new Node(13);
        tree.root.right.right.left = new Node(14);
        tree.root.right.right.right = new Node(15);
        tree.root.left.left.left.left = new Node(16);
        tree.root.right.right.right.left = new Node(17);
        tree.root.right.right.right.right = new Node(18);

        tree.print("", tree.root, false);

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