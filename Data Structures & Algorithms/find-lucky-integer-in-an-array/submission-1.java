class Solution {
    public int findLucky(int[] arr) {
        int n = arr.length;
        HashMap<Integer,Integer> hmp = new HashMap<>();

        for(int i=0; i<n; i++){
            hmp.put(arr[i],hmp.getOrDefault(arr[i],0)+1);
        }

        int max = -1;
        for(int i : hmp.keySet()){
            if(hmp.get(i) == i){
                max = Math.max(max,i);
            }
        }
        
        return max;
    }
}