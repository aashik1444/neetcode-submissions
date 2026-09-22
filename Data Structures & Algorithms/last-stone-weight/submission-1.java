class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int s: stones) {
            heap.offer(-s);
        }
        while (heap.size() > 1) {
            int first = heap.poll();
            int sec = heap.poll();
            if (sec > first) {
                heap.offer(first-sec);
            }
        }
        heap.offer(0);
        return Math.abs(heap.peek());
    }
}
