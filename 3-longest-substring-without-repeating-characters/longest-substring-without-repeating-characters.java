class Solution {
    public int lengthOfLongestSubstring(String s) {

        int left = 0;
        int maxLength = 0;
        Set<Character> chars = new HashSet<>();
        for(int i = 0;i<=s.length()-1;i++){

            char a = s.charAt(i);
            while(chars.contains(a)){
                chars.remove(s.charAt(left));
                left++;
            }

            chars.add(a);
            maxLength = Math.max(maxLength, i-left+1);
        }

        return maxLength;

        
    }
}