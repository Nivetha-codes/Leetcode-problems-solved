class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        int[] stack = new int[asteroids.length];
        int top = 0;

        for (int i : asteroids) {

            
            boolean alive = true;
            while (alive && top > 0 && stack[top-1] > 0 && i < 0) {
                
                int diff = stack[top-1] + i;
                
                if(diff < 0){ //incoming is greater - pop and add new
                    top--;
                   
                }
                else if(diff > 0){ //top is greater - no pop , no add new , topust move on
                    alive = false;
                }
                else{
                    top--;
                    alive = false;
                }
                
            }

            if(alive){
                stack[top++] = i;
            
            }
           
        }

    
        return Arrays.copyOf(stack,top);

    }
}