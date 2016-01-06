package com.dalgs.LL;

/**
 * @author vhatte
 *
 */
public class Node {
	
	private Node next;
	private Object data;
	
	
	public Node getNext() {
		return next;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
	
	public Object getData() {
		return data;
	}
	
	public void setData(Object data) {
		this.data = data;
	}
	
	public static Node addNodeAtTheEnd(Node newNode, Node firstNode) {
		if(firstNode == null) {
			return newNode;
		} else {
			Node lastNode = getLastNode(firstNode);
			lastNode.setNext(newNode);
			newNode.setNext(null);
			return firstNode;
		}
	}
	
	public static Node getLastNode(Node firstNode) {
		if(firstNode == null || firstNode.getNext() == null) {
			return firstNode;
		} else {
			Node currentNode = firstNode;
			do {
				if(currentNode.getNext() == null) {
					return currentNode;
				} else {
					currentNode = currentNode.getNext();
				}
			} while(true);
		}
	}
	
	public static void parseList(Node firstNode) {
		Node currentNode = firstNode;
		do {
			System.out.println(currentNode);
			if(currentNode.getNext() == null) {
				break;
			} else {
				currentNode = currentNode.getNext();
			}
		} while(true);
		
	}

	public String toString() {
		return "Node [ data=" + data + ", next=" + ( next == null ? "null" : next.getData() ) + "]";
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		return true;
	}

	public Node(Object data) {
		super();
		this.data = data;
	}
	
	public static void deleteLastNode(Node firstNode) {
		
	}
	
	
	
}
