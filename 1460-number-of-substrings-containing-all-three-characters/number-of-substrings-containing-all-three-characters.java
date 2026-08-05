class Solution {
    public int numberOfSubstrings(String s) {

        int l = 0;
        int r = 0;
        int count = 0;
        int[] freqArr = new int[3];

        while(r < s.length()){

            
            freqArr[s.charAt(r) - 'a']++;

            while(freqArr[0] > 0 && freqArr[1] > 0 && freqArr[2] > 0 ){
                count += s.length() - r;
                freqArr[s.charAt(l) - 'a']--;
                l++;
            }

            r++;

        }

        return count;

       
        
    }
}