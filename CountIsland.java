/*
You are given a 2-dimensional array/list having N rows and M columns, which is filled with ones(1) and zeroes(0).
1 signifies land, and 0 signifies water.
A cell is said to be connected to another cell, if one cell lies immediately next to the other cell,
in any of the eight directions (two vertical, two horizontal, and four diagonals).
A group of connected cells having value 1 is called an island. Your task is to find the number of such islands present in the matrix.
*/

public class CountIsland {

	 public static int getTotalIslands(int[][] mat) 
		{
	        if(mat == null || mat.length == 0 || mat[0].length == 0){
	            return 0;
	        }

	        int row = mat.length;
	        int col = mat[0].length;
	        int islandCount = 0;

	        for(int i=0; i<row; i++){
	            for(int j=0; j<col; j++){
	                if(mat[i][j]==1){
	                    islandCount++;
	                    dfs(mat,i,j);
	                }
	            }
	        }
	        return islandCount;
	    }

	    private static void dfs(int[][] mat, int i, int j){
	        int row = mat.length;
	        int col = mat[0].length;

	        if(i<0 || i>=row || j<0 || j>=col || mat[i][j]==0){
	            return;
	        }

	        mat[i][j] = 0; //mark the cell visited

	        //explore all eight direction
	        dfs(mat, i-1,j);
	        dfs(mat, i+1,j);
	        dfs(mat, i, j-1);
	        dfs(mat, i, j+1);
	        dfs(mat, i-1, j-1);
	        dfs(mat, i-1, j+1);
	        dfs(mat, i+1, j-1);
	        dfs(mat, i+1, j+1);
	    }
	    
	public static void main(String[] args) {
		int[][] grid = {
	            {1, 1, 0, 0, 0},
	            {0, 1, 0, 0, 1},
	            {1, 0, 0, 1, 1},
	            {0, 0, 0, 0, 0},
	            {1, 0, 1, 0, 1}
	        };

	        int islandCount = getTotalIslands(grid);
	        System.out.println("Number of Islands: " + islandCount);

	}

}
