class Solution {
    public int diagonalSum(int[][] mat) {

            
            int sum = 0;
            for(int i = 0; i< mat.length; i++){
                
                sum += mat[i][i]; // primary diagonal indexes are 00,11,22,33 etc..
                
                //secondary diagonal pattern is i increment by 1 and j decrement by 1 -> can also be written as j + i = n - 1 (03,11,20 etc. n = 4) -> j = n-1-i or i != n-1-i

                // as we are traversing in linear order, when mat length is odd, the mid index common to both pri and sec diagonal is not calculated twice. 
                if(i != (mat.length - 1 - i)){
                      sum += mat[i][mat.length - 1 - i];
                }

                
            }

            return sum;


        
    }
}