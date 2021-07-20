package com.dalgs.backtracking;

public class CheckIfSorted {
	public boolean checkIfSorted (int A [], int n) {
		if(n == 1) {
			return true;
		} else {
			return A[n-1] > A[n-2] ? false : checkIfSorted(A, n-1);
		}
	}
	
	public static void main(String [] args) {
		CheckIfSorted checkIfSorted = new CheckIfSorted();
		int [] A = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		boolean flag = checkIfSorted.checkIfSorted(A, 10);
		System.out.println(flag);
	}
}
