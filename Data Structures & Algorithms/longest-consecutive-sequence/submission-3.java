class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> nset = new HashSet<>();
        for (int n:nums) nset.add(n);
        int longest = 0;
        for (int n:nset) {
            if (!nset.contains(n-1)) {
                int length=1;
                while (nset.contains(n+length)) length++;
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}
