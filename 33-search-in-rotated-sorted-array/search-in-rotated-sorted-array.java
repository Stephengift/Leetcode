class Solution {
    public int search(int[] nums, int target) {
        // [6, 7, 1, 2, 3, 4, 5]
        int left = 0;
        int right = nums.length-1;

        while(left <= right){
            int middle = left + (right - left)/2;
            //if the target is the middle, return middle
            if(nums[middle] == target){
                return middle;
            }
            //Binary Search works by splitting the left and right and 
            //deciding where to look
            //Check the left
            else if(nums[left] <= nums[middle]){
                if(target > nums[middle] || target < nums[left]){
                    left = middle +1;
                }else{
                    right = middle -1;
                }

            }
            else{
                if(target < nums[middle] || target > nums[right]){
                    right = middle -1;
                }else{
                    left = middle + 1;
                }
            }
        }
        return -1;
    }
}

//[4,5,6,7,0,1,2]
//[4,5,6]
//[0,1,2]

