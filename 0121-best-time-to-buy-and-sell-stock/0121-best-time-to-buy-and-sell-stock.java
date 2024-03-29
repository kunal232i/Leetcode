class Solution {
    public int maxProfit(int[] prices) {
        int mini = prices[0];
        int maxProfit = 0;
        for(int i=0; i<prices.length; i++){
            int profit = prices[i] - mini;
            mini = Math.min(prices[i],mini);
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
}