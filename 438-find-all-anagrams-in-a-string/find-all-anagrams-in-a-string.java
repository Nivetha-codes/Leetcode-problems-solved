class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        int window = p.length();
        int[] pArr = new int[26];
        int[] windowArr = new int[26];
        List<Integer> res = new ArrayList<>();

        for (char c : p.toCharArray()) {
            pArr[c - 'a']++;
        }

        // this approac is O(p * k) - recounting for every char in s

        /*for (int i = 0; i < s.length(); i++) {
        
            int right = i;
            int tempWindow = window;
            int[] tempArr = new int[26];
        
            if (s.length() - i >= window) {
                while (tempWindow > 0) {
                    char c = s.charAt(right);
                    tempArr[c - 'a']++;
                    tempWindow--;
                    right++;
                }
        
                if (Arrays.equals(pArr, tempArr)) {
                    res.add(i);
                }
            }
        }
        */

        //optimised - O (n) approach
        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            windowArr[c - 'a']++;

            if (i >= window) {
                windowArr[s.charAt(i - window) - 'a']--;
            }

            if (Arrays.equals(pArr, windowArr)) {
                res.add(i - window + 1);
            }
        }

        return res;

    }
}