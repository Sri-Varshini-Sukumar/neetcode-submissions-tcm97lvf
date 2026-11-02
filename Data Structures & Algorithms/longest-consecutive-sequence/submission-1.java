class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Boolean> hmp = new HashMap<>();
        int longestLength = 0;
        int currLength = 0;
        for(int i : nums){
            hmp.put(i,Boolean.FALSE);
        }

        for(int num : nums){
            currLength = 1;
            int nextNum = num+1;
            while(hmp.containsKey(nextNum) && hmp.get(nextNum) == false){
                hmp.put(nextNum,true);
                currLength++;
                nextNum++;
            }

            int prevNum = num-1;
            while(hmp.containsKey(prevNum) && hmp.get(prevNum) == false){
                hmp.put(prevNum,true);
                currLength++;
                prevNum--;
            }

            longestLength = Math.max(longestLength,currLength);
        }

        return longestLength;
    }
}
