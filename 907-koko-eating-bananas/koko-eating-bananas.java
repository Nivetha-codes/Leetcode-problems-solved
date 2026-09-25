class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        
        int low = 1;
        int high = 1;
        for(int n : piles){
           high = Math.max(n,high);
        }

        while(low <= high){

            int mid = low + (high - low) / 2;
            if(feasible(mid, piles, h)){
                high = mid-1;
            }
            else{
                low = mid + 1;
            }
        }

        return low;
        
    }

    private boolean feasible(int mid , int[] piles, int h){
        
        long hours = 0;
        for(int i = 0; i < piles.length; i++){
            hours += (piles[i] + mid - 1) / mid;
        }

        return hours <= h;
        
    }
}