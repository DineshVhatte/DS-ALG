package com.dalgs.LL;

/**
 * @author vhatte
 *
 */
public class LinkedList {
	
	public Node head;
	
	
	
	
	public LinkedList() {
		super();
		this.head = null;
	}

	public Node addNodeAtTheEnd(Object data) {
		Node newNode = new Node(data);
		if(head == null) {
			head =  newNode;
		} else {
			Node lastNode = getLastNode();
			lastNode.setNext(newNode);
			newNode.setNext(null);
		}
		return head;
	}
	
	public Node addNodeAtTheStart(Object data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		} else {
			newNode.setNext(head);
			head = newNode;
		}
		return head;
	}
	
	public Node getFirstNode() {
		return head;
	}
	
	public Node getLastNode() {
		if(head == null || head.getNext() == null) {
			return head;
		} else {
			Node currentNode = head;
			do {
				if(currentNode.getNext() == null) {
					return currentNode;
				} else {
					currentNode = currentNode.getNext();
				}
			} while(true);
		}
	}
	
	public String parseList() {
		String linkedListStr = "";
		Node currentNode = head;
		do {
			linkedListStr += currentNode + "\n";
			if(currentNode == null) {
				break;
			} else if(currentNode.getNext() == null) {
				break;
			} else {
				currentNode = currentNode.getNext();
			}
		} while(true);
		return linkedListStr;
	}

	


	
	
	public Node deleteLastNode() {
		
		if(head == null || head.getNext() == null) {
			head = null;
			return null;
		} else {
			Node lastButOne = getLastButOneNode();
			lastButOne.setNext(null);
			return head;
		}
	}
	
	public Node getLastButOneNode() {
		Node currentNode = head;
		do {
			if(currentNode.getNext().getNext() == null) {
				return currentNode;
			} else {
				currentNode = currentNode.getNext();
			}
		} while(true);
	}
	
	public Node deleteFirstNode() {
		if(head == null || head.getNext() == null) {
			return null;
		} else {
			Node newHead = head.getNext();
			head = null;
			return newHead;
		}
	}
	
	public Node deleteNodeOnPosition(int position) {
		if(head == null || (position == 0 && head.getNext() == null)) {
			return null;
		} else {
			int i=0;
			Node temp = head;
			Node prev = null;
			do{
				prev = temp;
				temp = temp.getNext();
				i++;
				if( i == position ) {
					prev.setNext(temp.getNext());
					temp = null;
				}
			}while(temp.getNext() != null);
		}
		return head;
	}

	@Override
	public String toString() {
		return "LinkedList [head=" + head + ", parseList()=" + parseList()
				+ "]";
	}
	
	public boolean isEmpty() {
		return head == null ? true : false;
	}
	
	public int size() {
		int count = 0;
		Node currentNode = head;
		if(currentNode != null) {
			count = 0;
		}
		do {
			count++;
			currentNode = currentNode.getNext();
		}while (currentNode != null);
		return count;
	}
	
	public Object printCurrentNode() {
		return head.getData();
	}
	
	
}
