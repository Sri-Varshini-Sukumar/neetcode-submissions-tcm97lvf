class Solution {
    public int missingNumber(int[] nums) {
        int actual_sum = 0;
        int n = nums.length;
        int start = 0;
        int end = n;

        actual_sum = n * (n+1)/2;
        int arr_sum = 0;
        for(int i : nums) arr_sum += i;

        return actual_sum - arr_sum; 
    }
}
