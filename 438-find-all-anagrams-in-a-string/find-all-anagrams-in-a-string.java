class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        int window = p.length();
        int[] pArr = new int[26];
        List<Integer> res = new ArrayList<>();

        for(char c: p.toCharArray()){
            pArr[c-'a']++;
        }

        
        for(int i=0;i<s.length();i++){
            
            int right = i;
            int tempWindow = window;
            int[] tempArr = new int[26];

            if(s.length()-i >= window){
                while(tempWindow > 0){
                    char c = s.charAt(right);
                    tempArr[c-'a']++;
                    tempWindow--;
                    right++;
                }

                if(Arrays.equals(pArr,tempArr)){
                    res.add(i);
                }
            }
        }

        return res;

    }
}