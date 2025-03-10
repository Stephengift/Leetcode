class Solution {
    public int numIslands(char[][] grid) {
        //error checking
        HashSet<String> visited = new HashSet<>();
        if(grid == null || grid.length == 0){
            return 0;
        }
        int numIslands = 0;
        //going through rows
        for(int row = 0; row < grid.length; row++){
            for(int column = 0; column < grid[row].length; column++){
                if(dfs(grid, row,column, visited) == true){
                    numIslands++;
                }
            }
        }
        return numIslands;
    }

    public boolean dfs (char[][] grid, int row, int column, HashSet<String> visited){
        //out of bounds
        if(row < 0 || row >= grid.length || column < 0 || column >= grid[row].length || grid[row][column] == '0'){
            return false;
        }
        if(visited.contains(row + "," + column)){
            return false;
        }
        visited.add(row + "," + column);
        dfs(grid, row+ 1, column, visited);
        dfs(grid, row- 1, column, visited);
        dfs(grid, row, column + 1, visited);
        dfs(grid, row, column - 1, visited);

        return true;
    
    }
    
    
}
