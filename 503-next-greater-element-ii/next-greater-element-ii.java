class Solution {
    public int[] nextGreaterElements(int[] nums) {

        Deque<Integer> stk = new ArrayDeque<>();
        int[] res = new int[nums.length];
        for (int i = 0; i < 2 * nums.length -1; i++) {

            int idx = i % nums.length;

            while (!stk.isEmpty() && nums[stk.peek()] < nums[idx]) {
                res[stk.pop()] = nums[idx];
            }
            if (i < nums.length) {
                stk.push(idx);
            }

        }

        while (!stk.isEmpty()) {
            res[stk.pop()] = -1;
        }

        return res;
    }
}