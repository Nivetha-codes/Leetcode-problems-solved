class Solution {
    public String makeGood(String s) {
        if (s.length() == 0)
            return "";

        Deque<Character> stk = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            if (!stk.isEmpty()) {
                if (Character.toLowerCase(stk.peek()) == Character.toLowerCase(c)) { // same alphabet
                    if (stk.peek() != c) { //opposite case
                        stk.pop();
                    } else {
                        stk.push(c); // same case
                    }

                } else { // different alphabet
                    stk.push(c);
                }
            } else {
                stk.push(c);
            }

        }

        StringBuilder str = new StringBuilder();

        while (!stk.isEmpty()) {
            str.append(stk.pop());
        }

        String res = str.reverse().toString();

        return res;
    }
}