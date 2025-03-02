class Solution {
    public int trap(int[] height) {
        if (height == null || height.length < 3) return 0; // Edge case

        int n = height.length;
        int[] leftMax = new int[n];  // Stores max height from left
        int[] rightMax = new int[n]; // Stores max height from right
        int trappedWater = 0;

        // Compute leftMax for each index
        leftMax[0] = 0;
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i-1]);
        }

        // Compute rightMax for each index
        rightMax[n - 1] = 0;
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i+1]);
        }
        System.out.print(Arrays.toString(leftMax));


        // Compute trapped water
        for (int i = 0; i < n; i++) {
            int rainWater = (Math.min(leftMax[i], rightMax[i])) - height[i];
            if(rainWater > 0){
                trappedWater += rainWater;
            }
        }

        return trappedWater;
    }
}
