class Solution {
    public boolean containsDuplicate(int[] nums) {
        //first iterate through nums
        //add it to a hashmap, using getordefault
        //if hashmap already has value greater than 1 return false;
        HashMap<Integer, Integer> hmap = new HashMap <>();
        for(int i = 0; i<nums.length;i++){
            int count = hmap.getOrDefault(nums[i], 1);
            if(count > 1){
                return true;
            }
            hmap.put(nums[i], count+1);
        }
        return false;
    }
}









