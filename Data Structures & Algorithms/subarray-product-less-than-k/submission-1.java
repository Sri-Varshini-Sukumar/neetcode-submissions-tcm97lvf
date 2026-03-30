class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int r=0;
        int l=0;
        int n = nums.length;
        long prod = 1;
        int count = 0;
        while(r<n){
            prod *= nums[r];
            while(l <= r && prod >= k){
                prod /= nums[l];
                l++;
            }
            count += (r-l+1);
            r++;
        }
        return count;
    }
}

// public class Solution {
//     public int numSubarrayProductLessThanK(int[] nums, int k) {
//         int res = 0, l = 0;
//         long product = 1;
//         for (int r = 0; r < nums.length; r++) {
//             product *= nums[r];
//             while (l <= r && product >= k) {
//                 product /= nums[l++];
//             }
//             res += (r - l + 1);
//         }
//         return res;
//     }
// }