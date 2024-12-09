class Solution {
    public int[] twoSum(int[] numbers, int target) {
       HashMap<Integer, Integer> hmap = new HashMap <>();

       for(int i = 0; i< numbers.length;i++){
        int finalTarget = target - numbers[i];
        if(hmap.containsKey(finalTarget)){
            return new int[]{hmap.get(finalTarget), i+1};
        }
        else{
            hmap.put(numbers[i], i+1);
        }
       }
       return new int[]{};

    }
}

//[2,7,11,15]
//9 - 2 = 7