class Solution {
    public int maximumUniqueSubarray(int[] nums) {


        Map<Integer,Integer> map = new HashMap<>();
        int left = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for(int right = 0; right < nums.length; right++){

            sum += nums[right];
            map.put(nums[right], map.getOrDefault(nums[right],0)+1);

            while(map.get(nums[right]) > 1){
                
                sum -= nums[left];
                map.put(nums[left], map.get(nums[left]) - 1);
                
                if(map.get(nums[left]) == 0){
                    map.remove(nums[left]);
                    
                }
                left++;
            }

           
            max = Math.max(max, sum);
        }

        return max;
        
    }
}