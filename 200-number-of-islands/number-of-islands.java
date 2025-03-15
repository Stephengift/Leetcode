class Solution {
	public int numIslands(char[][] grid){
		HashSet<String> set = new HashSet<>();
		int islands = 0;
		for(int row = 0; row  < grid.length;row++){
			for(int column = 0; column < grid[row].length; column++){
				if(dfs(row,column,grid,set)){
					islands++;
                }
            }
        }
		return islands;
    }
		



public boolean dfs(int row, int column, char[][] grid, HashSet<String> set){
    String stringKey = row + "," + column;
        if( row < 0 || column < 0 || row >= grid.length || column >= grid[row].length || grid[row][column] == '0'){
                return false;
        }

    
    if(set.contains(stringKey)){
        return false;
    }
    set.add(stringKey);

    dfs(row+1, column, grid, set);
    dfs(row-1, column, grid, set);
    dfs(row, column+1, grid, set);
    dfs(row, column-1, grid, set);


    return true;
    }

    
    
}
