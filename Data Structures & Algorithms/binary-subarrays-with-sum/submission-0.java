class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length;
        HashMap<Integer,Integer> hmp = new HashMap<>();
        int count = 0;
        int currsum = 0;
        for(int i=0; i<n; i++){
            currsum += nums[i];
            if(currsum == goal) count++;

            if(hmp.containsKey(currsum-goal)) count += hmp.get(currsum-goal);

            hmp.put(currsum,hmp.getOrDefault(currsum,0)+1);
        }

        return count;
    }
}