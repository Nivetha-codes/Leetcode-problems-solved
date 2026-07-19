class Solution {

    private boolean isVowel(char c) {

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }

        return false;
    }

    public int maxVowels(String s, int k) {

        int vowelCount = 0;
        int max = 0;

        for(int i = 0; i < s.length(); i++){
            
            char c = s.charAt(i);

            if(i > k-1){
                char left = s.charAt(i-k);
                if(isVowel(left)){
                    vowelCount--;
                } 
            }

            if(isVowel(c)){
                vowelCount++;
            }

            max  = Math.max(max,vowelCount);

        }

        return max;

    }
}