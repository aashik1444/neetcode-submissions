class Solution:
    def maxArea(self, heights: List[int]) -> int:
        l, r = 0, len(heights) -1
        sol = 0

        while l < r:
            area = (r - l) * min(heights[l], heights[r])
            sol = max(sol, area)
            if heights[l] < heights[r]:
                l += 1
            else:
                r -= 1
        return sol