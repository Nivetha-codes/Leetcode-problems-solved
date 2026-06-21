class Solution {

    int pointer = 0;
    Deque<String> stk = new ArrayDeque<>();

    public String decodeString(String s) {
        

        StringBuilder str = new StringBuilder();
        String num = "";

        while(pointer < s.length()){
            char c = s.charAt(pointer);
            if(Character.isDigit(c)){

                num += c;
                pointer++;
            }
            else if(c == '['){
                stk.push(num);
                num = "";
                pointer++;
                str.append(helper(s)); 
            }
            else{
                str.append(c);
                pointer++;
            }
        }

        return str.toString() ;
    }

    public String helper(String s) {

        
        StringBuilder str = new StringBuilder();
        String num = "";
        while(s.charAt(pointer) != ']' && pointer < s.length()){
            char c = s.charAt(pointer);
            if(Character.isDigit(c)){
                num += c;
                pointer++;
            }
            else if(c == '['){
                stk.push(num);
                num = "";
                pointer++;
                str.append(helper(s)); 
            } 
            else{
                str.append(c); 
                pointer++;
            }
        }
        pointer++;

        return str.toString().repeat(Integer.valueOf(stk.pop())); 
    }
}