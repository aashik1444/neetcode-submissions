class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        int res = 0;

        for (int num:nums) {
            if (!hm.containsKey(num)) {
                hm.put(num, hm.getOrDefault(num-1, 0 ) + 1 + hm.getOrDefault(num+1,0));
                hm.put(num - hm.getOrDefault(num-1,0), hm.get(num));
                hm.put(num + hm.getOrDefault(num+1,0), hm.get(num));
                res = Math.max(res, hm.get(num));
            }
        }
        return res;
    }
}
