class Solution {
    public boolean isSubsequence(String s, String t) {
        int sn = s.length();
        int tn = t.length();
        int ss = 0, tt = 0;
        while(ss < sn && tt < tn){
            if(s.charAt(ss) == t.charAt(tt)){
                ss++;
            }
            tt++;
        }
        
        return ss == s.length();
    }
}