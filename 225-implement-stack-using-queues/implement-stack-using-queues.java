class MyStack {

    List<Integer> dq;
    int rear;

    public MyStack() {

        dq = new ArrayList<>();
        rear = 0;
        
    }

    public void push(int x) {

        dq.add(rear,x);
        rear++;

    }

    public int pop() {

        rear--;
        return dq.get(rear);

    }

    public int top() {

        return dq.get(rear-1);
    }

    public boolean empty() {
        if(rear == 0){
            return true;
        }
            
        return false;
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */