class Solution {
    public String removeDuplicates(String s, int k) {

       	record Pair<Character,Integer>(Character c, Integer count) {};
		Deque<Pair<Character,Integer>> stk = new ArrayDeque<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if (!stk.isEmpty()) {
				if (stk.peek().c == c) {
					
					if (stk.peek().count >= k - 1) {
						while (!stk.isEmpty() && stk.peek().c == c) {
					
							stk.pop();
							
						}
					} else {
						stk.push(new Pair<>(c,stk.peek().count+1));
						
					}

				} else {
					stk.push(new Pair<>(c,1));
					

				}
			} else {
				stk.push(new Pair<>(c,1));
			

			}
		}

		StringBuilder sb = new StringBuilder();
		while(!stk.isEmpty()) {
			sb.append(stk.pop().c);
		}

		return sb.reverse().toString();
    }
}