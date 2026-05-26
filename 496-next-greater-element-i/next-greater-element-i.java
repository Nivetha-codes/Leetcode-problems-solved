class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Deque<Integer> stack = new ArrayDeque<>();

        int[] res = new int[nums1.length];
        Arrays.fill(res, -1);

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], i);
        }

        for(int i = 0; i < nums2.length; i++) {

            while(!stack.isEmpty() && stack.peek() < nums2[i] ){
                res[map.get(stack.pop())] = nums2[i];
            }
            if(map.containsKey(nums2[i])){
                stack.push(nums2[i]);
            }
            
        }

        /* brute force
         for(int i = 0; i< nums1.length; i++){
        boolean flag = false;
        for(int j = 0; j< nums2.length; j++){
            if(nums2[j] == nums1[i]){
                flag = true;
            }
            if(flag){
                if(nums2[j] > nums1[i]){
                    res[i] = nums2[j];
                    break;
                }
            }
        }
         }
         */

        return res;

    }
}