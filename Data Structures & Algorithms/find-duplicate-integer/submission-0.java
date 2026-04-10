class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> hmp = new HashMap<>();

        for(int i : nums){
            hmp.put(i,hmp.getOrDefault(i,0)+1);
        }

        for(int i : hmp.keySet()){
            if(hmp.get(i) > 1){
                return i;
            }
        }
        return -1;

    }
}