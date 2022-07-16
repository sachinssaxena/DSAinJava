package com.example;

public class BinaryTree {

	// Root of Binary Tree
	/*
	 * Depth First Traversals: (a) Inorder (Left, Root, Right) (b)Preorder (Root,
	 * Left, Right) (c)Postorder (Left, Right, Root)
	 */
	Node root;

	BinaryTree() {
		root = null;
	}

	void printInOrder(Node node) {
		if (node == null)
		{
			return;
		}
		printPreorder(node.left);
		System.out.println(node.key + " ");
		
		printPreorder(node.right);
	}
	
	void printPreorder(Node node) {
		if (node == null)
		{
			return;
		}
		System.out.println(node.key + " ");
		printPreorder(node.left);
		printPreorder(node.right);
	}
	/*
	 * Given a binary tree, print its nodes according to the "bottom-up" postorder
	 * traversal.
	 */
	void printPostorder(Node node) {
		if (node == null) {
			return;
		}

		// first recur on left subtree
		printPostorder(node.left);

		// then recur on right subtree
		printPostorder(node.right);

		// now deal with the node
		System.out.print(node.key + " ");
	}
	
	public static void main(String[] args) {
		BinaryTree b = new BinaryTree();
		b.root = new Node(1);
		b.root.left = new Node(2);
		b.root.right = new Node(3);
		b.root.left.left = new Node(4);
		b.root.left.right = new Node(5);
		b.root.right.left = new Node(6);
		b.root.right.right = new Node(7);
	    b.printPreorder(b.root);
	}
}

class Node {
	int key;
	Node left, right;

	public Node(int item) {
		key = item;
		left = right = null;
	}
}
