class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = 0;
        int currsum = 0;
        int res = Integer.MAX_VALUE;
        while(r < n){
            currsum += nums[r];
            while(currsum >= target){
                res = Math.min(res,r-l+1);
                currsum -= nums[l];
                l++;
            }
            r++;
        }
        return (res == Integer.MAX_VALUE) ? 0 : res;
    }
}