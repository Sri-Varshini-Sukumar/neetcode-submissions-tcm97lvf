class Solution {
    public int removeElement(int[] nums, int val) {
       int n = nums.length;
       int count = 0;

       for(int i : nums){
          if(i == val) count++;
       }
       int[] res = new int[n-count];
       int j = 0;
       for(int i=0; i<n; i++){
        if(nums[i] != val){
            nums[j++] = nums[i];
        }
       }
       return j;
    }
}