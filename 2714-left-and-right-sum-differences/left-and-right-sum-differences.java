class Solution {
    public int[] leftRightDifference(int[] nums) {

        int leftSum = 0;
        int rightSum = 0;
        int[] arr = new int[nums.length];

        for(int i = 0; i<nums.length; i++){
            arr[i] = leftSum;
            leftSum += nums[i];
            
        }

        for(int j = nums.length - 1; j>= 0; j--){
           
            arr[j] = Math.abs(arr[j] - rightSum);
            rightSum += nums[j];
        }

        return arr;

        
    }
}