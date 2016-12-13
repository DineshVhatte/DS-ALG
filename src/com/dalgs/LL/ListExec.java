package com.dalgs.LL;

/**
 * @author vhatte
 *
 */
public class ListExec {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node firstNode = new Node(new Integer(11));
		Node newNode = new Node(new Integer(21));
		Node.addNodeAtTheEnd(newNode, firstNode);
		Node newNode2 = new Node(new Integer(31));
		Node.addNodeAtTheEnd(newNode2, firstNode);
		System.out.println("Before deletion");
		Node.parseList(firstNode);
		System.out.println("After deletion");
		firstNode = Node.deleteLastNode(firstNode);
		Node.parseList(firstNode);
	}

}
