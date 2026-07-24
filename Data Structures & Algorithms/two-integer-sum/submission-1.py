class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hm = {}
        for i, n in enumerate(nums):
            d = target - n
            if d in hm:
                return [hm[d], i]
            hm[n] = i
        return
        