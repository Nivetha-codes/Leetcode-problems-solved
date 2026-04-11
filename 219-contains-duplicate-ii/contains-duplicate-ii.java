class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> elements = new HashSet<>();

        for(int i=0;i<=nums.length-1;i++){

            if(elements.contains(nums[i])){
                return true;
            }

            elements.add(nums[i]);

            if(elements.size() > k){
                elements.remove(nums[i-k]);
            }
        }
        return false;
    }
}