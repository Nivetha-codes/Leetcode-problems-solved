class Solution {
    public String removeDuplicates(String s, int k) {

        record Pair<Character, Integer>(Character key, int count) {
        }
        ;
        Deque<Pair<Character, Integer>> stk = new ArrayDeque<>();

        /* TC : O(N*K) -> because of while loop and adding each node with count
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
        
            if (!stk.isEmpty()) {
                if (stk.peek().c == c) {
        
                    if (stk.peek().count >= k - 1) {
                        while (!stk.isEmpty() && stk.peek().c == c) {
        
                            stk.pop();
        
                        }
                    } else {
                        stk.push(new Pair<>(c, stk.peek().count + 1));
        
                    }
        
                } else {
                    stk.push(new Pair<>(c, 1));
        
                }
            } else {
                stk.push(new Pair<>(c, 1));
        
            }
        }
        
        */

        /* Stack -> TC : O(N)
        for (char c : s.toCharArray()) {

            if (!stk.isEmpty() && stk.peek().key == c) {
                int newCount = stk.pop().count + 1;
                if (newCount < k) {
                    stk.push(new Pair(c, newCount));
                }
            } else {
                stk.push(new Pair(c, 1));
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stk.isEmpty()) {

            Pair p = stk.removeLast();
            for (int i = 0; i < p.count; i++) {
                sb.append(p.key);
            }
        }
        return sb.toString();
        */

        //Pointers and Array , TC : O(N)
        char[] arr = s.toCharArray();
        int[] count = new int[arr.length]; 

        int i = 0;
        for(int j=0; j<s.length(); j++,i++){
            
            arr[i] = arr[j];
            if(i>0 && arr[i] == arr[i-1]){
                count[i] = count[i-1] + 1;
            }else{
                count[i] = 1;
            }

            if(count[i] == k){
                i -= k;
            }
        }

        return new String(arr,0,i);
        
    }
}