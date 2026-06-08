class Solution {
    public String removeKdigits(String num, int k) {

        Deque<Integer> stk = new ArrayDeque<>();
        int count = 0;
        for (int i = 0; i < num.length(); i++) {

            int digit = Character.getNumericValue(num.charAt(i));

            while (!stk.isEmpty() && count != k && digit < stk.peek()) {
                stk.pop();
                count++;
            }

            stk.push(digit);
        }

        while (count < k) {
            stk.pop();
            count++;
        }

        StringBuilder sb = new StringBuilder();

        while (!stk.isEmpty()) {
            sb.append(stk.removeLast());
        }

        String result = sb.toString();

        int idx = 0;
        while (idx < result.length() && result.charAt(idx) == '0') {
            idx++;
        }

        return idx == result.length() ? "0" : result.substring(idx);
    }
}