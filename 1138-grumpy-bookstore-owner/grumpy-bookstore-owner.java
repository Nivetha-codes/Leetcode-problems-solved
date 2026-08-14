class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {

        int r = 0;
        int max = Integer.MIN_VALUE;
        int satisfied = 0;
        int sum = 0;

        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 0) {
                satisfied += customers[i];
            }
        }

        while (r < grumpy.length) {

            if (grumpy[r] == 1) {
                sum += customers[r];
            }

            if (r > minutes - 1) {

                if (grumpy[r - minutes] == 1) {

                    sum -= customers[r - minutes];
                }
            }

            if (r >= minutes - 1) {
                max = Math.max(max, sum);
            }
            r++;

        }

        return max + satisfied;

    }
}