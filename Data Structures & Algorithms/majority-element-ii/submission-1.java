class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> hmp = new HashMap<>();
        List<Integer> lst = new ArrayList<>();
        for(int i : nums){
            hmp.put(i,hmp.getOrDefault(i,0)+1);
        }
        for(int i : hmp.keySet()){
            if(hmp.get(i) > nums.length/3){
                lst.add(i);
            }
        }
        return lst;
    }
}