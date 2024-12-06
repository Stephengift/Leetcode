class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int finalTarget = target - nums[i];
            if (hmap.containsKey(finalTarget)) {
                return new int[]{hmap.get(finalTarget), i}; // Return indices as int[]
            } else {
                hmap.put(nums[i], i);
            }
        }
        return new int[]{}; // Return empty array if no solution is found
    }
}
