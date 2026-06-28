class Solution {
    public String removeStars(String s) {

        Deque<Character> stk = new ArrayDeque<>();
        for(char c : s.toCharArray()){
            if(c == '*'){
                stk.pop();
            }else{
                stk.push(c);
            }

        }

        StringBuilder sb = new StringBuilder();
        while(!stk.isEmpty()){
            sb.append(stk.removeLast());
        }

        return sb.toString();
        
    }
}