class Solution {
    public int differenceOfSum(int[] nums) {

        int elementSum = 0;
        int digitSum = 0;
        int res = 0;

        for(int i = 0; i< nums.length; i++){

            int temp = nums[i];
            while(temp > 0){
                int digit = temp % 10;
                digitSum += digit;
                temp /=  10;
            }
            elementSum += nums[i];
        }

        return Math.abs(elementSum - digitSum);
        
    }
}