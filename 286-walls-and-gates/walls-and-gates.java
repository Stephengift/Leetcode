class Solution {
    public void wallsAndGates(int[][] rooms) {
        Queue<int[]> queue = new LinkedList<>();
        for(int row = 0; row < rooms.length; row++){
            for(int column = 0; column < rooms[row].length; column++){
                if(rooms[row][column] == 0){
                    queue.offer(new int[]{row,column});
                }
            }
        }

        int[][] dirs = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};

        while (!queue.isEmpty())
        {
            int[] node = queue.poll();
            int r = node[0];
            int c = node[1];
            for(int[] dir : dirs){
                int row = r + dir[0];
                int column = c + dir[1];
                if(row < 0 || column < 0 || row >= rooms.length || column >= rooms[0].length || rooms[row][column] != Integer.MAX_VALUE){
                    continue;
                }
                queue.add(new int[]{row, column});
                rooms[row][column] = rooms[r][c] +1;
            }
        }
    }
}