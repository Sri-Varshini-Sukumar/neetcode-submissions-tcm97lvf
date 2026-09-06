class Solution {
    public int appendCharacters(String s, String t) {
        int s_len = s.length();
        int t_len = t.length();

        if(t_len == 1 && s_len != 1){
            if(s.indexOf(t.charAt(0)) != -1) return 0;
            else return t_len;
        }

        if(s_len == 1 && t_len != 1){
            if(t.indexOf(s.charAt(0)) != -1) return t_len-1;
            else return t_len;
        }

        int i = 0, j = 0;

        while(i < s_len && j < t_len){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }else{
                i++;
            }
        }

        return t_len - j;
    }
}