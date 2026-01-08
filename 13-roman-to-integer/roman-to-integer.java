class Solution {
    public int romanToInt(String s) {

        Map<Character, Integer> romanLetterMap = Map.of('I', 1, 'V', 5, 'X', 10,
            'L', 50, 'C', 100, 'D', 500, 'M', 1000);

        //loop the string from forward, if the current character value is less than the next character value subtract (next - current) otherwise add.
        
        int result = 0; 

        //complete length should be used
        for(int i =0; i<s.length();i++){

           int cur = romanLetterMap.get(s.charAt(i));

           //prevents StringOutOfBounds exception
           int next =  (i+1 < s.length())? romanLetterMap.get(s.charAt(i+1)) : 0;

           if( cur < next  ){
                result -=  cur; 
           }
           else{
                result += cur;
           }
        }

    return result;
    
    }
}