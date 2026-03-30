class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int res = -1;
        int freq = 0;
        HashMap<Integer,Integer> hmp = new HashMap<>();

        for(int i=0; i<n; i++){
            hmp.put(nums[i],hmp.getOrDefault(nums[i],0)+1);
        }

        for(int i : hmp.keySet()){
            if(hmp.get(i) > n/2){
                res = i;
            }
        }
        return res;
    }
}