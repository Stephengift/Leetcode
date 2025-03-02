class Solution {
    public int trap(int[] height) {
        if (height == null || height.length < 3) return 0; // Edge case

        int n = height.length;
        int[] leftMax = new int[n];  // Stores max height from left
        int[] rightMax = new int[n]; // Stores max height from right
        int trappedWater = 0;

        // Compute leftMax for each index
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        // Compute rightMax for each index
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        // Compute trapped water
        for (int i = 0; i < n; i++) {
            trappedWater += Math.min(leftMax[i], rightMax[i]) - height[i];
        }

        return trappedWater;
    }
}
