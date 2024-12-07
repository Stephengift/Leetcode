class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] numsA = new int[nums.length];
        int[] numsB = new int[nums.length];
        for(int i = 1; i<nums.length;i++){
            numsA[0] = 1;
            numsA[i] = nums[i-1] * numsA[i-1];
        }
        for(int j = nums.length - 2; j >= 0; j--){
            numsB[nums.length - 1] = 1;
            numsB[j] = nums[j+1] * numsB[j+1];
        }
        for(int k = 0; k<nums.length;k++){
            numsA[k] = numsA[k] * numsB[k];
        }
        return numsA;
    }
    
}