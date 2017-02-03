package com.dalgs.TREE.BTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.SynchronousQueue;

import com.dalgs.LL.Node;

public class SampleTree {
	static BinaryTreeNode root = null;
	
	public static BinaryTreeNode constructBinaryTreeNodeFromLL (Node head) {
		BinaryTreeNode root = new BinaryTreeNode(head.getData());
		Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		queue.add(root);
		
		//till list has an element
		Node listCurrNode = head.getNext();
		while(listCurrNode != null) {
			BinaryTreeNode currParentNode = queue.poll();
			BinaryTreeNode lNode = new BinaryTreeNode(listCurrNode.getData());
			listCurrNode = listCurrNode.getNext();
			BinaryTreeNode rNode = new BinaryTreeNode(listCurrNode.getData());
			listCurrNode = listCurrNode.getNext();
			currParentNode.leftNode = lNode;
			currParentNode.rightNode = rNode;
			queue.add(lNode);
			queue.add(rNode);
		}
		return root;
	}
	
	public static void inOrderTreeTraversalRecursive(BinaryTreeNode rootNode) {
		if(rootNode != null) {
			inOrderTreeTraversalRecursive(rootNode.leftNode);
			System.out.println(rootNode.data + " ");
			inOrderTreeTraversalRecursive(rootNode.rightNode);
		}
		
	}
	
	public static void main(String args[]) {
		Node head = new Node(1);
		Node root1 = new Node(2);
		Node root2 = new Node(3);
		Node root3 = new Node(4);
		Node root4 = new Node(5);
		Node root5 = new Node(6);
		Node root6 = new Node(7);
		head.setNext(root1);
		root1.setNext(root2);
		root2.setNext(root3);
		root3.setNext(root4);
		root4.setNext(root5);
		root5.setNext(root6);
		
		BinaryTreeNode treeRoot = constructBinaryTreeNodeFromLL(head);
		inOrderTreeTraversalRecursive(treeRoot);
	}

	
	
}
