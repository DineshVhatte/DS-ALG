package com.dalgs.backtracking;

public class RatNMaze {
	public static int N = 4;
	public static boolean showAttempts = true;
	public static void main(String[] args) {
		int [][] maze  = {
				{1, 0, 1, 0},
	            {1, 1, 1, 1},
	            {1, 1, 0, 1},
	            {0, 0, 1, 1}
		};
		
		solveRatNMaze(maze);
	}
	
	public static boolean solveRatNMaze(int[][] maze) {
		int [][] solution = {
				{0, 0, 0, 0},
	            {0, 0, 0, 0},
	            {0, 0, 0, 0},
	            {0, 0, 0, 0}
		};
		if(!solveRatMazeUtil(maze,solution,0,0)) {
			System.out.println("Solution doesn't exist");
			return false;
		}else {
			printSolution(solution);
		}
		return true;
	}
	
	public static void printSolution(int [] [] solution) {
		for(int [] solRow:solution) {
			for(int v:solRow) {
				System.out.print(v+",");
			}
			System.out.println();
		}
		System.out.println("##########");
	}
	
	public static boolean isSafe(int x, int y, int[][] maze) {
		return (x < N && y < N && x >= 0 && y >= 0 && maze[x][y]==1);
			
	}
	
	public static boolean solveRatMazeUtil(int[][] maze, int[][] solution, int x, int y) {
		
		if(x == N-1 && y == N-1) {
			return true;
		} else {
			if(isSafe(x, y, maze)) {
				solution[x][y] = 1;
				if(showAttempts) {
					printSolution(solution);
				}
				if(solveRatMazeUtil(maze, solution, x+1, y)) {
					return true;
				} else if(solveRatMazeUtil(maze, solution, x, y+1)) {
					return true;
				}
				
				solution[x][y] = 0;
				return false;
			}
			return false;
		}
		
	}

}
