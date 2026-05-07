class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> hmp = new HashMap<>();

        for(int i : nums){
            hmp.put(i,hmp.getOrDefault(i,0)+1);
        }

        int count = 0;
        for(int i : hmp.keySet()){
            int val = hmp.get(i);
            if(val == 1) return -1;

            count += val/3;
            if(val%3 != 0) count++;
        }

        return count;
    }
}