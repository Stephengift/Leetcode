class KthLargest {
	PriorityQueue<Integer> queue = new PriorityQueue<>();
	Integer a;
    public KthLargest(int k, int[] nums) {
	    a = k;
       for(int num : nums){
		queue.offer(num);
		if(queue.size() > k){
			queue.poll();
        }
    }
    }
   
    public int add(int val) {
       queue.add(val);
        if (queue.size() > a){
            queue.poll();
        }
        return queue.peek();
	
    }
}


/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */