class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int l = 0;
        int max = 0;
        HashSet<Character> hs = new HashSet<>();
        for(int r=0; r<s.length(); r++){
            while(hs.contains(s.charAt(r))){
                hs.remove(s.charAt(l));
                l++;
            }
            hs.add(s.charAt(r));
            max = Math.max(max,r-l+1);
        }
        return max;
    }
}
