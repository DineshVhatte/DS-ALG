package com.dalgs.backtracking;

public class Factorial {
	
	public Integer factorial(Integer n) {
		if(n == 0) {
			return 1;
		}
		return n * factorial(n-1);
	}

	public static void main(String [] args) {
		Factorial factorial = new Factorial();
		Integer solution = factorial.factorial(10);
		System.out.println(solution);
	}
}
