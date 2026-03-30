class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int zeroesCount = 0;
        int end = 0;
        int start = 0;
        int maxi = Integer.MIN_VALUE;
        while(end < n){
            if(nums[end] == 0){
                zeroesCount++;
            }

            while(zeroesCount > k){
                if(nums[start] == 0){
                    zeroesCount--;
                }
                start++;
            }
            maxi = Math.max(maxi,end-start+1);
            end++;
        }
        return maxi;
    }
}