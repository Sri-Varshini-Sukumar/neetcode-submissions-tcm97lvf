class Solution {
    public int atMost(int[] nums, int k){
        HashMap<Integer,Integer> hmp = new HashMap<>();
        int res = 0;
        int l = 0;
        int r = 0;
        for(r=0; r<nums.length; r++){
            hmp.put(nums[r],hmp.getOrDefault(nums[r],0)+1);
            if(hmp.get(nums[r]) == 1){
                k--;
            }
            while(k < 0){
                hmp.put(nums[l],hmp.get(nums[l])-1);
                if(hmp.get(nums[l]) == 0) {
                    k++;
                }
                l++;
            }
            res += (r-l+1);
        }
        return res;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        int n = nums.length;
        int x = atMost(nums,k);
        int y = atMost(nums,k-1);
        return x-y;
    }
}