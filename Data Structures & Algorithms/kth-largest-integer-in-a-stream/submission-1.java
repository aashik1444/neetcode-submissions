class KthLargest {
    public PriorityQueue<Integer> heap;
    public int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.heap = new PriorityQueue<>();
        for (int n: nums) {
            heap.offer(n);
            if (heap.size() > k) {
                heap.poll();
            }
        }
    }
    
    public int add(int val) {
        heap.offer(val);
        if (heap.size() > k) {
            heap.poll();
        }
        return heap.peek();
    }
}
