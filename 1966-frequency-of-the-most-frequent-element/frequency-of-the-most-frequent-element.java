class Solution {
    public int maxFrequency(int[] nums, int k) {

        int res = 0;
        int r = 0;
        int l = 0;
        long windowTotal = 0;

        Arrays.sort(nums);

        while( r < nums.length){

            windowTotal += nums[r];

            //formula is the major thing in this problem
            // for an array of  [1,1,1,2,2,4] , k = 2
            // if we need 2 for all the elements before actual 2 i.e [2,2,2,2] - we should check whether making them all 2 is less or equal to allowed limit i.e 1+1+1+2 + k. here making them all 2 means multiplying the window length with 2 will give the ans 8 (2 * 4) whereas the actual allowed limit is only 1+1+1+2 + k = 7. 8 > 7 violates the condition , therefore, window need to shrink from left. now we have [1,1,2]. 2 * 3 = 6 <= 4+2 = 6. this does not violate the condition and we continue to expand the window.
            while((long) nums[r] * (r-l+1) > windowTotal + k){
                windowTotal -= nums[l];
                l++;
            }

            res = Math.max(res, r-l+1);
            r++;
        }

        return res;
        
    }
}