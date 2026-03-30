class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int n = s.length();
        HashMap<Character,Integer> hmp = new HashMap<>();
        int l=0;
        int max = -1;
        for(int r=0; r<n; r++){
            char ch = s.charAt(r);
            hmp.put(ch,hmp.getOrDefault(ch,0)+1);

            while(hmp.size() > k){
                hmp.put(s.charAt(l),hmp.get(s.charAt(l))-1);
                if(hmp.get(s.charAt(l)) == 0){
                    hmp.remove(s.charAt(l));
                }
                l++;
            }
            max = Math.max(max,r-l+1);
        }
        return max;
    }
}
