class Solution {
    public int minDeletions(int[] nums) {

        int pair = 0;
        
        for(int i = 0; i< nums.length-1; i++){

            int res = nums[i] ^ nums[i+1];

            if(res == 0){
                pair++;
            }
        }

        return pair;
    }
}