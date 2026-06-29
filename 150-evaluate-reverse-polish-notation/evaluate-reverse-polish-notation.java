class Solution {
    public int evalRPN(String[] tokens) {

        Deque<Integer> stk = new ArrayDeque<>();

        for (String s : tokens) {

            switch (s) {
                case "+":{
                    int right_op = stk.pop();
                    int left_op = stk.pop();
                    int add = left_op + right_op;
                    stk.push(add);
                    break;
                }
                case "-":{
                    int right_op = stk.pop();
                    int left_op = stk.pop();
                    int sub = left_op - right_op;
                    stk.push(sub);
                    break;
                }
                case "*":{
                    int right_op = stk.pop();
                    int left_op = stk.pop();
                    int mul = left_op * right_op;
                    stk.push(mul);
                    break;
                }
                case "/":
                {
                    int right_op = stk.pop();
                    int left_op = stk.pop();
                    int div = left_op / right_op;
                    stk.push(div);
                    break;
                }
                default:
                    stk.push(Integer.parseInt(s));
            }
        }

        return stk.pop();

    }
}