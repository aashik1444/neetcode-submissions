class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int res = 0;
        for (int n:nums) {
            if(!hm.containsKey(n)) {
                hm.put(n, hm.getOrDefault(n-1,0) + hm.getOrDefault(n+1,0) + 1);
                hm.put(n+hm.getOrDefault(n+1,0), hm.get(n));
                hm.put(n-hm.getOrDefault(n-1,0), hm.get(n));
                res = Math.max(res, hm.get(n));
            }
        }
        return res;
    }
}
