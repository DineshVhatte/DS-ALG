package com.dalgs.STK;


import com.dalgs.LL.LinkedList;
import com.dalgs.LL.Node;



public class StackLL {

	Node node = new Node("");
	private int top;
	private LinkedList linkedList;
	
	
	public StackLL() {
		super();
		this.top = -1;
		this.linkedList = new LinkedList();
	}

	public Node push(Object data) {
		Node node = null;
		node = linkedList.addNodeAtTheStart(data);
		return node;
	}
	
	public Node top() {
		return linkedList.getFirstNode();
	}
	
	public Node pop() {
		Node object = linkedList.getFirstNode();
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
	
	
	
	public int size() {
		return linkedList.size();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StackLL stackLL = new StackLL();
		stackLL.push(new String("first"));
		stackLL.push(new String("second"));
		System.out.println("Stack is \n" + stackLL);
		System.out.println("\nStack top is " + stackLL.top().getData());
		System.out.println("\npopped item from stack is " + stackLL.pop());
		System.out.println("current stack is \n" + stackLL);
	}

}
