class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        HashSet<Integer> hm = new HashSet<>();
        for (int i: nums) {
            if (hm.contains(i)) {
                return true;
            }
            hm.add(i);
        }
        return false;
    }
}