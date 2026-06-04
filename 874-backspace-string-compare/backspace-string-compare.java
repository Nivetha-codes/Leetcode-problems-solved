class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        String str1 = helper(s);
        String str2 = helper(t);

        if(str1.equals(str2)){
            return true;
        }
        return false;
    }


    public String helper(String str){
        Deque<Character> stk = new ArrayDeque<>();
        
        for(int i= 0; i<str.length(); i++){
            char c = str.charAt(i);
            if(!stk.isEmpty()){
                if(c == '#'){
                    stk.pop();
                }else{
                    stk.push(c);
                }
            }else if(c != '#'){
                stk.push(c);
            }
        }

        StringBuilder str1= new StringBuilder();
        while(!stk.isEmpty()){
            str1.append(stk.pop());
        }

        return str1.reverse().toString();
    }

    
}