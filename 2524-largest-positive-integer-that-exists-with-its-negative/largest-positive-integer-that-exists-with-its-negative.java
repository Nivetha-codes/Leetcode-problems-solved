class Solution {
    public int findMaxK(int[] nums) {


        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;

        while(nums[i] < 0 && nums[j] > 0){

            if(Math.abs(nums[i]) - nums[j] == 0){
                return nums[j];
            }

            if(Math.abs(nums[i]) < Math.abs(nums[j])){
                j--;
            }

             if(Math.abs(nums[i]) > Math.abs(nums[j])){
                i++;
            }
        }

        return -1;
        
    }
}