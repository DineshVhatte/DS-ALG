package com.dalgs.backtracking;

public class MemoryVis {
	
	public Integer visualizeCall(Integer n) {
		if(n == 0) {
			return 0;
		}
		else {
			System.out.println(n);
			return visualizeCall(n-1);
		}
	} 

	public static void main(String [] args) {
		MemoryVis memoryVis = new MemoryVis();
		memoryVis.visualizeCall(10);
	}
}
