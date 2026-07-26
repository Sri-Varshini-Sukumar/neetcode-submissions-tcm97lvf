class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int profit = 0;
        int min = prices[0];
        //[10,1,5,6,7,1] --> min = 1, profit = 6-1 = 5,
        for(int i=0; i<prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            profit = Math.max(profit,prices[i]-min);
        }

        return profit;
    }
}
