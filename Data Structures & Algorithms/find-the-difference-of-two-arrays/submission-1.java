class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        int n = nums1.length;
        List<Integer> lst1 = new ArrayList<>();
        List<Integer> lst2 = new ArrayList<>();

        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();

        for(int i : nums1){
            hs1.add(i);

        }
        for(int i : nums2) hs2.add(i);
        
        for(int i : hs1){
            if(!hs2.contains(i)) lst1.add(i);
        }

        for(int i : hs2){
            if(!hs1.contains(i)) lst2.add(i);
        }
        return Arrays.asList(lst1,lst2);
    }
}