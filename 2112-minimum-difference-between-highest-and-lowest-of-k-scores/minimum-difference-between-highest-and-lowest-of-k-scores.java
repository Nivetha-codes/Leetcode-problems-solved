class Solution {
    public int minimumDifference(int[] nums, int k) {

        int min = Integer.MAX_VALUE;
        Arrays.sort(nums);
        int diff = 0;

        if(nums.length == 1){
            return 0;
        }

        for(int i = 0; i <= nums.length - k; i++){
           
                diff = nums[i+k-1] - nums[i];
                // System.out.println("diff: " +diff);
                min = Math.min(diff,min);
            
        }
        return min;
    }
}