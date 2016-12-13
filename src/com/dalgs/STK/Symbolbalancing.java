package com.dalgs.STK;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Symbolbalancing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter the expression");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		System.out.println("the input is: " + input);
		
		//create a stack for check 
		StackLL stackLl = new StackLL();
		int inputLength = input.length();
		//get the symbols
		char nextChar;
		for(int i = 0; i < inputLength; i++) {
			nextChar = input.charAt(i);
			if( !(nextChar >= 'a' && nextChar <= 'z') && !(nextChar >= 'A' && nextChar <= 'Z') && !(nextChar >= '0' && nextChar <= '9')) {
				stackLl.push(String.valueOf(nextChar));
			}
		}
		System.out.println(stackLl);
		System.out.println("Do you want to continue (Y/N)?");
		String choice = scanner.next();
		if(choice.equals("Y") || choice.equals("y")) {
			main(new String[]{""});
		} else {
			System.out.println("Ok! Exiting");
		}
		scanner.close();
		
	}
	
	public class Closures {
		char forwardSymbol;
		char backwardClosure;
		
		char[] forwardClosures = new char[]{'<','(','{','['};
		char[] backwordClosures = new char[]{'>',')','}',']'};
		Map<String, String> balanceMap = new HashMap<String, String>();
		for(int)
	}

}
