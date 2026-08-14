class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        
        
        Deque<Integer> maxMonoDq = new ArrayDeque<>();
        int[] res = new int[nums.length-k+1];
        
        for(int i=0; i<nums.length ;i++){

           while(!maxMonoDq.isEmpty() && maxMonoDq.peekFirst() <= i-k){
                maxMonoDq.removeFirst();
           }

            while(!maxMonoDq.isEmpty() && nums[maxMonoDq.peekLast()] <= nums[i]){
                maxMonoDq.removeLast();
           }

           maxMonoDq.addLast(i);

           if(i >= k-1){
                res[i-k+1] = nums[maxMonoDq.peekFirst()];
           }

           
        }

        return res;
        
    }
}