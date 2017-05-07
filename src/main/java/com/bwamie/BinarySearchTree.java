package com.bwamie;

public class BinarySearchTree<E extends Comparable<E>> {

	private Node root;
	private int size;

	public BinarySearchTree() {
		this.root = null;
		this.size = 0;
	}

	class Node {
		Node left;
		Node right;
		E value;

		public Node(Node left, Node right, E value) {
			this.left = left;
			this.right = right;
			this.value = value;
		}

	}
	
	public void setRoot(Node root) {
		this.root = root;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Node getRoot() {
		return this.root;
	}

	public int getSize() {
		return this.size;
	}

	public void add(E value) {
		if (this.root == null) {
			this.root = new Node(null, null, value);
			++size;
		} else {
			recurseInsert(this.root, value);
		}
	}

	private void recurseInsert(Node node, E value) {
		if (value.compareTo(node.value) > 0) {
			if (node.right == null) {
				node.right = new Node(null, null, value);
				++size;
				return;
			}
			recurseInsert(node.right, value);
		} else {

			if (node.left == null) {
				node.left = new Node(null, null, value);
				++size;
				return;
			}
			recurseInsert(node.left, value);
		}
	}

	public boolean find(E value) {
		if (root == null) {
			return false;
		} else if (root.value.compareTo(value) == 0) {
			return true;
		} else {
			return recurseFind(root, value);
		}
	}

	private boolean recurseFind(Node parent, E value) {
		if (parent == null) {
			return false;
		}
		if (value.compareTo(parent.value) == 0)
			return true;
		if (value.compareTo(parent.value) > 0)
			return recurseFind(parent.right, value);
		else if (value.compareTo(parent.value) < 0)
			return recurseFind(parent.left, value);
		return false;
	}

	public void preOrder(Node node) {
		if(node==null)
			return;
		System.out.println(node.value);//visit node
		preOrder(node.left);
		preOrder(node.right);
	}

	public void inOrder(Node node) {
		if(node==null)
			return;
		inOrder(node.left);
		System.out.println(node.value);//Visit node
		inOrder(node.right);
	}

	public void postOrder(Node node) {
		if(node==null)
			return;
		postOrder(node.left);
		postOrder(node.right);
		System.out.println(node.value);//Visit node
	}

	@Override
	public String toString() {
		return "BinarySearchTree [root=" + root.value + "--"
				+ root.right.right.value + ", size=" + size + "]";
	}

}
