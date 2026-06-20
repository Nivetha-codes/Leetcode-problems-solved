// class MyQueue {

//     Deque<Integer> stk;

//     public MyQueue() {
//          stk = new ArrayDeque<>();
//     }
    
//     public void push(int x) {
//         stk.addLast(x);
//     }
    
//     public int pop() {
//         return stk.pop();
//     }
    
//     public int peek() {
//         return stk.peek();
//     }
    
//     public boolean empty() {
//         return stk.isEmpty();
//     }
// }

class MyQueue {

    List<Integer> list;
    int left = 0;
    int right = 0;


    public MyQueue() {
         list = new ArrayList<>();
    }
    
    public void push(int x) {
        list.add(right,x);
        right++;
    }
    
    public int pop() {
        int val = list.get(left);
        left++;
        return val;
    }
    
    public int peek() {
        return list.get(left);
    }
    
    public boolean empty() {
        if(left == right){
            return true;
        }
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */