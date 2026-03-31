class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder res = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch >= 'a' && ch <= 'z'){
                res.append(ch);
            }else if(ch >= '0' && ch <= '9'){
                res.append(ch);
            }
        }

        String str = res.toString();
        int l = 0;
        int r = str.length()-1;

        while(l <= r){
            if(str.charAt(l) != str.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
