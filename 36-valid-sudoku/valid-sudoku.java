class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> hSet = new HashSet <>();

        for(int i = 0; i <board.length;i++){
            for(int j = 0; j < board[i].length;j++){
                char current = board[i][j];
                if(current != '.'){
                    if(!hSet.add(i + "row" + current) || !hSet.add(j + "column" + current) || !hSet.add(i/3 + "-" + j/3 + current)){
                        return false;
                    }

                } 
            }
        }
        return true;
    }

}
