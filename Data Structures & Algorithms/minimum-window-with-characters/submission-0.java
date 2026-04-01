class Solution {
    private boolean contains(int[] mapT, int[] mapS){
        for(int i=0; i<128; i++){
            if(mapT[i] > mapS[i]) return false;
        }
        return true;
    }
    public String minWindow(String s, String t) {
        int[] mapS = new int[128];
        int[] mapT = new int[128];

        for(int i=0; i<t.length(); i++){
            mapT[t.charAt(i)]++;
        }

        int right = 0;
        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;

        for(; right<s.length(); right++){
            mapS[s.charAt(right)]++;

            while(contains(mapT,mapS)){
                if(right-left+1 < minLen){
                    minLen = right-left+1;
                    minStart = left;
                }
                mapS[s.charAt(left++)]--;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart,minStart+minLen);
    }
}
