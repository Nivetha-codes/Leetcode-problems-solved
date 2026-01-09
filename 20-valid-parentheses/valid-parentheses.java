class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack();
        if(s.length() % 2 != 0 ){ //if the length is not even, it is never a valid parentheses. ex: "[]{" , "("
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        for(char c : s.toCharArray()){

            if(map.containsKey(c)){
                stack.push(c); //if it's open bracket, push it
            }

            else if(map.containsValue(c) ){ //if it's a close bracket

                if(stack.isEmpty()){ //stack can be empty if the string not starting with a open bracket, ex: "}" 
                    return false;
                }

                char top = stack.pop(); //pop the open bracket and if the bracket is mismatched, return false. When a close bracket is found, the top element in stack should always be it's open bracket otherwise it's false.
                if(map.get(top) != c){
                    return false;
                }
            }
           

        }

        return stack.isEmpty(); // after the loop ends, stack could be either empty(truth case) or not (false case)

    }
}