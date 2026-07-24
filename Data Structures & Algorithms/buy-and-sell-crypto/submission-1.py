class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxP = 0
        minP = prices[0]

        for k in prices:
            maxP = max(maxP, k - minP)
            minP = min(minP, k)
        return maxP