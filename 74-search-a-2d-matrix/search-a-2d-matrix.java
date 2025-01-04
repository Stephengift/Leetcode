class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0; i< matrix.length;i++){
            int[] row = matrix[i];
            int left = 0;
            int right = matrix[i].length-1;
            while(left <= right){
                int middle = left + (right-left)/2;
                if(row[middle] < target){
                    left = middle +1;
                }
                else if(row[middle] > target){
                    right = middle -1;
                }
                else{
                    return true;
                }
            }
        }
        return false;
    }
}