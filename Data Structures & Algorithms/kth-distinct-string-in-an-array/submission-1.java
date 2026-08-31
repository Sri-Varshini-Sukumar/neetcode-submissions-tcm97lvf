class Solution {
    public String kthDistinct(String[] arr, int k) {
        int n = arr.length;

        HashMap<String,Integer> hmp = new HashMap<>();

        for(int i=0; i<n; i++){
            hmp.put(arr[i],hmp.getOrDefault(arr[i],0)+1);
        }

        //d --> 1, b --> 2, c --> 2, a --> 2
        int res = 1;
        for(int i=0; i<n; i++){
            if(hmp.get(arr[i]) == 1){
                if(res == k) return arr[i];
                else{
                    res++;
                }
            }
        }
        return "";
    }
}