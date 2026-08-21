class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {

        int currSum = 0;
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        for(int num: nums){
            currSum += num;

            if(map.containsKey(currSum - goal)){
                count += map.get(currSum - goal);
            }

            map.put(currSum,map.getOrDefault(currSum,0) + 1);
        }

        return count;
        
    }
}