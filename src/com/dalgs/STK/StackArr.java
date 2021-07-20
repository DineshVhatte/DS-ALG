package com.dalgs.STK;

import java.util.Arrays;

public class StackArr {

	private Object stack[];
	private int top;
	
	public StackArr(int size) {
		super();
		stack = new Object[size];
		top = -1;
	}
	
	public boolean isEmpty() {
		return top == -1 ? true : false;
	}
	
	public int push(Object element) throws Exception {
		if(top == 10) { 
			throw new Exception("Stack overflow exception");
		} else {
			top++;
			stack[top] = element;
			return top;
		}
	}
	
	public Object top() throws Exception {
		if(top == -1) {
			throw new Exception("Empty Stack");
		} else {
			return stack[top];
		}
	}
	public Object pop() throws Exception {
		if(top == -1) {
			throw new Exception("Empty Stack");
		} else {
			Object element = stack[top];
			--top;
			//top = top == 0 ? --top : top;
			return element;
		}
	}
	
	@Override
	public String toString() {
		return "StackArr [stack=" + Arrays.toString(stack) + ", top=" + top
				+ "]";
	}

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		StackArr stackArr = new StackArr(10);
		
		stackArr.push("one");
		System.out.println(stackArr);
		System.out.println("top : "+stackArr.top());
		System.out.println(stackArr);
		System.out.println("pop: "+stackArr.pop());
		System.out.println(stackArr);
		//System.out.println(stackArr.top());
		
		stackArr.push("two");
		System.out.println(stackArr);
		stackArr.push("three");
		System.out.println(stackArr.top());
	}
	
	
}
