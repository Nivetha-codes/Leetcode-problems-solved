class Solution {
    public int findLHS(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();
        int maxLength = 0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }

        for(int key:map.keySet()){
            if(map.containsKey(key+1)){
                int sum = map.get(key) + map.get(key+1);
                maxLength = Math.max(maxLength,sum);
            }
        }
        
        return maxLength;
    }
}