class MinStack {

    Deque<Integer> stk = new ArrayDeque<>();
    Deque<Integer> minStk = new ArrayDeque<>();
    int min = Integer.MAX_VALUE;

    public MinStack() {

    }

    public void push(int value) {
        if (!minStk.isEmpty() && value > minStk.peek()) {
            minStk.push(minStk.peek());
            min = minStk.peek();
        } else {
            minStk.push(value);
            min = value;
        }

        stk.push(value);
    }

    public void pop() {
        stk.pop();
        minStk.pop();
        if (!minStk.isEmpty()) {
            min = minStk.peek();
        }
    }

    public int top() {
        return stk.peek();
    }

    public int getMin() {
        return min;
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