package com.bwamie;

public class Main {

	public static void main(String[] args) {
		BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();
		bst.add(2);
		bst.add(1);
		bst.add(10);
		bst.add(12);
		bst.add(9);
		bst.add(-1);
		bst.add(0);
		System.out.println(bst.find(10));
		System.out.println(bst);
		bst.preOrder(bst.getRoot());
		System.out.println();
		bst.inOrder(bst.getRoot());
		System.out.println();
		bst.postOrder(bst.getRoot());
		System.out.println();

	}
}
