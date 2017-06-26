package com.dalgs.TREE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LowestCommonParent {

	public static void main(String[] args) {
		Node node1 = new Node(7);
		
		Node node2 = new Node(6);
		Node node3 = new Node(5);
		node1.left = node2;
		node1.right = node3;
		
		Node node4 = new Node(4);
		Node node5 = new Node(3);
		node2.left = node4;
		node2.right = node5;
		
		Node node6 = new Node(2);
		node3.left = node6;
		
		lowestCommonParent(node1, 4, 2);
		
	}
	
	 public static int lowestCommonParent(Node root, int x, int y) {
		 if(!getPath(root, x, "x") || !getPath(root,y, "y"))
	       {
	           System.out.println("one of the element doesn't exist in tree");
	       }
	        
	       
	       int result = 0;
	       int minLength = pathX.size() < pathY.size() ? pathX.size() : pathY.size();
	       Collections.reverse(pathX);
	       Collections.reverse(pathY);
	       for(int i=0; i<minLength; i++) {
	           if(pathX.get(i) != pathY.get(i)) {
	               if(i == 0) {
	                   System.out.println("Seperate trees");
	               } else {
	                   result = (int) pathX.get(i-1);
	                   break;
	               }
	               
	           }
	       }
	       
	       System.out.println("result is " + result);
	       return result;
	       
	   }
	   
	   //public static int path[] size issue
	   public static ArrayList pathX = new ArrayList();
	   public static ArrayList pathY = new ArrayList();
	   public static boolean getPath(Node root, int x, String xy) {
		   if(root!=null) {
			   if(root.data==x || getPath(root.left,x,xy) || getPath(root.right,x,xy)) {
		    	   if(xy.equals("x"))
		    		   pathX.add(root.data);
		    	   else
		    		   pathY.add(root.data);
		           return true;
		       }
		   }
	       
	       return false;
	   }
	   
	   
	   
	   
}
class Node {
	int data;
	Node left;
	Node right;
	public Node (int data) {
		this.data = data;
	}
}