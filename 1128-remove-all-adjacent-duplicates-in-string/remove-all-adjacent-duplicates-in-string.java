class Solution {
    public String removeDuplicates(String s) {
        /*
        Deque<Character> stk = new ArrayDeque<>();
        for(int i=0; i<s.length(); i++){

            char c = s.charAt(i);
            if(!stk.isEmpty()){
                if(stk.peek() == c){
                    stk.pop();
                }else{
                    stk.push(c);
                }
            }else{
                stk.push(c);
            }
        }

        StringBuilder str = new StringBuilder();
        while(!stk.isEmpty()){
            str.append(stk.pop());
        }

         return str.reverse().toString();
        */

        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(!sb.isEmpty() && sb.charAt(sb.length()-1) == c){
                sb.deleteCharAt(sb.length()-1);
            }else{
                sb.append(c);
            }
        }

        return sb.toString();
    }
}