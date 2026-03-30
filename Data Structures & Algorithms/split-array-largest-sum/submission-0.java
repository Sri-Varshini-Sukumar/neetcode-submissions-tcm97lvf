class Solution {
    public boolean canPlace(int[] nums, int all, int k){
        long sum = 0;
        int count = 0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i] + sum <= all){
                sum += nums[i];
            }else{
                count++;
                sum = nums[i];
            }
        }
        return count >= k;
    }
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int low = Integer.MIN_VALUE;
        int high = 0;
        //find maximum and sum
        for(int i=0; i<n; i++){
            if(nums[i] > low) low = nums[i];
            high += nums[i];
        }

        while(low <= high){
            int mid = (low + high)/2;
            if(canPlace(nums,mid,k)){
                low = mid + 1;
            }else{
                high = mid-1;
            }
        }
        return low;
    }
}