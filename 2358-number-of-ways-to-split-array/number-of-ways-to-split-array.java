class Solution {
    public int waysToSplitArray(int[] nums) {

        int countValidSplit = 0;
        long totalSum = 0;
        long leftSum = 0;

        for(int i = 0; i < nums.length; i++){
            totalSum += nums[i];
        }

        for(int i = 0; i< nums.length-1; i++){

            leftSum += nums[i];
            if(leftSum >= totalSum - leftSum){
                countValidSplit++;
            }

        }

        return countValidSplit;
        
    }
}