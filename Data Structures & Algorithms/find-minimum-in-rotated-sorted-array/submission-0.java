class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int res = Integer.MAX_VALUE;

        while(low <= high){
            int mid = (low + high)/2;
            if(nums[low] <= nums[high]){
                res = Math.min(res,nums[low]);
                break;
            }
            if(nums[low] <= nums[mid]){
                res = Math.min(res,nums[low]);
                low = mid+1;
            }else if(nums[mid] <= nums[high]){
                high = mid-1;
                res = Math.min(res,nums[mid]);
            }
        }

        return res;
    }
}
