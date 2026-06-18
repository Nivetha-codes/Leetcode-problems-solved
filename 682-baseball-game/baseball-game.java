class Solution {
    public int calPoints(String[] operations) {

        Deque<Integer> dq = new ArrayDeque<>();
        int sum = 0;

        for(String s: operations){

            if(s.equals("+")){
                int top = dq.pop();
                int newtop = top + dq.peek();
                dq.push(top);
                dq.push(newtop);
                sum += newtop;
            }
            else if(s.equals("D")){
                dq.push(2 * dq.peek());
                sum += dq.peek();
            }
            else if(s.equals("C")){
                sum -=  dq.pop();
            }
            else{
                int val = Integer.valueOf(s);
                dq.push(val);
                sum += val;
            }
        }

        // for(int val : dq){
        //     sum += val;
        // }

        return sum;
        
    }
}