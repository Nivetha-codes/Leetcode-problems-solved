class Solution {
    public int[] finalPrices(int[] prices) {
       
        int[] ans = prices.clone();

        /* brute force
        for(int i = 0;i < prices.length; i++){
            for(int j = i+1; j< prices.length; j++){

                if(prices[j] <= prices[i]){
                    ans[i] = prices[i] - prices[j];
                    break;
                }
            }
        }
        */

        
        Deque<Integer> stk = new ArrayDeque<>();
        for(int i = 0; i< prices.length; i++){
            while(!stk.isEmpty()){
                if(prices[i] <= prices[stk.peek()]){
                    ans[stk.peek()] = prices[stk.pop()] - prices[i];
                }else{
                    break;
                }
            }
            stk.push(i);
        }
        return ans;
    }
}