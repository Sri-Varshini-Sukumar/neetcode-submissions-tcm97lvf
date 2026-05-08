class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int start = 0;
        int end = 0;
        String res = "";
        
        for(int i=0; i<n; i++){
            start = i;
            end = i;
            while(start >= 0 && end < n && s.charAt(start) == s.charAt(end)){
                start--;
                end++;
            }
            String temp = s.substring(start+1,end);
            if(temp.length() > res.length()) res = temp;

            start = i;
            end = i+1;
            while(start >= 0 && end < n && s.charAt(start) == s.charAt(end)){
                start--;
                end++;
            }
            temp = s.substring(start+1,end);
            if(temp.length() > res.length()) res = temp;
        }
        return res;
    }
}
