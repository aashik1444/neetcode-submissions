class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        longest = 0
        hmap = set(nums)

        for n in hmap:
            if (n -1) not in hmap:
                length = 1
                while (n + length) in hmap:
                    length += 1
                longest = max(length, longest)
        return longest

        