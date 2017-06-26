package com.dalgs.backtracking;

public class SolveNQueen {
	
	public static final int N = 4;
	// this traces all backtracking attempts - try it for fun
	public static final boolean printRunTrace = true;
	public static void main(String [] args) {
		
		int [][] board = {
				{0,0,0,0},
				{0,0,0,0},
				{0,0,0,0},
				{0,0,0,0},
		};
		
		if(solveNQueen(board)){
			printSolution(board);
		} else {
			
		}
	
	}
	
	public static void printSolution(int [] [] solution) {
		for(int [] solRow:solution) {
			for(int v:solRow) {
				System.out.print(v+",");
			}
			System.out.println();
		}
	}
	
	public static boolean solveNQueen(int [][] board) {
		if(!solveNQueenUtil(board,0)) {
			System.out.println("Solution doesn't exist");
			return false;
		} else {
			return true;
		}
	}
	
	public static boolean solveNQueenUtil(int [][] board, int col) {
		
		if(col >= N) {
			return true;
		}
		for(int i = 0; i < N; i++) {
			
			if(isSafe(board, i, col)) {
				board[i][col] = 1;
				
				if(solveNQueenUtil(board, i)) {
					return true;
				}
				
				board[i][col] = 0;
				return false;
			}
		}
		return false;
	}

	public static boolean isSafe(int [][] board, int row, int col) {
		/** check right side horizontally**/
		for(int i = row; i<N; i++) {
			if(board[i][col] == 1) {
				return false;
			}
		}
		
		/***** check diagonally up to left down****/
		for(int i = row,j=col; i<N && j<N; i++,j++) {
			if(board[i][j] == 1) {
				return false;
			}
		}
		
		/**** d**/
		for(int i = row, j = col; i<N && j<N; i--,j--) {
			if(board[i][j] == 1) {
				return false;
			}
		}
		return true;
	}
	
}
