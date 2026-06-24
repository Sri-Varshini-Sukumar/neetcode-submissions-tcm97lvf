class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int n = nums.length;
        List<List<Integer>> lst = new ArrayList<>();
        Arrays.sort(nums);
        lst.add(new ArrayList<>());

        int start = 0, end = 0;
        for(int i=0; i<n; i++){
            start = 0;
            int size = lst.size();
            if(i > 0 && nums[i] == nums[i-1]){
                start = end+1;
            }
            end = size-1;
            for(int j=start; j<size; j++){
                List<Integer> list1 = new ArrayList<>(lst.get(j));
                list1.add(nums[i]);
                lst.add(list1);
            }
        }

        return lst;
    }
}
