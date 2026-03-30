class Solution {
    public int maxFrequency(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        long ans = 0;
        long total = 0;
        int l = 0;
        for(int r=0; r<n; r++){
            total += nums[r];
            while(nums[r]*(r-l+1L) > total+k){
                total -= nums[l++];
            }
            ans = Math.max(ans,r-l+1L);
        }
        return (int) ans;
    }
}