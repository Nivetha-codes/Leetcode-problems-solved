class Solution {
    public int findMiddleIndex(int[] nums) {

        // to find a middle index - we should know left sum and right sum of that index. when we do prefix sum for the arr, leftSum is present in midIndex-1 and rightSum is basically totalSum - midIndex Value in prefix sum array

        //calculate prefix sum array
        
        for(int i = 1; i< nums.length; i++){ // i starts from 0 becoz, nums[0] remains same in prefix arr and as we are modifying same arr, it will stay as it is.
            nums[i] += nums[i-1];
        }

        int index = -1;
        int leftSum = 0;
        int totalSum = nums[nums.length-1];
        for(int i = 0; i< nums.length ; i++){

            if(leftSum == totalSum - nums[i]){
                index = i;
                return i;
            }

            leftSum = nums[i];
        }

        return index;
        
    }
}