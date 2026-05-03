class Solution {
    public int minStartValue(int[] nums) {
        
        int n = nums.length;
        int min = 0;
        int sum = 0;
        for(int i = 0 ; i < n ; i++){
            sum += nums[i];
            min = Math.min(min,sum);
        }
        
        return 1 - min;
    }
}