class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        int k = nums.size();

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(a[0], b[0])
        );

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < k; i++) {
            int value = nums.get(i).get(0);
            pq.offer(new int[]{value, i, 0});
            max = Math.max(max, value);
        }

        int start = pq.peek()[0];
        int end = max;

        while (true) {
            int[] current = pq.poll();

            int min = current[0];
            int list = current[1];
            int index = current[2];

            if (max - min < end - start) {
                start = min;
                end = max;
            }

            if (index + 1 == nums.get(list).size()) {
                break;
            }

            int next = nums.get(list).get(index + 1);

            pq.offer(new int[]{next, list, index + 1});

            max = Math.max(max, next);
        }

        return new int[]{start, end};
    }
}