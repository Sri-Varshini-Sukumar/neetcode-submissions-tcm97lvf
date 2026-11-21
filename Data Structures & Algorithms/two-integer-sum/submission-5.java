class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hmp = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int cmp = target - nums[i];
            if(hmp.containsKey(cmp)){
                return new int[]{hmp.get(cmp),i};
            }
            hmp.put(nums[i],i);
        }

        return new int[]{-1,-1};
    }
}
