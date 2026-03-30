class Solution {
    public int canPlace(int[] weights, int limit, int days){
        int n = weights.length;
        int count = 1;
        int sum = 0;
        //1 - 10 --> 11/2 = 5
        for(int i=0; i<n; i++){
            if(sum + weights[i] <= limit){
                sum += weights[i];
            }else{
                count++;
                sum = weights[i];
            }
        }
        return count;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int low = 0;
        int high = 0;
        
        for(int i=0; i<n; i++){
            if(weights[i] > low) low = weights[i];
            high += weights[i];            
        }

        while(low <= high){
            int mid = (low + high)/2;
            int res = canPlace(weights,mid,days);
            if(res <= days){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }

        return low;
    }
}