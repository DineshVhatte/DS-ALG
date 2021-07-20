package com.dalgs.backtracking;

public class StringsOfNBits {
	private char [] A  = new char[10];
	public void binary(int n) {
		if (n < 1) {
			System.out.println("" + new String(A));
		}
		else {
			System.out.println("inside else");
			A[n-1] = 0;
			binary(n-1);
			A[n-1] = 1;
			binary(n-1);
		}
	}
	
	public static void main(String[] args) {
		StringsOfNBits stringOfNBits = new StringsOfNBits();
		System.out.println("calling String of n bits");
		stringOfNBits.binary(10);
	}
	
	public void printCharArr(char[] var) {
		for(int i=0; i<var.length; i++) {
			System.out.println(var[i]+",");
		}
	}

}
