class Solution {
    public int waysToMakeFair(int[] nums) {

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                evenSum += nums[i];
            } else {
                oddSum += nums[i];
            }
        }

        int leftEvenSum = 0;
        int leftOddSum = 0;
        int count = 0;
        int te = 0;
        int to = 0;

        //te = lefteve + oddSum - leftOddSum
        //to = leftodd + eveSum - leftEveSum
        for (int i = 0; i < nums.length; i++) {

            te = leftEvenSum + oddSum - leftOddSum;
            to = leftOddSum + evenSum - leftEvenSum;

            if (i % 2 == 0) {
                 // 0 + 1 - 0 = 1 // 1 + 1 -1 = 1
                 te -= - nums[i];
                leftEvenSum += nums[i]; // 1 // 2
            } else {
                 // 0 + 2 - 1 = 1
                 to -= - nums[i];
                leftOddSum += nums[i]; // 1
            }

            if (te == to) {
                count++;
            }

        }

        return count;

    }
}