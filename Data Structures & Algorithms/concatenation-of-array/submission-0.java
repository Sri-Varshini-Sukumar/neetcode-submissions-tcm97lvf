class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] res = new int[n+n];

        for(int i=0; i<(n+n); i++){
            res[i] = nums[i%n];
        }

        return res;
    }
}