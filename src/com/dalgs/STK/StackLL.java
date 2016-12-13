package com.dalgs.STK;


import com.dalgs.LL.LinkedList;
import com.dalgs.LL.LinkedList.Node;



public class StackLL {

	//Node node = new Node("");
	private int top;
	private LinkedList linkedList;
	
	
	public StackLL() {
		super();
		this.top = -1;
		this.linkedList = new LinkedList();
	}

	public LinkedList.Node push(Object data) {
		LinkedList.Node node = null;
		node = linkedList.addNodeAtTheStart(data);
		return node;
	}
	
	public Object top() {
		return linkedList.getFirstNode();
	}
	
	public Object pop() {
		Object object = linkedList.getFirstNode();
		linkedList.deleteFirstNode();
		return object;
	}
	
	@Override
	public String toString() {
		String printString = "";
		if(linkedList.isEmpty()) {
			printString = "Empty Stack";
		} else {
			Node node = null;
			node = linkedList.getFirstNode();
			do {
				printString += "| " + node.getData() + " |\n";
				node = node.getNext();
			} while (node != null);
		}
		return printString;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StackLL stackLL = new StackLL();
		stackLL.push(new String("first"));
		stackLL.push(new String("second"));
		System.out.println(stackLL);
		System.out.println(stackLL.top());
		//System.out.println(stackLL.pop());
		System.out.println(stackLL);
	}

}
