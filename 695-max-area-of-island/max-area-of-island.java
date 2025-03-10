class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        HashSet<String> visited = new HashSet<>();
        int result = 0;
        for(int row = 0 ; row < grid.length; row++){
            for(int column = 0; column < grid[row].length; column++){
                int currIsland = explore(row,column,grid,visited);
                result = Math.max(result, currIsland);
            }
        }
        return result;
    }

    public int explore(int row, int column, int[][] grid, HashSet<String> visited){
        int size = 1;
        if(row < 0 || row >= grid.length || column < 0 || column >= grid[row].length || grid[row][column] == 0){
            return 0;
        }
        if(visited.contains(row + "," + column)){
            return 0;
        }
        visited.add(row + "," + column);
        size += explore(row+1, column, grid, visited);
        size += explore(row-1, column, grid, visited);
        size += explore(row, column+1, grid, visited);
        size += explore(row, column-1, grid, visited);

        return size;

    }
}
