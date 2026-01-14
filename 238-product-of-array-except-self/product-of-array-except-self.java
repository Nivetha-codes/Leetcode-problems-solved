class Solution {
    public int[] productExceptSelf(int[] nums) {
        

        int[]  answer = new int[nums.length];
        answer[0] = 1; // there is no number at the left of 1st element in nums, therefore, mul it with 1 and get the same num.

        //prefix - from left to right
        for(int i=1; i<nums.length;i++){
            answer[i] = answer[i-1] * nums[i-1];
            // System.out.println(answer[i]);
            //answer = [1,1,2,6]
        }

        //suffix - from right to left
        int right=1;
        for(int j=nums.length-1; j>=0;j--){
            answer[j] *= right;
            right *=  nums[j];
            System.out.print(answer[j] + " ");
        }

        return answer;
    }
}