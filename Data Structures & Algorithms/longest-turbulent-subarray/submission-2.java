class Solution {
    public int maxTurbulenceSize(int[] arr) {
        String prev = "";
        int n = arr.length;
        int j = 1;
        int i = 0;
        int res = 1;
        while(j < n){
            if(arr[j-1] > arr[j] && prev != ">"){
                res = Math.max(res,j-i+1);
                j++;
                prev = ">";
            }else if(arr[j-1] < arr[j] && prev != "<"){
                res = Math.max(res,j-i+1);
                j++;
                prev = "<";
            }else{
                if(arr[j] == arr[j-1]){
                    j = j+1;
                }
                i = j-1;
                prev = "";
            }
        }

        return res;
    }
}