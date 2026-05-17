class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int n = nums.length;
        int res = 1;
        //8,2,4,7 -- > mini = 8, maxi = 8
        //mini = 2, maxi = 8
        for(int i=0; i<n; i++){
            //mini = 2, maxi = 4
            int mini = nums[i], maxi = nums[i];
            for(int j=i+1; j<n; j++){
                mini = Math.min(mini,nums[j]);
                maxi = Math.max(maxi,nums[j]);
                if(maxi - mini > limit){
                    break;
                }
                res = Math.max(res,j-i+1);
            }
        }
        //i = 1 --> j = 2 to 3
        //8 --> 2,4,7 --> 8-4 = 4 > 4 ---> 
        return res;
    }
}