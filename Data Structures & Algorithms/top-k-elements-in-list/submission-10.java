class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (k == nums.length) return nums;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int l = nums.length;
        for (int i: nums) {
            hm.put(i, hm.getOrDefault(i, 0)+1);
        }
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> hm.get(a)-hm.get(b));
        for (int n: hm.keySet()) {
            heap.offer(n);
            while (heap.size() > k) {
                heap.poll();
            }
        }
        int[] res = new int[k];
        for (int j=0; j<k; j++) {
            res[j] = heap.poll();
        }
        return res;
        
    }
}
