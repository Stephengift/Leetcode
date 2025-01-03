class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        //binary search
        while(left <= right){
            //get the middle 
            //-1 0 3 5 9 12
            //middle = 3
            //left = 3
            int middle = left + (right - left) / 2;
            if(target > nums[middle] ){
                left = middle + 1;
            }
            else if(target < nums[middle]){
                right = middle -1;
            }
            else{
                return middle;
            }
        }
        return -1;
    }
}