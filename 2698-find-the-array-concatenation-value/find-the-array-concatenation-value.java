class Solution {
    public long findTheArrayConcVal(int[] nums) {

        int i = 0;
        int j = nums.length - 1;
        long ans = 0;
        
        while(i < j){
            

            ans += Long.parseLong(String.valueOf(nums[i]) + String.valueOf(nums[j]));
            i++;
            j--;

        }

        if(i == j){
            ans += nums[i];
        }

        return ans;
        
    }
}