class Solution {
    public int longestConsecutive(int[] nums) {
        //use a hashset, so as to avoid duplicates
        //then check if the previous iteration exists in the hahset,
        //if no, then that is the start of our sequence
        //then you check the current number + current index... 
        //if yes, then skip
        
        int finalLength = 0;
        if(nums.length == 0){
            return 0;
        }
        HashSet<Integer> set = new HashSet <>();
        for(int num : nums){
            set.add(num);
        }
        for(int num: set){
            if(!set.contains(num - 1)){
                int currentLength = 1;
                while(set.contains(num + currentLength)){
                    currentLength++;
                    
                }
                finalLength = Math.max(currentLength, finalLength);
            }

        }
        return finalLength;
    
        }
}


