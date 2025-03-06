class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int num : nums){
            minHeap.add(-num);
        }
        //k = 2
        while(k > 1){
            k--;
            minHeap.poll();
        }
        return -1 * minHeap.peek();

        //[-1,-2,-3,-4,-5,-6]




    }
}