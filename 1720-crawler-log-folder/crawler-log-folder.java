class Solution {
    public int minOperations(String[] logs) {
        
        Deque<String> stk = new ArrayDeque<>();

        for(String s : logs){
            if(s.equals("../")){
                if(!stk.isEmpty()){
                    stk.pop();
                }
            }
            else if(s.equals("./")){
                continue;
            }
            else{
                stk.push(s);
            }
        }

        return stk.size();
    }
}