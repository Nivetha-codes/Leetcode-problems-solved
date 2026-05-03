class Solution {
    public int pivotIndex(int[] nums) {

        int n = nums.length;
        for (int i = 1; i < n; i++) {
            nums[i] += nums[i - 1];
        }

        int index = -1;
        int left = 0;
        int total = nums[n-1];
        for (int i = 0; i < n; i++) {

            int curr = nums[i];
            if (left == (total - curr)) {
                index = i;
                break;
            }
            left = curr;

        }

        return index;
    }
}