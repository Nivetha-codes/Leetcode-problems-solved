class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int[] res = new int[temperatures.length];
        Deque<Integer> stk = new ArrayDeque<>();

        for (int i = 0; i < temperatures.length; i++) {

            while (!stk.isEmpty() && temperatures[stk.peek()] < temperatures[i]) {

                
                res[stk.peek()] = i - stk.pop();

            }
            stk.push(i);
            
        }

        
        return res;

    }
}