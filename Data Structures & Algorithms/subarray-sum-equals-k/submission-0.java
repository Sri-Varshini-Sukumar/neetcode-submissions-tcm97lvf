class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> hmp = new HashMap<>();
        int currsum = 0;
        int count = 0;
        for(int i=0; i<n; i++){
            currsum += nums[i];
            if(currsum == k) count++;
            if(hmp.containsKey(currsum-k)){
                count += hmp.get(currsum-k);
            }
            hmp.put(currsum,hmp.getOrDefault(currsum,0)+1);
        }
        return count;
    }
}