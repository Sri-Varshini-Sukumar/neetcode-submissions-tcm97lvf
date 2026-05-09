class Solution {
    public int firstMissingPositive(int[] a) {

        // [3, -3, 6, 3]
        // [3,0,6,3]
        // [a[2] > 0 --> a[2] = -6]
        //[3,0,-6,3]
        //

        //[3,-5,-6,3]
        //[3,-5,-6,3]
        for(int i=0; i<a.length; i++){
            if(a[i] < 0) a[i] = 0;
        }

        for(int i=0; i<a.length; i++){
            int val = Math.abs(a[i]);
            if (val >= 1 && val <= a.length){
                if(a[val-1] > 0){
                    a[val-1] *= -1;
                }else if(a[val-1] == 0){
                    a[val-1] = -1 * (a.length+1);
                }
            }
        }

        //[3,-5,-6,3] 
        //3>=0

        for(int i=1; i<a.length+1; i++){
            if(a[i-1] >= 0){
                return i;
            }
        }

        return a.length+1;
    }
}