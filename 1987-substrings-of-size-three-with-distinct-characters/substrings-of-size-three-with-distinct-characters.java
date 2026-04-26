class Solution {
    public int countGoodSubstrings(String s) {

        Set<Character> charSet = new HashSet<>();
        int count = 0;
        int left = 0;
        for(int i = 0; i<s.length(); i++){

            char curr = s.charAt(i);

            while(charSet.contains(curr)){
                charSet.remove( s.charAt(left));
                left++;
            }
            charSet.add(curr);

            if(charSet.size() >= 3){
               count++;
            }
        }

        return count;

        
    }
}