class Solution {
    public int shipWithinDays(int[] weights, int days) {


        int low = 1;
        int high = 0;
        for(int w :  weights) {
            low = Math.max(w, low);
            high += w;
        }


        while(low <= high){
            int mid = low + (high-low) / 2;

            if(feasible(mid,weights,days)){
                high = mid-1;
            }else{
                low = mid + 1;
            }
        }
        return low;
  
    }

    private boolean feasible(int mid, int[] weights, int days ){
        int d = 1;
        int currSum = 0;
        for(int w : weights){
           
           if(currSum + w >  mid){
                d++;
                currSum = 0;
           }

           currSum += w;

           if(d > days){
                return false;
           }
        }

        return true;
    }
}