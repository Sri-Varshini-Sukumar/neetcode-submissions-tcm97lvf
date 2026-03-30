class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int total = 0;
        int count = 0;
        for(int i=0; i<k; i++){
            total += arr[i]; //6
        }

        if((total/k) >= threshold) count++;
        
        for(int i=k; i<n; i++){
            total -= arr[i-k];  //total = 6-2 = 4
            total += arr[i]; //6
            int avg = (total/k);
            if(avg >= threshold) count++;
        }
        
        return count;
    }
}