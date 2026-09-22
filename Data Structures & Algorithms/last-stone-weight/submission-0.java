class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> max = new PriorityQueue<>();
        for (int s: stones) {
            max.offer(-s);
        }
        while (max.size() > 1) {
            int first = max.poll();
            int second = max.poll();
            if (second > first) {
                max.offer(first-second);
            }
        }
        max.offer(0);
        return Math.abs(max.peek());
    }
}
