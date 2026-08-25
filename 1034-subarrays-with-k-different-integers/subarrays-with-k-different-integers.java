class Solution {

    public int helper(int[] nums, int k) {

        //k different integers means -  exactly k no.of integers, hence the formula, exactly k = atmost(k) - atmost(k-1)

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int l = 0;
        int r = 0;

        while (r < nums.length) {

            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);

            while (map.size() > k) {

                map.put(nums[l], map.get(nums[l]) - 1);

                if (map.get(nums[l]) == 0) {
                    map.remove(nums[l]);
                }
                l++;

            }

            count += r - l + 1;

            r++;

        }

        return count;

    }

    public int subarraysWithKDistinct(int[] nums, int k) {

        int count = helper(nums, k) - helper(nums, k - 1);
        return count;

    }
}