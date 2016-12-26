package com.dalgs.LL;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author vhatte
 *
 */
public class ListExec {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.addNodeAtTheEnd(new Integer(10));
		
		// add nodes to the linked list
		
		linkedList.addNodeAtTheEnd(new Integer(21));
		linkedList.addNodeAtTheEnd(new Integer(31));
		
		// parse the linked list
		System.out.println("Before deletion");
		System.out.println(linkedList.parseList());
		
		// delete node at the end
		/*System.out.println("After deletion of last node");
		head = Node.deleteLastNode(head);
		Node.parseList(head);*/
		
		// delete first node
		/*System.out.println("After deletion of first node");
		head = Node.deleteFirstNode(head);
		Node.parseList(head);*/
		
		//delete nth node
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Position form where to delete the node");
		int position = 0;
		try {
			position = Integer.parseInt(br.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
		linkedList.deleteNodeOnPosition(position);
		System.out.println(linkedList.parseList());
		
	}

}
