package com.dalgs.TREE.BTree;

public class BinaryTreeNode {
	
	Object data;
	BinaryTreeNode leftNode;
	BinaryTreeNode rightNode;
	
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public BinaryTreeNode getLeftNode() {
		return leftNode;
	}
	public void setLeftNode(BinaryTreeNode leftNode) {
		this.leftNode = leftNode;
	}
	public BinaryTreeNode getRightNode() {
		return rightNode;
	}
	public void setRightNode(BinaryTreeNode rightNode) {
		this.rightNode = rightNode;
	}
	
	public BinaryTreeNode(Object data) {
		this.data = data;
		leftNode = rightNode = null;
	}
	
	@Override
	public String toString() {
		return "BinaryTreeNode [data=" + data + ", leftNode=" + leftNode + ", rightNode=" + rightNode + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((leftNode == null) ? 0 : leftNode.hashCode());
		result = prime * result + ((rightNode == null) ? 0 : rightNode.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BinaryTreeNode other = (BinaryTreeNode) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (leftNode == null) {
			if (other.leftNode != null)
				return false;
		} else if (!leftNode.equals(other.leftNode))
			return false;
		if (rightNode == null) {
			if (other.rightNode != null)
				return false;
		} else if (!rightNode.equals(other.rightNode))
			return false;
		return true;
	}
	
	
	

}
