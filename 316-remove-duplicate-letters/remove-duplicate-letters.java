class Solution {
    public String removeDuplicateLetters(String s) {

        Deque<Character> stk = new ArrayDeque<>();
        Map<Integer, Boolean> seen = new HashMap<>();
        int[] lastIndex = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            lastIndex[c - 'a'] = i;
        }

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            if (seen.containsKey(c - 'a') && seen.get(c - 'a')) {
                continue;
            }

            while (!stk.isEmpty() && (stk.peek() > c) && (lastIndex[stk.peek() - 'a'] > i)) {

                seen.put(stk.pop() - 'a', false);
            }

            stk.push(c);
            seen.put(c - 'a', true);
        }

        String res = "";
        while (!stk.isEmpty()) {
            res += stk.removeLast();
        }

        return res;

    }
}