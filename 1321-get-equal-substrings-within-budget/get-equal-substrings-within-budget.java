class Solution {
    public int equalSubstring(String s, String t, int maxCost) {

        int l = 0;
        int r = 0;
        int total = 0;
        int maxLen = Integer.MIN_VALUE;
        int[] diffArr = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            char c_s = s.charAt(i);
            char c_t = t.charAt(i);

            diffArr[i] = Math.abs(c_s - c_t);
        }

        while (r < diffArr.length) {

            total += diffArr[r];

            if (total > maxCost) {

                total -= diffArr[l];
                l++;

            }

            if (total <= maxCost) {
                maxLen = Math.max(maxLen, r - l + 1);
            }
            r++;

        }

        return maxLen;

    }
}