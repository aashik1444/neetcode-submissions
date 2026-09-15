class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int mb = prices[0];

        for (int i : prices) {
            profit = Math.max(profit, i - mb);
            mb = Math.min(i, mb);
        }
        return profit;
    }
}
