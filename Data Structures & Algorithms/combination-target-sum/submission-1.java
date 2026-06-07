class Solution {
    public void combination(int ind, int[] arr, int target, List<Integer> res,List<List<Integer>> lst){

        if(ind == arr.length){
            if(target == 0){
                lst.add(new ArrayList<>(res));
            } 
            return;
        }
 
        if(arr[ind] <= target){
            res.add(arr[ind]);
            combination(ind,arr,target-arr[ind],res,lst);
            res.remove(res.size()-1);
        }
        combination(ind+1,arr,target,res,lst);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n = candidates.length;

        List<List<Integer>> lst = new ArrayList<>();
        combination(0,candidates,target,new ArrayList<>(),lst);
        return lst;
    }
}