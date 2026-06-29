class Solution {
    public int evalRPN(String[] tokens) {

        Deque<Integer> stk = new ArrayDeque<>();

        for (String s : tokens) {
            try {
                int val = Integer.parseInt(s);
                stk.push(val);
            } catch (NumberFormatException e) {

                int right_op = stk.pop();
                int left_op = stk.pop();

                switch (s) {
                    case "+":
                        int add = left_op + right_op;
                        stk.push(add);
                        break;
                    case "-":
                        int sub = left_op - right_op;
                        stk.push(sub);
                        break;
                    case "*":
                        int mul = left_op * right_op;
                        stk.push(mul);
                        break;
                    case "/":
                        int div = left_op / right_op;
                        stk.push(div);
                        break;
                    default:
                        break;
                }
            }
        }

       return stk.pop();

    }
}