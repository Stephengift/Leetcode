class Solution {
    public int maxProfit(int[] prices) {
        //[7,1,5,3,6,4]
        int left = 0; 
        int right = 1;
        int maximum = 0;
        while(right < prices.length){
            if(prices[left] < prices[right]){
                int profit = prices[right] - prices[left];
                maximum = Math.max(maximum, profit);
            }else{
                left = right;
            }
            right++;

        }
        return maximum;
    }
}


