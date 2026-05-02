class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {

        int min_sum = Integer.MAX_VALUE;
        int size = nums.size();

        //brute force
        for (int i = 0; i < size; i++) {
            int sum = 0;

            for (int j = i; j < size; j++) {

                sum += nums.get(j);
                int len = j - i + 1;

                if (len >= l && len <= r && sum > 0) {
                    min_sum = Math.min(sum, min_sum);
                }

                if (len > r)
                    break;

            }

        }

        return min_sum == Integer.MAX_VALUE ? -1 : min_sum;

    }
}