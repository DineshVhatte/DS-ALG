package com.dalgs.LL;

/**
 * @author vhatte
 *
 */
public class LinkedList {
	
	private Node head;
	public class Node{
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
	}
	
	
	
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
	
	
	
}
