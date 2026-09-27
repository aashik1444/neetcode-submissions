class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int l = prices[0];
        for (int i : prices) {
            profit  = Math.max(profit, i - l);
            l = Math.min(l, i);
        }
        return profit;
    }
}
