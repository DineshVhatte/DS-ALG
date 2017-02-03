package com.dalgs.LL;


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