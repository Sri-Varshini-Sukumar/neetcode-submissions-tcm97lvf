class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int res = 0;
        int num = x;
        while(x != 0){
            int digit = x%10;
            res = (res*10) + digit;
            x /= 10;
        }
        return (num == res);
    }
}