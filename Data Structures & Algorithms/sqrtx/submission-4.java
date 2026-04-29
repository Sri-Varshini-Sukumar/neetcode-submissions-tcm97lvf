class Solution {
    public int mySqrt(int x) {
        if(x < 2) return x;
        int low = 1;
        int high = x/2;
        int ans = 0;

        while(low <= high){
            int mid = low+(high-low)/2; // 2
            long res = (long) mid*mid; 
            if(res == x){
                return mid;
            }else if(res > x){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return high;
    }
}