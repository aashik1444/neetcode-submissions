class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (k == nums.length) return nums;
        HashMap<Integer, Integer> counter = new HashMap<>();
        for (int n : nums) {
            counter.put(n, counter.getOrDefault(n, 0) + 1);
        }
        Queue<Integer> heap =  new PriorityQueue<>((a,b) -> counter.get(a)- counter.get(b));
        for (int n : counter.keySet()) {
            heap.add(n);
            if (heap.size() > k) {
                heap.poll();
            }
        }
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = heap.poll();
        }
        return ans;
    }
}
