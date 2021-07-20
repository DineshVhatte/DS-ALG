package com.dalgs.recursion;

import java.util.Stack;

import com.dalgs.STK.StackArr;
import com.dalgs.STK.StackLL;

public class TowerOfHanoi {
	
	/**
	 * Define the basic towner of Hanoi problem with 3 pegs
	 * 
	 * */
	
	/*Peg sourcePeg;
	Peg auxiliaryPeg;
	Peg targetPeg;
	
	public TowerOfHanoi() {
		sourcePeg = new Peg();
		auxiliaryPeg = new Peg();
		targetPeg = new Peg();
	}*/
	
	public class Peg {
		private Stack<Object> pegStack;
		//private int size;
		
		public Peg(int n) {
			pegStack = new Stack<Object>();
		}
		
		public Object pop() throws Exception {
			return pegStack.pop();
		}
		
		//peek
		public Object top() throws Exception {
			return pegStack.peek();
		}
		
		public void push(Object disc) throws Exception {
			pegStack.push(disc);
		}
		
		
		public String toString() {
			return pegStack.toString();
		}
		
		public int size() {
			return pegStack.size();
		}
	}
	
	public static void solveTowerOfHanoi(int size, Peg sourcePeg, Peg destinationPeg, Peg auxiliaryPeg) throws Exception {
		if(size == 1) {
			destinationPeg.push(sourcePeg.pop());
		}
		solveTowerOfHanoi(size-1, sourcePeg, auxiliaryPeg, destinationPeg);
		destinationPeg.push(sourcePeg.pop());
		solveTowerOfHanoi(size-1, auxiliaryPeg, destinationPeg, sourcePeg);
	}
	
	public static void main (String [] args) {
		TowerOfHanoi towerOfHanoi = new TowerOfHanoi();
		Peg sourcePeg = towerOfHanoi.new Peg(3);
		Peg auxiliaryPeg = towerOfHanoi.new Peg(3);
		Peg destinationPeg = towerOfHanoi.new Peg(3);
		try {
			sourcePeg.push(3);
			sourcePeg.push(2);
			sourcePeg.push(1);
			solveTowerOfHanoi(sourcePeg.size(), sourcePeg, destinationPeg, auxiliaryPeg);
			System.out.println("problem solved and the solution is");
			System.out.println("source peg " + sourcePeg.toString());
			System.out.println("destination peg " + destinationPeg.toString());
			System.out.println("auxilizary peg " + auxiliaryPeg.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
