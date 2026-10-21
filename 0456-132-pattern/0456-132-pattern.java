class Solution {
    public boolean find132pattern(int[] nums) {
        Deque<Integer> st = new ArrayDeque<>();
        int last = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < last) return true;
            while (!st.isEmpty() && st.peek() < nums[i]) {
                last = st.peek();
                st.pop();
            }
            st.push(nums[i]);
        }
        return false;
    }
}