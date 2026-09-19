class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1, r = Arrays.stream(piles).max().getAsInt();
        int res = r;
        while (l<=r) {
            long total = 0;
            int mid = l +(r-l)/2;
            for (int p: piles) total += Math.ceil((double)p/mid);
            if (total <= h) {
                r = mid-1;
                res = mid;
            }
            else l = mid + 1;
        }
        return res;
    }
}
