package com.dalgs.STK;
/****
 * 
 * @author vhatte
 *this check for symbol balancing input is given through the console
 *
 */
public class SymbolBal {
	
	public static void main(String [] args) throws Exception{
		String inputString = args[0];
		StkObj stackObj = new StkObj();
		System.out.println(inputString);
		for(int i=0; i<inputString.length(); i++) {
			char ch = inputString.charAt(i);
			/*****
			 * if the symbol is starting symbol push it to stack
			 * else check for balancing
			 * 
			 */
			if(isStartingSymbol(ch)) {
				stackObj.push(String.valueOf(ch));
			} else {
				System.out.println("found closing symbol " + ch);
				try {
					char ch2 = ((String) stackObj.pop()).charAt(0);
					if(isBalancingChars(ch2, ch)) {
						continue;
					} else {
						System.out.println("Symbols are not balancing");
						return;
					}
				} catch (Exception e) {
					System.out.println(e);
					System.out.println("symbols are not balancing in the input");
					return;
				}
				
			}
		}
		if(stackObj.size > 0) {
			System.out.println("Symbols are not balancing");
		}else {
			System.out.println("Symbols are balancing");
		}
	}
	
	public static boolean isStartingSymbol(char ch) throws Exception{
		if(ch == '[' || ch == '{' || ch == '<' || ch == '(') {
			return true;
		} else if(ch == ']' || ch == '}' || ch == '>' || ch == ')') {
			return false;
		} else {
			throw new Exception("Symbol is neither of starting or closing symbol");
		}
	}

	public static boolean isBalancingChars(char ch1, char ch2) throws Exception{
		boolean balancing = false;
		if((ch1 == '[' && ch2 == ']') 
				|| (ch1 == '{' && ch2 == '}')
				|| (ch1 == '<' && ch2 == '>')
				|| (ch1 == '(' && ch2 == ')')
				) {
			balancing = true;
		} else {
			balancing = false;
		}
		return balancing;
	}
}
