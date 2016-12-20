package com.dalgs.STK;
/*****
 * 
 * @author vhatte
 *
 * [================= +_
 * we are pushing to end of an array and popping from the end only
 * we are not pushing and popping from the start of the array
 * 
 * 
 */
public class StkObj {
	
	final int maxSize = 10;
	Object [] stack = new Object[maxSize];
	Object top;
	int size;
	
	public void push(Object obj) throws Exception{
		System.out.println("[========== pushed object is " + obj);
		if(size == maxSize) {
			throw new Exception("Stack overflow exception");
		} else {
			size++;
			stack[size-1] = obj;
		}
	}
	
	public Object pop() throws Exception{
		Object top = null;
		if(size == 0) {
			throw new Exception("Empty stack exception");
		} else {
			top  = stack[size-1];
			size--;
		}
		System.out.println("[======= popped object is " + top);
		return top;
	}
	
	public Object top() throws Exception{
		Object top = null;
		if(size == 0) {
			throw new Exception("Empty stack exception");
		} else {
			top  = stack[size-1];
			//size--;
		}
		return top;
	}
	
	public int getSize() throws Exception {
		return size;
	}

}
