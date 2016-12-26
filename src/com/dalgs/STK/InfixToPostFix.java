package com.dalgs.STK;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 * @author vhatte
 * the algorithm for infix to post fix conversion is
 * 1. scan character from the expression
 * 2. if scanned character is an operand
 * 		write it to output string
 * 3. If scanned character is an operator
 * 		if stack has operator of lower priority
 * 			add character to output string
 * 		else 
 * 			push character to stack
 * 4. if scanned character is an opening curly brace push it to stack
 * 5. if scanned character is a closing curly brace pull out all the operators from the stack until one
 * of the closing curly bracket is found from the stack
 * 
 */
public class InfixToPostFix {
	
	public static Map<String, Integer> priorityMap  = null;
	
	static {
		priorityMap = new HashMap<String, Integer>();
		priorityMap.put("^", 5);
		priorityMap.put("/", 4);
		priorityMap.put("*", 3);
		priorityMap.put("-", 2);
		priorityMap.put("+", 1);
	}
	
	public static void main(String [] args) throws Exception {
		String input = null;
		String output = "";
		System.out.println("Please enter an infix representation which you want to convert ot postfix");
		Scanner sc;
		do {
			sc = new Scanner(System.in);
			input = sc.nextLine();
			System.out.println("the entered input is '" + input + "'\n");
			
			/***
			 * now start the postfix conversion algorithm of splitting the expression to single characters and proicessing each
			 * 
			 */
			output = "";
			char nextChar;
			StackArr stack = new StackArr(input.length());
			for(int i = 0 ; i < input.length(); i++) {
				nextChar = input.charAt(i);
				if(!isOperator(nextChar)) {
					output = output + nextChar;
				} else {
					if(nextChar == ')') {
						
						do {
								output += stack.pop();
						} while (!stack.pop().equals("("));
					} else if(nextChar == '(') {
						stack.push(String.valueOf(nextChar));
					} else {
						if(stack.isEmpty()) {
							stack.push(String.valueOf(nextChar));
						} else {
							boolean halt = false;
							do {
								if(!stack.isEmpty()) {
									output += stack.pop();
								}
								if(stack.isEmpty()) {
									halt = true;
								} else {
									
									halt = getPriority(String.valueOf(nextChar)) > getPriority(stack.top());
								}
							} while (!halt);
							stack.push(String.valueOf(nextChar));
							/*if(getPriority(String.valueOf(nextChar)) > getPriority(stack.top())) {
								stack.push(String.valueOf(nextChar));
							} else {
								output += nextChar;
							}*/
						}
						
						
					}
				}
			}
			if(!stack.isEmpty()) {
				output += stack.pop();
			}
			System.out.println("The postfix expression is " + output);
			System.out.println("do you want to process more expressions? Enter the expression or enter 'Exit' to exit");
		} while (!(input.equalsIgnoreCase("exit")));
		
		
	}
	
	public static boolean isOperator(char ch) throws Exception {
		if(ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^')  {
			return true;
		} else {
			return false;
		}
	}
	
	public static int getPriority(String ch) {
		int priority = 0;
		priority = priorityMap.get(ch);
		return priority;
	}
}
