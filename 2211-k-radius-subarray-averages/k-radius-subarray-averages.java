class Solution {
    public int[] getAverages(int[] nums, int k) {

        int l = 0;
        long sum = 0L;

        int[] arr = new int[nums.length];
        Arrays.fill(arr, -1);

        // if (k >= nums.length) {
        //     return arr;
        // }

        for (int r = 0; r < nums.length; r++) {

            sum += nums[r];

            // if(nums.length - r <= k || k == 0){
            if (r >= k*2) {
                int avg = (int) (sum / (r - l + 1)); //brackets around expression makes sure it is divided as long first and then casted to int. if it happens otherwise, we are casing long sum to int and then dividing which will produce a wrong sum value and overall wrong ans
                arr[r - k] = avg;
                sum -= nums[l];
                l++;
            }
        }

        return arr;

    }
}