class Solution {
    public int maxSubArray(int[] nums) {

        int max = nums[0];
        int currSum = nums[0];
        /*
        for(int i = 0; i< nums.length; i++){
            int sum = 0;
            for(int j = i; j< nums.length; j++){
                sum += nums[j];
                max = Math.max(sum, max);
            }
        }
        */
        for(int i = 1; i< nums.length; i++){
            currSum = Math.max(nums[i],currSum + nums[i]);
            max = Math.max(max,currSum);
        }
        return max;
        
    }
}