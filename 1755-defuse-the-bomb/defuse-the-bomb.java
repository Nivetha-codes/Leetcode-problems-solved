class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] res = new int[n];

        if (k == 0)
            return res; // all zeros

        //Brute Force
        /*
        for (int i = 0; i < n; i++) {
        
            if (k > 0) {
                for (int j = i + 1; j <= i + k; j++) {
                    res[i] += code[j % n];
                }
            }
            else if(k < 0){
                for(int j = i-1; j >= i - Math.abs(k); j--){
                    res[i] += code[((j % n) + n) % n];
                }
            }
        }
        */

        //Sliding window
        int sum = 0;
        int left = 0;
        for (int i = 0; i < n + Math.abs(k); i++) {

            sum += code[i % n];
            if (i - left > Math.abs(k) - 1) {
                sum -= code[left % n];
                left = (left + 1) % n;
            }

            if (i - left == Math.abs(k) - 1) {
                if (k > 0) {
                    res[(left - 1 + n) % n] = sum;
                }
                else {
                    res[(i + 1) % n] = sum;
                }

            }
        }

        return res;
    }

}