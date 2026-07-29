class Solution {
    public int minimumRecolors(String blocks, int k) {

        int w_count = 0;
        int minOps = Integer.MAX_VALUE;
        for (int i = 0; i < blocks.length(); i++) {

            char c = blocks.charAt(i);

            if (c == 'W') {
                w_count++;
            }

            if (i >= k - 1) {

                minOps = Math.min(minOps, w_count);
                
                if (blocks.charAt(i - k + 1) == 'W') {
                    w_count--;
                }

            }

        }

        return minOps;

    }
}