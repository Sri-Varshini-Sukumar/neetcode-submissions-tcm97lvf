class Solution {
    public void findPermute(int[] nums,List<Integer> ds,List<List<Integer>> res,
    boolean[] freq){
        if(ds.size() == nums.length){
            res.add(new ArrayList<>(ds));
            return;
        }

        for(int i=0; i<nums.length; i++){
            if(!freq[i]){
                freq[i] = true;
                ds.add(nums[i]);
                findPermute(nums,ds,res,freq);
                ds.remove(ds.size()-1);
                freq[i] = false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        findPermute(nums,ds,res,freq);
        return res;
    }
}
