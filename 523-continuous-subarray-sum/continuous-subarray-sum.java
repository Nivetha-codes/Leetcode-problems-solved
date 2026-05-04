class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {

        int n = nums.length;
        Map<Integer, Integer> remMap = new HashMap<>();
        remMap.put(0, -1); //rem 0, index -1

        if (n <= 1) {
            return false;
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {

            sum += nums[i];
            int rem = sum % k;
            if (remMap.containsKey(rem)) {
                if (i - remMap.get(rem) >= 2) {
                    return true;
                }
            } else {
                remMap.put(rem, i);
            }
        }

        return false;

    }
}