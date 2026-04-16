class Solution {
    public void moveZeroes(int[] nums) {
        int count = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0) count++;
        }

        int j = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[j++] = nums[i];
            }
        }
        int k = 0;
        while(k < count){
            nums[j++] = 0;
            k++;
        }
    }
}