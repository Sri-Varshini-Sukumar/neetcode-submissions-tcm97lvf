class Solution {
    public int robHelp(int[] nums){
        int n = nums.length;
        if(n == 0) return 0;
        if(n == 1) return nums[0];
        if(n == 2) return Math.max(nums[0],nums[1]);
        int[] dp = new int[n];
        dp[0] = nums[0]; //1
        dp[1] = Math.max(nums[0],nums[1]);  //2
        for(int i=2; i<n; i++){
            dp[i] = Math.max(dp[i-1],dp[i-2] + nums[i]);
        }

        return dp[n-1];

    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n < 2) return nums[0];
        int[] skipFirstHouse = new int[n-1];
        int[] skipLastHouse = new int[n-1];

        for(int i=0; i<n-1; i++){
            skipFirstHouse[i] = nums[i+1];
            skipLastHouse[i] = nums[i];
        }

        int r1 = robHelp(skipFirstHouse);
        int r2 = robHelp(skipLastHouse);
        return Math.max(r1,r2);
    }
}
