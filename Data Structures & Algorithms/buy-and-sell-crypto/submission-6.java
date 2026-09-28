class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int minB = prices[0];
        for (int i = 0; i<prices.length; i++) {
            profit  = Math.max(profit, prices[i] - minB);
            minB = Math.min(minB, prices[i]);
        }
        return profit;
    }
}
