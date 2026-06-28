class Solution {
    public String clearDigits(String s) {

        Deque<Character> stk = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                stk.pop();
            } else {
                stk.push(c);
            }

        }

        StringBuilder sb = new StringBuilder();
        while (!stk.isEmpty()) {
            sb.append(stk.removeLast());
        }

        return sb.toString();

    }
}