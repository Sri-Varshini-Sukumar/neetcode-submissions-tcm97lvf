class Solution {
    public void findcombination(int ind, int[] arr, int target,
     ArrayList<Integer> res, List<List<Integer>> lst){
        if(target == 0){
            lst.add(new ArrayList<>(res));
            return;
        }

        for(int i=ind; i<arr.length; i++){
            if(i > ind && arr[i] == arr[i-1]) continue;
            if(arr[i] > target) break;

            res.add(arr[i]);
            findcombination(i+1,arr,target-arr[i],res,lst);
            res.remove(res.size()-1);
        }
     }
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        List<List<Integer>> lst = new ArrayList<>();
        Arrays.sort(arr);
        findcombination(0,arr,target,new ArrayList<>(),lst);
        return lst;
    }
}