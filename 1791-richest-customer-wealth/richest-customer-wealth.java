class Solution {
    public int maximumWealth(int[][] accounts) {

        //TC - O(M * N)
        //In a multi-dimensional array - the total number of elements is expressed as O(M*N). Since every value must be examined at least once, you can’t do better than linear time here. Writing this as O(M×N) reflects the matrix dimensions, but asymptotically it’s the same as O(N) if N is the total input size.
        //we have to read the value of each bank account of every customer atleast once to find the richest customer unless some kind of additional info is provided like no customer can have more than 10000. Cannot be optimized any more.
        //SC - O(1)

        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int[] amount : accounts){

                for(int j : amount){
                    sum += j;
                }
            
            max = Math.max(sum,max);
            sum = 0;

        }

        return max;
        
    }
}