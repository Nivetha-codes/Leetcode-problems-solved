class Solution {
    public boolean backspaceCompare(String s, String t) {

        /*
        String str1 = helper(s);
        String str2 = helper(t);
        
        if(str1.equals(str2)){
            return true;
        }
        return false;
        */

        // TC : (O(M+N), SC: O(1)) -> Two pointers
        int i = s.length() - 1;
        int j = t.length() - 1;
        int skipS = 0;
        int skipT = 0;

        while (i >= 0 || j >= 0) {

            while (i >= 0) {
                
                if (s.charAt(i) == '#') {
                    skipS++;
                    i--;
                } else if (skipS > 0) {
                    skipS--;
                    i--;
                } else {
                    break;
                }
            }

            while (j >= 0) {
        
                if (t.charAt(j) == '#') {
                    skipT++;
                    j--;
                } else if (skipT > 0) {
                    skipT--;
                    j--;
                } else {
                    break;
                }
            }

            if(i>= 0 && j >= 0){
                if(s.charAt(i) != t.charAt(j)){
                    return false;
                }
            }else if(i>= 0 || j >= 0){ // handles edge cases like s ="#", t="c", one of them i or j could be more than 0 while the other is lesser than 0
                return false;
            }

            i--;
            j--;
        }
        return true;

    }

    // TC : (O(M+N), SC: O(M+N))
    public String helper(String str) {
        Deque<Character> stk = new ArrayDeque<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!stk.isEmpty()) {
                if (c == '#') {
                    stk.pop();
                } else {
                    stk.push(c);
                }
            } else if (c != '#') {
                stk.push(c);
            }
        }

        StringBuilder str1 = new StringBuilder();
        while (!stk.isEmpty()) {
            str1.append(stk.pop());
        }

        return str1.reverse().toString();
    }

}