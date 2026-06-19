class Solution {
    public boolean find132pattern(int[] nums) {

        Deque<Integer> stk = new ArrayDeque<>();
        int mid = Integer.MIN_VALUE;

        for (int i = nums.length-1; i >=0; i--) {

            if (nums[i] < mid) { // compare i(smallest) & k(mid)
                return true;
            }
            while (!stk.isEmpty() && nums[i] > stk.peek()) {
                mid = stk.pop(); // update k(mid) 
            }

            stk.push(nums[i]); //only store j (biggest) into stack

        }

        return false;
    }
}