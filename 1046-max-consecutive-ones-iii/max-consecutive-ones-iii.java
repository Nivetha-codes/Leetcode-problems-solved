class Solution {
    public int longestOnes(int[] nums, int k) {

        //TC = O(N) + O(N) = O(2N) = O(N) -- 2n because of inner while loop,
        //SC = O(1)

        int left = 0;
        int right = 0;
        int zeros = 0;
        int maxLen = Integer.MIN_VALUE;

/*
        while (right < nums.length) {

            if (nums[right] == 0) {
                zeros++;
            }

            while (zeros > k) {

                if (nums[left] == 0) {
                    zeros--;
                }

                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
*/
        //Avoid inner while loop

        while (right < nums.length) {

            if (nums[right] == 0) {
                zeros++;
            }

            if (zeros > k) {

                if (nums[left] == 0) {
                    zeros--;
                }

                left++;
            }

            if (zeros <= k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            right++;
        }

        return maxLen;

    }
}