class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (k == nums.length) return nums;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int n: nums) {
            hm.put(n, hm.getOrDefault(n, 0) + 1);
        }
        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b) -> hm.get(a)-hm.get(b));
        for (int i: hm.keySet()) {
            heap.add(i);
            if (heap.size() >k) {
                heap.poll();
            }
        }
        int[] res = new int[k];
        for (int j=0;j<k;j++) {
            res[j] = heap.poll();
        }
        return res;
    }
}
