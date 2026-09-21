class Solution {
    public int minOperations(int[] nums, int x) {

        int maxLen = 0;
        int totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        if(totalSum == x){
            return nums.length;
        }

        int l = 0;
        int subArraySum = 0;
        for (int r = 0; r < nums.length; r++) {
            subArraySum += nums[r];

            while (l<=r && subArraySum > totalSum - x) {
                subArraySum -= nums[l];
                l++;

            }

        
            if (subArraySum == totalSum - x) {
                maxLen = Math.max(r - l + 1, maxLen);
            }
         
        }

        return maxLen > 0 ? nums.length - maxLen : -1;

    }
}