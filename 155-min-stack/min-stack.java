class MinStack {

    Deque<Integer> stk;
    Deque<Integer> minStk;

    public MinStack() {
        stk = new ArrayDeque<>();
        minStk = new ArrayDeque<>();
    }

    public void push(int value) {
        stk.push(value);

        if (minStk.isEmpty() || (!minStk.isEmpty() && value <= minStk.peek())) {
           minStk.push(value);
        }
    }

    public void pop() {
        if (stk.peek().equals(minStk.peek())) {
            minStk.pop();
        }
        stk.pop();
    }

    public int top() {
        return stk.peek();
    }

    public int getMin() {
        return minStk.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */