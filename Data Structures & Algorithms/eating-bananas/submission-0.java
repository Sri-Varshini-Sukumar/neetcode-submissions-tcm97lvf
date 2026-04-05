class Solution {
    public int findMax(int[] piles){
        int n = piles.length;
        int maxi = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            maxi = Math.max(maxi,piles[i]);
        }
        
        return maxi;
    }
    
    public int findCompleteHours(int[] piles, int min){
        int total = 0;
        for(int i=0; i<piles.length; i++){
            total += Math.ceil((double)(piles[i])/(double)(min));
        }
        return total;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int low = 1;
        int high = findMax(piles);
        int ans = 0;
        while(low <= high){
            int mid = (low+high)/2;
            int total = findCompleteHours(piles,mid); 
            if(total <= h){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
}