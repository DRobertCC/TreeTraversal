package com.codecool.api;

// importing the inbuilt java classes required for the program
import java.util.LinkedList;
import java.util.Queue;


// Java program for different tree traversals
public class BinaryTree {
    // Root of Binary Tree
    public Node root;

    public BinaryTree() {
        root = null;
    }
    /* =============================================================== */

// Depth-First Searches:

    // Preorder print of the nodes of a binary tree

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
    /* =============================================================== */


    // Inorder print of the nodes of a binary tree
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
    /* =============================================================== */


    // Given a binary tree, print its nodes according to the "bottom-up" postorder traversal.
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
    /* =============================================================== */




// Breadth-First Searches (Level order traversal):

    // Recursive Java program for level order traversal of Binary Tree

    // Function to print level order traversal of tree
    public void printLevelOrderRecursive() {
        int h = height(root);
        int i;
        for (i = 1; i <= h; i++)
            printGivenLevel(root, i);
    }

    // Compute the "height" of a tree - the number of nodes along the longest path from the root node down to the farthest leaf node.
    private int height(Node root) {
        if (root == null)
            return 0;
        else {
            // compute  height of each subtree
            int lheight = height(root.left);
            int rheight = height(root.right);

            // use the larger one
            if (lheight > rheight)
                return (lheight + 1);
            else return (rheight + 1);
        }
    }

    // Print nodes at the given level
    private void printGivenLevel(Node root, int level) {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.key + " ");
        else if (level > 1) {
            printGivenLevel(root.left, level - 1);
            printGivenLevel(root.right, level - 1);
        }
    }
    /* =============================================================== */

    /* Given a binary tree. Print its nodes in level order
 using array for implementing queue  */
    public void printLevelOrderQueue()
    {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty())
        {

            /* poll() removes the present head.
            For more information on poll() visit
            http://www.tutorialspoint.com/java/util/linkedlist_poll.htm */
            Node tempNode = queue.poll();
            System.out.print(tempNode.key + " ");

            // Enqueue left child
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }

            // Enqueue right child
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }


    public void print(String prefix, Node root, boolean isLeft) {
        if (root != null) {
            print(prefix + "     ", root.right, false);
            System.out.println (prefix + ("|-- ") + root.key);
            print(prefix + "     ", root.left, true);
        }
    }
}

