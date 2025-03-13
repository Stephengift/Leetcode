class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        PriorityQueue<int[]> queue = new PriorityQueue<>((a,b) -> Integer.compare(a[0], b[0]));
        HashMap<Integer,Integer> map = new HashMap<>();
        //{}
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0) + 1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            queue.add(new int[]{entry.getValue(), entry.getKey()});
            if(queue.size() > k){
                queue.poll();
            }
        }
        //{(3,1), (2,2) (1,3)}
        for(int i = 0; i < k; i++){
            result[i] = queue.poll()[1];
        }

        return result;

    }
}