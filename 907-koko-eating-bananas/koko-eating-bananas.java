class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        //[3,6,7,11]
        //[3/2 = 2, 6/2 =3, 7/2 = 4, 11/2 = 6 : 13 ]
        //get the maximum number in an array
        //[0.2..11]
        int max = Arrays.stream(piles).max().getAsInt();
        int left = 1;
        int right = max;
        int result = max;
        while(left <= right){
            int middle = left + (right-left)/2;
            int totalTime = 0;
            for(int p : piles){
                totalTime  += Math.ceil((double) p / middle);;
            }
            if(totalTime <= h){
                result = middle;
                right = middle -1;
                
            }
            else{
                left = middle + 1;
            }
        }
        return result;
    }
}