class Solution {
    public int subarraySum(int[] nums, int k) {

        int count = 0;

        //brute force TC - O(n^2) , SC - O(1)
        /*
        for(int i = 0; i< nums.length; i++){
            int sum = 0;
            for(int j = i; j<nums.length; j++){
        
                sum += nums[j];
                if(sum == k){
                    count++;
                }
        
            }
        }
        */

        // TC - O(n), SC - O(n)
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int num : nums) {
            sum += num;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;

    }
}